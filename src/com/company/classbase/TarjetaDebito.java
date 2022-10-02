package com.company.classbase;

import javax.swing.JOptionPane;

public class TarjetaDebito extends Tarjeta {

    private float saldo;

    public TarjetaDebito(String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta) {
        super(numeroTarjeta, codigoSeguridad, fechaVencimiento, tipo, numeroCuenta);
    }

    //uso para tomar los datos del archivo
    public TarjetaDebito(float saldo, String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta) {
        this(numeroTarjeta, codigoSeguridad, fechaVencimiento, tipo, numeroCuenta);
        this.saldo = saldo;
    }

    public void setRetirar(float retiro) {
        if (retiro > 0) {
            if (retiro <= saldo) {
                this.saldo -= retiro;
                return;
            } else {
                JOptionPane.showMessageDialog(null, "No puedes retirar esa cantidad");
            }
            JOptionPane.showMessageDialog(null, "Valor incorrecto");
        }
    }

    public void setIngresos(float ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            return;
        }
        JOptionPane.showMessageDialog(null, "Valor incorrecto");
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return this.getNumeroTarjeta() + "/"
                + this.getCodigoSeguridad() + "/"
                + this.getFechaVencimiento() + "/"
                + this.getTipo() + "/"
                + this.getNumeroCuenta() + "/"
                + this.getSaldo();
    }

    @Override
    public String showDate() {
        return "N° Tarjeta: " + this.getNumeroTarjeta() + "\n"
                + "Codigo seguridad: " + this.getCodigoSeguridad() + "\n"
                + "Fecha vencimiento: " + this.getFechaVencimiento() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "N° cuenta: " + this.getNumeroCuenta() + "\n"
                + "Saldo: " + this.getSaldo();
    }
}
