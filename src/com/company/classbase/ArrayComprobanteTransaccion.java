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

public class ArrayComprobanteTransaccion implements ArrayInterface<ComprobanteTransaccion> {

    private static final String ruta = "archivos/transacciones.txt";
    ArrayList<ComprobanteTransaccion> aComprobante;

    public ArrayComprobanteTransaccion() {
        aComprobante = new ArrayList<>();
        cargar();
    }

    @Override
    public void agregar(ComprobanteTransaccion t) {
        aComprobante.add(t);
    }

    @Override
    public void eliminar(ComprobanteTransaccion t) {
        aComprobante.remove(t);
    }

    @Override
    public int getTamaño() {
        return aComprobante.size();
    }

    @Override
    public void grabar(ComprobanteTransaccion t) {///no aplica
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ComprobanteTransaccion buscar(String numero) {
        for (ComprobanteTransaccion c : aComprobante) {
            if (c.getCodigoComprobante().equals(numero) || c.getNumeroCuenta().equals(numero) || c.getDni().equals(numero) || c.getNumeroTarjeta().equals(numero)) {
                return c;
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
                        String codigoCuenta = st.nextToken().trim();
                        String dni = st.nextToken().trim();
                        String tipoCuenta = st.nextToken().trim();
                        String numeroCuenta = st.nextToken().trim();
                        String numeroTarjeta = st.nextToken().trim();
                        float dineroUtilizado = Float.parseFloat(st.nextToken().trim());
                        float dineroDisponible = Float.parseFloat(st.nextToken().trim());
                        String cuentaDestino = st.nextToken().trim();
                        agregar(new ComprobanteTransaccion(codigoCuenta, dni, tipoCuenta, numeroCuenta, numeroTarjeta, dineroUtilizado, dineroDisponible, cuentaDestino));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo " + ruta + " no existe");
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void grabar() {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                for (ComprobanteTransaccion t : aComprobante) {
                    pw.println(t.toString());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ArrayList<ComprobanteTransaccion> getArrayList() {
        return aComprobante;
    }

}
