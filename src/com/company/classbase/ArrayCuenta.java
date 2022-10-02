package com.company.classbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public final class ArrayCuenta implements ArrayInterface<Cuenta> {

    private ArrayList<Cuenta> aCuenta = null;
    private static final String ruta = "archivos/cuentas.txt";

    public ArrayCuenta() {
        aCuenta = new ArrayList<>();
        cargar();
    }

    @Override
    public void agregar(Cuenta t) {
        aCuenta.add(t);
    }

    @Override
    public void eliminar(Cuenta t) {
        aCuenta.remove(t);
    }

    @Override
    public int getTamaño() {
        return aCuenta.size();
    }

    @Override
    public void grabar(Cuenta t) {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                pw.write(t.toString());
                pw.write(13);
                JOptionPane.showMessageDialog(null, "Operación exitosa");
            }
        } catch (IOException e) {
            System.out.println("Error " + getClass().getName());
        }
    }

    @Override
    public Cuenta buscar(String numero) {
        for (Cuenta cuenta : aCuenta) {
            if (cuenta.getNumeroCuenta().equals(numero)) {
                return cuenta;
            }
        }
        return null;
    }

    @Override
    public void cargar() {
        try {
            File file = new File(ruta);
            if (file.exists()) {
                try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String string;
                    while ((string = br.readLine()) != null) {
                        StringTokenizer st = new StringTokenizer(string, "/");
                        String numeroCuenta = st.nextToken().trim();
                        String contraseña = st.nextToken().trim();
                        String dniCliente = st.nextToken().trim();
                        String numeroTarjeta = st.nextToken().trim();
                        String tipo = st.nextToken().trim();
                        agregar(new Cuenta(numeroCuenta, contraseña, dniCliente, numeroTarjeta, tipo));
                    }
                    br.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error " + getClass().getName() + ", " + e);
        }
    }

    @Override
    public void grabar() {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                for (Cuenta c : aCuenta) {
                    pw.println(c.toString());
                }
                pw.close();
            }
            JOptionPane.showMessageDialog(null, "Operación exitosa");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public ArrayList<Cuenta> getArrayList() {
        return aCuenta;
    }

}
