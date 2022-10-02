package com.company.classbase;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author MANUEL
 * @version 1.0
 * @created 19-sep.-2022 09:02:40 a. m.
 */
public class Fecha {

    private short año;
    private byte dia;
    private byte mes;

    public Fecha() {
        asignarFecha();

    }

    public void finalize() throws Throwable {

    }

    public void asignarFecha() {
        GregorianCalendar fecha = new GregorianCalendar();
        dia = (byte) fecha.get(Calendar.DAY_OF_MONTH);
        mes = (byte) (fecha.get(Calendar.MONTH) + 1);
        año = (short) fecha.get(Calendar.YEAR);
    }

    public void asignarFecha(byte dia) {
        asignarFecha();
        this.dia = dia;
    }

    public void asignarFecha(byte dia, byte mes) {
        asignarFecha();
        this.dia = dia;
        this.mes = mes;
    }

    public void asignarFecha(byte dia, byte mes, short año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String obtenerFecha() {
        return dia + "/" + mes + "/" + año;
    }

    public String renovarFecha() {
        asignarFecha(this.dia, this.mes, (short) (this.año + 1));
        return dia + "-" + mes + "-" + año;
    }

}//end Fecha
