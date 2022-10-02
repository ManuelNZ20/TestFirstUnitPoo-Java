package com.company.classbase;

public abstract class Tarjeta {

    private String numeroTarjeta;
    private String codigoSeguridad;
    private String fechaVencimiento;
    private String tipo;
    private String numeroCuenta;

    public Tarjeta(String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta) {
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean condicionRenovacion() {
        return fechaVencimiento.equals(new Fecha().obtenerFecha());
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void renovarFecha() {
        if (condicionRenovacion()) {
            Fecha fecha = new Fecha();
            this.setFechaVencimiento(fecha.renovarFecha());
        }
    }

    public abstract String showDate();
}
