package com.company.classbase;

public class ComprobanteTransaccion extends ComprobanteRetiro {

    private String cuentaDestino;

    public ComprobanteTransaccion(String codigoComprobante, String dni, String tipoCuenta, String numeroCuenta, String numeroTarjeta, float dineroUtilizado, float saldoDisponible, String cuentaDestino) {
        super(codigoComprobante, dni, tipoCuenta, numeroCuenta, numeroTarjeta, dineroUtilizado, saldoDisponible);
        this.cuentaDestino = cuentaDestino;
    }

    public ComprobanteTransaccion(String codigoComprobante, String dni, String tipoCuenta, String numeroCuenta, String numeroTarjeta, float dineroUtilizado, float saldoDisponible) {
        super(codigoComprobante, dni, tipoCuenta, numeroCuenta, numeroTarjeta, dineroUtilizado, saldoDisponible);
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public String toString() {
        return this.getCodigoComprobante() + "/" + this.getDni() + "/" + this.getTipoCuenta() + "/" + this.getNumeroCuenta() + "/" + this.getNumeroTarjeta() + "/" + this.getDineroUtilizado() + "/" + this.getSaldoDisponible() + "/" + this.getCuentaDestino() + "/" + this.getFecha();
    }

    public String imprimirVoucherTransaccion() {
        return "\nFecha y hora: " + this.getFecha() + "\nCódigo Comprobante: " + this.getCodigoComprobante() + "\nDNI: " + this.getDni() + "\nTipo cuenta: " + this.getTipoCuenta() + "\nN° cuenta: " + this.getNumeroCuenta() + "\nN° Tarjeta: " + this.getNumeroTarjeta() + "\nMonto: " + this.getDineroUtilizado()
                + "\nMontoDisponible: " + this.getSaldoDisponible() + "\nCuenta Destino: " + this.getCuentaDestino()
                + "\n-----------------------------------------------";
    }

    public String imprimirVoucher(String tipo) {
        return "\nFecha y hora: " + this.getFecha() + "\nCódigo Comprobante: " + this.getCodigoComprobante() + "\nDNI: " + this.getDni() + "\nTipo cuenta: " + this.getTipoCuenta() + "\nN° cuenta: " + this.getNumeroCuenta() + "\nN° Tarjeta: " + this.getNumeroTarjeta() + "\nMonto " + tipo + ": " + this.getDineroUtilizado()
                + "\nMontoDisponible: " + this.getSaldoDisponible()
                + "\n-----------------------------------------------";
    }

    public String ImprimirDatos() {
        if (!this.getCuentaDestino().isEmpty()) {
            return imprimirVoucher("");
        }
        return imprimirVoucherTransaccion();
    }
}
