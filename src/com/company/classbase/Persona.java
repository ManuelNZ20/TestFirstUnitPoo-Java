package com.company.classbase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persona {

    private static final SimpleDateFormat parse = new SimpleDateFormat("dd-MM-yyyy");
    private String DNI;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private Date fechaNacimiento;

    public Persona(String DNI, String nombre, String apellido, String genero, String direccion, String fechaNacimiento) {
        try {
            this.DNI = DNI;
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
            this.direccion = direccion;
            this.fechaNacimiento = parse.parse(fechaNacimiento);
        } catch (ParseException e) {
            System.out.println("Error " + getClass().getName() + e.getMessage());
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return parse.format(fechaNacimiento);
    }

    public Date getFechaDate() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        try {
            this.fechaNacimiento = parse.parse(fechaNacimiento);
        } catch (ParseException ex) {
            System.out.println("Error fecha Nacimiento, clase Persona");
        }
    }

}
