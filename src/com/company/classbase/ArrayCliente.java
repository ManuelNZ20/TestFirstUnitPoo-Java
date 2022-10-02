package com.company.classbase;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public final class ArrayCliente implements ArrayInterface<Cliente> {

    private static final String ruta = "archivos/clientes.txt";

    ArrayList<Cliente> aCliente;

    public ArrayCliente() {
        aCliente = new ArrayList<>();
        cargar();
    }

    @Override
    public void agregar(Cliente t) {
        aCliente.add(t);
    }

    @Override
    public void eliminar(Cliente t) {
        aCliente.remove(t);
    }

    @Override
    public int getTamaño() {
        return aCliente.size();
    }

    @Override
    public void grabar(Cliente t) {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta, true))) {
                pw.write(t.toString());
                pw.write(13);
                JOptionPane.showMessageDialog(null, "Operación exitosa");
            }
        } catch (IOException e) {
            System.out.println("Error " + getClass().getName());
        }
    }

    @Override
    public Cliente buscar(String numero) {
        for (Cliente c : aCliente) {
            String[] cuentas = c.numeroCuentas().split("-");
            for (String cuenta : cuentas) {
                if (cuenta.equals(numero) || c.getDNI().equals(numero)) {
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public void cargar() {
        try {
            File archivo = new File(ruta);
            if (archivo.exists()) {
                try ( BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String string;
                    while ((string = br.readLine()) != null) {
                        StringTokenizer st = new StringTokenizer(string, "/");
                        String DNI = st.nextToken().trim();
                        String nombre = st.nextToken().trim();
                        String apellido = st.nextToken().trim();
                        String genero = st.nextToken().trim();
                        String direccion = st.nextToken().trim();
                        String fechaNacimiento = st.nextToken().trim();
                        String cuentas = st.nextToken().trim();
                        byte nCuentas = Byte.valueOf(st.nextToken());
                        String Cuentas[] = cuentas.split("-");
                        agregar(new Cliente(DNI, nombre, apellido, genero, direccion, fechaNacimiento,Cuentas, nCuentas));
                    }
                    br.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }
        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error " + getClass().getName() + ", " + e);
        }
    }

    @Override
    public void grabar() {
        try {
            try ( PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
                for (Cliente c : aCliente) {
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
    public ArrayList<Cliente> getArrayList() {
        return aCliente;
    }

}
