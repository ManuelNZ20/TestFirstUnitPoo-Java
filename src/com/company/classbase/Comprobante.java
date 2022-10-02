package com.company.classbase;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Comprobante {

    private String codigoComprobante;
    private String dni;
    private String tipoCuenta;
    private String numeroCuenta;
    private String numeroTarjeta;
    private String fecha;

    public Comprobante(String codigoComprobante, String dni, String tipoCuenta, String numeroCuenta, String numeroTarjeta) {
        this.codigoComprobante = codigoComprobante;
        this.dni = dni;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.numeroTarjeta = numeroTarjeta;
        fecha = new SimpleDateFormat("dd-MMM-aaaa hh:mm:ss a").format(new Date());
    }

    public String getCodigoComprobante() {
        return codigoComprobante;
    }

    public void setCodigoComprobante(String codigoComprobante) {
        this.codigoComprobante = codigoComprobante;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "codigoComprobante=" + codigoComprobante + ", dni=" + dni + ", tipoCuenta=" + tipoCuenta + ", numeroCuenta=" + numeroCuenta + ", numeroTarjeta=" + numeroTarjeta + '}';
    }

}
