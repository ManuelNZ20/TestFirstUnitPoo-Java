package com.company.classbase;

import static com.company.classbase.OperacionesCuentas.arrayCliente;

public class OperacionesCliente {

    public static void eliminarCliente(String dni) {
        Cliente c = arrayCliente.buscar(dni);
        arrayCliente.eliminar(c);
        arrayCliente.grabar();
    }

    public static void ModificarCliente(Cliente c, String direccion) {
        c.setDireccion(direccion);
        arrayCliente.grabar();
    }

    public static Cliente buscarCliente(String dni) {
        return arrayCliente.buscar(dni);
    }
}
