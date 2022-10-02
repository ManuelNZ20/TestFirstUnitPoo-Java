package com.company.classbase;

public class GenerarNumeros {

    static ArrayCuenta arrayCuenta = new ArrayCuenta();
    static ArrayTarjetaCredito tarjetaCredito = new ArrayTarjetaCredito();
    static ArrayTarjetaDebito tarjetaDebito = new ArrayTarjetaDebito();
    static ArrayComprobanteTransaccion transaccion = new ArrayComprobanteTransaccion();

    public static String generarNumeroCuenta() {
        String numeroCuenta = "";
        do {
            numeroCuenta = String.valueOf((long) (((Math.random())) * (9999999999l - 1111111111l + 1) + 1111111111l));
        } while (arrayCuenta.buscar(numeroCuenta) != null);
        return numeroCuenta;
    }

    public static String generarNumeroTarjeta() {
        String numeroTarjeta = "";
        do {
            numeroTarjeta = String.valueOf((long) (((Math.random())) * (9999999999999999l - 1111111111111111l + 1) + 1111111111111111l));
        } while (GenerarNumeros.tarjetaCredito.buscar(numeroTarjeta) != null && GenerarNumeros.tarjetaDebito.buscar(numeroTarjeta) != null);
        return numeroTarjeta;
    }

    public static String generaContraseña() {
        String contraseña = "";
        boolean cl = false;
        do {
            contraseña = String.valueOf((int) ((Math.random() * 9999 - 1111 + 1) + 1111));
            for (Cuenta c : arrayCuenta.getArrayList()) {
                if (c.getContraseña().equals(contraseña)) {
                    cl = true;
                }
            }
        } while (cl);
        return contraseña;
    }

    public static String generaCodigoSeguridadCredito() {
        String cSeguridad = "";
        boolean cl = false;
        do {
            cSeguridad = String.valueOf((long) ((Math.random() * 99999999999l - 11111111111l + 1) + 11111111111l));
            for (TarjetaCredito tCredito : tarjetaCredito.getArrayList()) {
                if (tCredito.getCodigoSeguridad().equals(cSeguridad)) {
                    cl = true;
                }
            }
        } while (cl);
        return cSeguridad;
    }

    public static String generaCodigoSeguridadDebito() {
        String cSeguridad = "";
        boolean cl = false;
        do {
            cSeguridad = String.valueOf((long) ((Math.random() * 99999999999l - 11111111111l + 1) + 11111111111l));
            for (TarjetaDebito tDebito : tarjetaDebito.getArrayList()) {
                if (tDebito.getCodigoSeguridad().equals(cSeguridad)) {
                    cl = true;
                }
            }
        } while (cl);
        return cSeguridad;
    }

    public static String generaCodigoComprobante() {
        String codigo = "";
        do {
            codigo = String.valueOf((long) ((Math.random() * 99999l - 11111l + 1) + 11111l));
        } while (transaccion.buscar(codigo) != null);
        return codigo;
    }

}
