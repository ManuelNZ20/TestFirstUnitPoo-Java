package com.company.classbase;

public class ComprobanteRetiro extends Comprobante {

    private float dineroUtilizado;
    private float saldoDisponible;

    public ComprobanteRetiro(String codigoComprobante, String dni, String tipoCuenta, String numeroCuenta, String numeroTarjeta, float dineroUtilizado, float saldoDisponible) {
        super(codigoComprobante, dni, tipoCuenta, numeroCuenta, numeroTarjeta);
        this.dineroUtilizado = dineroUtilizado;
        this.saldoDisponible = saldoDisponible;
    }

    public float getDineroUtilizado() {
        return dineroUtilizado;
    }

    public void setDineroUtilizado(float dineroUtilizado) {
        this.dineroUtilizado = dineroUtilizado;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return this.getCodigoComprobante() + "/" + this.getDni() + "/" + this.getTipoCuenta() + "/" + this.getNumeroCuenta() + "/" + this.getNumeroTarjeta() + "/" + this.getDineroUtilizado() + "/" + this.getSaldoDisponible();
    }

}
