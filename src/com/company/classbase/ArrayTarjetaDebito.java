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

public final class ArrayTarjetaDebito implements ArrayInterface<TarjetaDebito> {

    private static final String ruta = "archivos/tarjetasdebito.txt";
    ArrayList<TarjetaDebito> aDebito;

    public ArrayTarjetaDebito() {
        aDebito = new ArrayList<>();
        cargar();
    }

    @Override
    public void agregar(TarjetaDebito t) {
        aDebito.add(t);
    }

    @Override
    public void eliminar(TarjetaDebito t) {
        aDebito.remove(t);
    }

    @Override
    public int getTamaño() {
        return aDebito.size();
    }

    @Override
    public void grabar(TarjetaDebito t) {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta), true)) {
                pw.write(t.toString());
                pw.write(13);
                JOptionPane.showMessageDialog(null, "Operación exitosa");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error " + getClass().getName());
        }
    }

    @Override
    public TarjetaDebito buscar(String numero) {
        for (int i = 0; i < aDebito.size(); i++) {
            if (aDebito.get(i).getNumeroTarjeta().equals(numero)) {
                return aDebito.get(i);
            }
        }
        return null;
    }

    @Override
    public void cargar() {
        try {
            File file = new File(ruta);
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String string;
                while ((string = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(string, "/");
                    String numeroTarjeta = st.nextToken().trim();
                    String getCodigoSegurida = st.nextToken().trim();
                    String fechaVencimiento = st.nextToken().trim();
                    String tipo = st.nextToken().trim();
                    String numeroCuenta = st.nextToken().trim();
                    float saldo = Float.valueOf(st.nextToken().trim());
                    agregar(new TarjetaDebito(saldo, numeroTarjeta, getCodigoSegurida, fechaVencimiento, tipo, numeroCuenta));
                }
//                System.out.println("Datos cargados");
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe Tarjeta Crédito");
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + getClass().getName());
        }
    }

    @Override
    public void grabar() {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                for (TarjetaDebito Debito : aDebito) {
                    pw.println(Debito.toString());
                }
                pw.close();
            }
            JOptionPane.showMessageDialog(null, "Operación exitosa");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + getClass().getName());

        }
    }

    @Override
    public ArrayList<TarjetaDebito> getArrayList() {
        return aDebito;
    }

}
