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

public final class ArrayTarjetaCredito implements ArrayInterface<TarjetaCredito> {

    private static final String ruta = "archivos/tarjetascredito.txt";
    ArrayList<TarjetaCredito> aCredito;

    public ArrayTarjetaCredito() {
        aCredito = new ArrayList<>();
        cargar();
    }

    @Override
    public void agregar(TarjetaCredito t) {
        aCredito.add(t);
    }

    @Override
    public void eliminar(TarjetaCredito t) {
        aCredito.remove(t);
    }

    @Override
    public int getTamaño() {
        return aCredito.size();
    }

    @Override
    public void grabar(TarjetaCredito t) {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                pw.write(t.toString());
                pw.write(13);
                JOptionPane.showMessageDialog(null, "Operación exitosa");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error " + getClass().getName());
        }
    }

    @Override
    public TarjetaCredito buscar(String numero) {
        for (TarjetaCredito tarjetaCredito : aCredito) {
            if (tarjetaCredito.getNumeroTarjeta().equals(numero)) {
                return tarjetaCredito;
            }
        }
        return null;
    }

    @Override
    public void cargar() {
        try {
            File file = new File(ruta);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String string;
                    while ((string = br.readLine()) != null) {
                        StringTokenizer st = new StringTokenizer(string, "/");
                        String numeroTarjeta = st.nextToken().trim();
                        String getCodigoSegurida = st.nextToken().trim();
                        String fechaVencimiento = st.nextToken().trim();
                        String tipo = st.nextToken().trim();
                        String numeroCuenta = st.nextToken().trim();
                        float lineaAprobada = Float.valueOf(st.nextToken().trim());
                        float lineaDisponible = Float.valueOf(st.nextToken().trim());
                        float lineaUtilizada = Float.valueOf(st.nextToken().trim());
                        float pagoCuota = Float.valueOf(st.nextToken().trim());
                        byte cuotasPagadas = Byte.valueOf(st.nextToken().trim());
                        agregar(new TarjetaCredito(numeroTarjeta, getCodigoSegurida, fechaVencimiento, tipo, numeroCuenta, lineaAprobada, lineaDisponible, lineaUtilizada, pagoCuota, cuotasPagadas));
                    }
                }
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
                for (TarjetaCredito tarjetaCredito : aCredito) {
                    pw.println(tarjetaCredito.toString());
                }
                pw.close();
            }
            JOptionPane.showMessageDialog(null, "Operación exitosa");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + getClass().getName());

        }
    }

    @Override
    public ArrayList<TarjetaCredito> getArrayList() {
        return aCredito;
    }

}
