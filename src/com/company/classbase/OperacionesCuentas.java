package com.company.classbase;

import javax.swing.JOptionPane;

public class OperacionesCuentas {

    public static ArrayCliente arrayCliente = new ArrayCliente();
    public static ArrayCuenta arrayCuenta = new ArrayCuenta();
    public static ArrayTarjetaCredito credito = new ArrayTarjetaCredito();
    public static ArrayTarjetaDebito debito = new ArrayTarjetaDebito();

    //OPERACIONES CUENTAS
    //De los objetos ya creado como la cuenta del cliente y el cliente - asigno una nueva cuenta al client
    //luego de asignar la cuenta al cliente grabo los datos obtenidos de la clase ArrayCuenta y ArrayCliente y la clase ArrayTarjetaCredito ó ArrayTarjetaDebito
    public static void asignarNuevaCuenta(Cuenta cuenta, String dni, Tarjeta tarjeta) {
        Cliente c = arrayCliente.buscar(dni);
        if (c != null) {
            if (c.getNCuentas() < Cliente.limite) {
                if (tarjeta instanceof TarjetaCredito) {
                    c.setNumeroCuentas(cuenta.getNumeroCuenta());
                    arrayCliente.grabar();
                    arrayCuenta.agregar(cuenta);
                    arrayCuenta.grabar();
                    credito.agregar((TarjetaCredito) tarjeta);
                    credito.grabar();
                } else if (tarjeta instanceof TarjetaDebito) {
                    c.setNumeroCuentas(cuenta.getNumeroCuenta());
                    arrayCliente.grabar();
                    arrayCuenta.agregar(cuenta);
                    arrayCuenta.grabar();
                    debito.agregar((TarjetaDebito) tarjeta);
                    debito.grabar();
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salio mal al asignar cuentas");
                    return;
                }
                JOptionPane.showMessageDialog(null, "N° de cuentas: " + c.getNCuentas());
            } else {
                JOptionPane.showMessageDialog(null, "El cliente " + c.getNombre() + " identificado con el DNI " + dni + " \n" + "\"ya posee 3 cuentas no es posible asignar más\"");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }

    public static void eliminarCuenta(Cuenta cuenta, Cliente cliente) {
        Cliente cl = arrayCliente.buscar(cliente.numeroCuentas());
        if (cliente.getNCuentas() == 1) {//Si el cliente tiene unicamente una cuenta se elimina al cliente de la lista y grabo
            arrayCuenta.eliminar(cuenta);
            arrayCuenta.grabar();
            cl.setCuentas(new String[3]);
            cl.setNCuentas((byte) 0);
            arrayCliente.grabar();
            JOptionPane.showMessageDialog(null, "El cliente ya no posee más cuentas");
        } else {
            int i = 0;
            for (i = 0; i < cl.getCuentas().length; i++) {
                if (cl.getCuentas()[i].equalsIgnoreCase(cuenta.getNumeroCuenta())) {
                    break;
                }
            }
            for (int j = i; j < Cliente.limite - 1; j++) {
                cl.renovarCuentas(j, cl.getCuentas()[j + 1]);
            }
            cl.setNCuentas((byte) (cl.getNCuentas() - 1));
            arrayCliente.grabar();
            arrayCuenta.eliminar(cuenta);
            arrayCuenta.grabar();
        }

    }

    public static Cuenta buscarCuenta(String numeroCuenta) {
        return arrayCuenta.buscar(numeroCuenta);
    }

}
