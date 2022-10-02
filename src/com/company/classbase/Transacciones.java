package com.company.classbase;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Transacciones {

    static int numeroTransacciones = 0;
    static ArrayTarjetaDebito tarjetaDebito = new ArrayTarjetaDebito();
    static ArrayTarjetaCredito tarjetaCredito = new ArrayTarjetaCredito();
    static ArrayComprobanteTransaccion transaccion = new ArrayComprobanteTransaccion();
    static ComprobanteTransaccion comprobanteTransaccion;
    static ArrayCuenta cuentas = new ArrayCuenta();

    public static String Retiro(String dni, String numeroTarjeta, float retirado) {
        TarjetaDebito tarjeta = tarjetaDebito.buscar(numeroTarjeta);
        if (!tarjeta.condicionRenovacion()) {
            tarjeta.setRetirar(retirado);
            float saldoActual = tarjeta.getSaldo();
            tarjetaDebito.grabar();
            comprobanteTransaccion = new ComprobanteTransaccion(GenerarNumeros.generaCodigoComprobante(), dni, "Débito", tarjeta.getNumeroCuenta(), numeroTarjeta, retirado, saldoActual);
            transaccion.agregar(comprobanteTransaccion);
            transaccion.grabar();
            return comprobanteTransaccion.imprimirVoucher("retirado");
        } else {
            JOptionPane.showMessageDialog(null, "Se encuentra fuera de la fecha de vencimiento");
        }
        return "";
    }

    public static String Deposito(String dni, String numeroTarjeta, float deposito) {
        TarjetaDebito tarjeta = tarjetaDebito.buscar(numeroTarjeta);
        if (!tarjeta.condicionRenovacion()) {
            tarjeta.setIngresos(deposito);
            float saldo = tarjeta.getSaldo();
            tarjetaDebito.grabar();//nota: generar los numero del comprobante de deposito
            comprobanteTransaccion = new ComprobanteTransaccion(GenerarNumeros.generaCodigoComprobante(), dni, "Débito", tarjeta.getNumeroCuenta(), numeroTarjeta, deposito, saldo);
            transaccion.agregar(comprobanteTransaccion);
            transaccion.grabar();
            return comprobanteTransaccion.imprimirVoucher("depositado");//imprimir el voucher de deposito
        }
        JOptionPane.showMessageDialog(null, "No puede realizar ninguna transacción debido a la fecha de vencimiento");
        return "";
    }

    public static String realizarTransaccion(String dni, String cuentaDestino, String numeroTarjeta, float envio) {
        Cuenta c = cuentas.buscar(cuentaDestino);
        if (c != null) {
            TarjetaDebito tarjetaDestino = tarjetaDebito.buscar(c.getNumeroTarjeta());
            if (tarjetaDestino.condicionRenovacion()) {
                if (!tarjetaDestino.getNumeroTarjeta().equals(numeroTarjeta)) {
                    TarjetaDebito tarjetaOrigen = tarjetaDebito.buscar(numeroTarjeta);
                    tarjetaDestino.setIngresos(envio);
                    tarjetaOrigen.setRetirar(envio);
                    tarjetaDebito.grabar();
                    comprobanteTransaccion = new ComprobanteTransaccion(GenerarNumeros.generaCodigoComprobante(), dni, "Débito", tarjetaOrigen.getNumeroCuenta(), numeroTarjeta, envio, tarjetaOrigen.getSaldo(), cuentaDestino);
                    transaccion.agregar(comprobanteTransaccion);
                    transaccion.grabar();
                    return comprobanteTransaccion.imprimirVoucherTransaccion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se encuentra fuera de la fecha de vencimiento");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
        }
        return "";
    }

    public static String Compra(String dni, String numeroTarjeta, float precio) {
        TarjetaCredito credito = tarjetaCredito.buscar(numeroTarjeta);
        if (credito != null) {
            if (credito.condicionRenovacion()) {
                credito.setUtilizarLinea(precio);
                tarjetaCredito.grabar();
                comprobanteTransaccion = new ComprobanteTransaccion(GenerarNumeros.generaCodigoComprobante(), dni, "Crédito", credito.getNumeroCuenta(), numeroTarjeta, precio, credito.getLineaDisponible());
                transaccion.agregar(comprobanteTransaccion);
                return comprobanteTransaccion.imprimirVoucher("Utilizado");
            } else {
                JOptionPane.showMessageDialog(null, "Se encuentra fuera de la fecha de vencimiento");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
        }
        return "";
    }

}
