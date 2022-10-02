package com.company.classbase;

import java.util.ArrayList;

public interface ArrayInterface <T> {
    
    void agregar(T t);
    void eliminar(T t);
    int getTamaño();
    void grabar(T t);
    T buscar(String numero);
    void cargar();
    void grabar();
    ArrayList<T> getArrayList();
}
