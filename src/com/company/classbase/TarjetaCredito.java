package com.company.classbase;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TarjetaCredito extends Tarjeta {

    private float lineaAprobada;
    private float lineaUtilizada;
    private float lineaDisponible;
    private float pagoCuota;
    private static final byte nCuotas = 12;
    private byte cuotasPagadas = 0;
    public static final float lineaDefecto = 5000;
    private static final float interesMensual = 0.078f;
    private static final float interesAnual = interesMensual * 12;

    //para ingresar datos desde el arreglo de objetos - Uso cuando se crea  la cuenta del cliente
    public TarjetaCredito(String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta, float lineaAprobada) {
        super(numeroTarjeta, codigoSeguridad, fechaVencimiento, tipo, numeroCuenta);
        this.lineaDisponible = this.lineaAprobada = lineaAprobada;
    }

    //Para modificar datos
    public TarjetaCredito(String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta, float lineaAprobada, float lineaDisponible, float lineaUtilizada) {
        this(numeroTarjeta, codigoSeguridad, fechaVencimiento, tipo, numeroCuenta, lineaAprobada);
        this.lineaDisponible = lineaDisponible;
        this.lineaUtilizada = lineaUtilizada;
    }
    //Para modificar datos

    //Uso para cargar datos del archivo
    public TarjetaCredito(String numeroTarjeta, String codigoSeguridad, String fechaVencimiento, String tipo, String numeroCuenta, float lineaAprobada, float lineaDisponible, float lineaUtilizada, float pagoCuota, byte cuotasPagadas) {
        this(numeroTarjeta, codigoSeguridad, fechaVencimiento, tipo, numeroCuenta, lineaAprobada, lineaDisponible, lineaUtilizada);
        this.pagoCuota = pagoCuota;
        this.cuotasPagadas = cuotasPagadas;
    }

    public float getLineaAprobada() {
        return lineaAprobada;
    }

    public void setLineaAprobada(float lineaAprobada) {
        this.lineaAprobada = lineaAprobada;
    }

    public void setLineaDisponible() {
        this.lineaDisponible -= lineaUtilizada;
    }

    public void setLineaDisponible(float lineaAprobada) {
        this.lineaDisponible = lineaAprobada;
    }

    public float getLineaDisponible() {
        return lineaDisponible;
    }

    public void setLineaUtilizada(float lineaUtilizada) {
        this.lineaUtilizada += lineaUtilizada;
    }

    public void setLineaUtilizada() {//reinicia el acumulador del total de la linea utilizada
        this.lineaUtilizada = 0;
    }

    public float getLineaUtilizada() {
        return lineaUtilizada;
    }

    public void renovarTarjeta(float lineaAprobada) {
        this.setLineaAprobada(lineaAprobada);
        this.setLineaDisponible(lineaAprobada);
        this.setLineaUtilizada();///restablece el valor a cero
        this.setCuotasPagas();//reestablece el valor a cero
    }

    public float getInteresMensual() {
        return lineaAprobada * interesMensual;
    }

    public float getInteresAnual() {
        return lineaAprobada * interesAnual;
    }

    public float getcuotaMensual() {
        return (lineaAprobada / nCuotas) + getInteresMensual();
    }

    public void setUtilizarLinea(float retirar) {
        if (getDineroDisponible()) {
            int r = JOptionPane.showOptionDialog(null, "Vas a retirar " + lineaUtilizada, "Sistema de control", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            try {
                if (r == 0) {
                    if (retirar <= this.lineaDisponible) {
                        this.setLineaUtilizada(retirar);
                        setLineaDisponible();
                        JOptionPane.showMessageDialog(null, "Su saldo disponible es de " + this.lineaDisponible);
                    } else {
                        JOptionPane.showMessageDialog(null, "No cuenta con el dinero disponible\n" + "Su saldo disponible es de " + this.lineaDisponible);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Solicitud cancelada");
                }
            } catch (HeadlessException e) {
                System.out.println("error, " + this.getClass().getName());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No cuenta con dinero disponible");
        }
    }

    public boolean determinarPago(float pagoCuota) {
        return getcuotaMensual() == pagoCuota;
    }

    public void setPagoCuota(float pagoCuota) {
        if (cuotasPagadas <= 12) {
            ++cuotasPagadas;
            this.pagoCuota += pagoCuota;
//            JOptionPane.showMessageDialog(null, "Número de cuotas pagas: " + getCuotasPagas());
        } else {
            JOptionPane.showMessageDialog(null, "Ya has pagado toda tu deuda");
        }
    }

    /**
     * @return retorna el pago total de todas las cuotas
     */
    public float totalPagado() {
        return pagoCuota;
    }

    public byte getCuotasPagadas() {//el número total de cuotas pagadas
        return cuotasPagadas;
    }

    public void setCuotasPagas() {//reinicio el contador del total de mis cuotas pagadas
        this.cuotasPagadas = 0;
    }

    public float getDeudaTotal() {
        return (this.lineaAprobada - this.pagoCuota);
    }

    public final boolean getDineroDisponible() {
        return this.lineaDisponible > 0;
    }

    @Override
    public String toString() {
        return this.getNumeroTarjeta() + "/"
                + this.getCodigoSeguridad() + "/"
                + this.getFechaVencimiento() + "/"
                + this.getTipo() + "/"
                + this.getNumeroCuenta() + "/"
                + this.getLineaAprobada() + "/"
                + this.getLineaDisponible() + "/"
                + +this.getLineaUtilizada() + "/"
                + this.pagoCuota + "/"
                + this.cuotasPagadas;
    }

    @Override
    public String showDate() {
        return "N° Tarjeta: " + this.getNumeroTarjeta() + "\n"
                + "Codigo seguridad: " + this.getCodigoSeguridad() + "\n"
                + "Fecha vencimiento: " + this.getFechaVencimiento() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "N° cuenta: " + this.getNumeroCuenta() + "\n"
                + "Línea aprobada: " + this.getLineaAprobada() + "\n"
                + "Línea disponible: " + this.getLineaDisponible() + "\n"
                + "Línea utilizada: " + +this.getLineaUtilizada() + "\n"
                + "Pago cuota: " + this.pagoCuota + "\n"
                + "Cuotas pagadas: " + this.cuotasPagadas;
    }
}
