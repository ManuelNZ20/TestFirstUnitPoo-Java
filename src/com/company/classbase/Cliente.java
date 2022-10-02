package com.company.classbase;

import java.util.ArrayList;
import java.util.Arrays;

public final class Cliente extends Persona {

    private byte nCuentas = 0;
    public static final byte limite = 3;
    private String[] numeroCuentas = new String[limite];
    //se cargan los datos desde desde la clase ArrayCliente
    public Cliente(String DNI, String nombre, String apellido, String genero, String direccion, String fechaNacimiento, String[] numeroCuentas, byte nCuentas) {
        super(DNI, nombre, apellido, genero, direccion, fechaNacimiento);
        obtenerCuentas(numeroCuentas);
        this.nCuentas = nCuentas;
    }

    public String numeroCuentas() {
        String string = "";
        for (int i = 0; i < numeroCuentas.length; i++) {
            string += (numeroCuentas[i] + "-");
        }
        return string;
    }

    public void obtenerCuentas(String[] numeroCuentas) {
        this.numeroCuentas = new String[limite];
        System.arraycopy(numeroCuentas, 0, this.numeroCuentas, 0, numeroCuentas.length);
    }

    public String[] getCuentas() {
        return numeroCuentas;
    }

    public void setCuentas(String[] numeroCuentas) {
        this.numeroCuentas = numeroCuentas;
    }

    public void renovarCuentas(int pos, String numeroCuenta) {//se recorre las cuentas existentes
        this.numeroCuentas[pos] = numeroCuenta;
    }

    public void setNumeroCuentas(String nCuenta) {
        this.numeroCuentas[nCuentas++] = nCuenta;
    }

    public void setNCuentas(byte nCuentas) {
        this.nCuentas = nCuentas;
    }

    public byte getNCuentas() {
        return nCuentas;
    }

    @Override
    public String toString() {
        return this.getDNI() + "/" + this.getNombre() + "/" + this.getApellido() + "/"
                + this.getGenero() + "/" + this.getDireccion() + "/" + getFechaNacimiento() + "/" + numeroCuentas() + "/" + this.getNCuentas();
    }

}
