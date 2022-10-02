package com.company.classbase;

public class Cuenta {

    private String numeroCuenta;
    private String contraseña;
    private String dniCliente;
    private String numeroTarjeta;
    private String tipo;

    public Cuenta(String numeroCuenta, String contraseña, String dniCliente, String numeroTarjeta, String tipo) {
        this.numeroCuenta = numeroCuenta;
        this.contraseña = contraseña;
        this.dniCliente = dniCliente;
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.numeroCuenta + "/" +this.contraseña + "/" + this.dniCliente + "/" + this.numeroTarjeta + "/" + this.tipo;
    }

}
