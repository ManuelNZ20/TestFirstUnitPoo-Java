package com.company.frames;

import com.company.classbase.ArrayCliente;
import com.company.classbase.ArrayCuenta;
import com.company.classbase.ArrayTarjetaCredito;
import com.company.classbase.ArrayTarjetaDebito;
import com.company.classbase.Cliente;
import com.company.classbase.Cuenta;
import com.company.classbase.GenerarNumeros;
import com.company.classbase.OperacionesCuentas;
import com.company.classbase.TarjetaCredito;
import com.company.classbase.TarjetaDebito;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public final class RegistroCliente extends javax.swing.JFrame {

    private int x, y;
    ArrayCliente cliente;
    ArrayCuenta cuenta;
    ArrayTarjetaCredito credito;
    ArrayTarjetaDebito debito;

    public RegistroCliente() {
        initComponents();
        setBackground(new Color(255, 255, 255, 0));
        modifiedBoxes(0);
        cliente = new ArrayCliente();
        cuenta = new ArrayCuenta();
        credito = new ArrayTarjetaCredito();
        debito = new ArrayTarjetaDebito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new com.company.componentframe.PanelRound();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtDineroDisponible = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JTextField();
        buttonRound2 = new com.company.componentframe.ButtonRound();
        panelRound1 = new com.company.componentframe.PanelRound();
        buttonRound1 = new com.company.componentframe.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        txtDNI.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtApellido.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtFecha.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtGenero.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuenta Crédito", "Tarjeta Débito" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtNumeroCuenta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtNumeroCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12))); // NOI18N

        txtNumeroTarjeta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtNumeroTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtContraseña.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtDineroDisponible.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtDineroDisponible.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtFechaVencimiento.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtFechaVencimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        buttonRound2.setBackground(new java.awt.Color(0, 153, 204));
        buttonRound2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound2.setText("Agregar Cliente");
        buttonRound2.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(51, 51, 51));
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRound1MouseDragged(evt);
            }
        });
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound1MousePressed(evt);
            }
        });

        buttonRound1.setBackground(new java.awt.Color(51, 51, 51));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("<");
        buttonRound1.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtDireccion)
                    .addComponent(txtFecha)
                    .addComponent(txtGenero)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(buttonRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        modifiedBoxes(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        cliente.agregar(new Cliente(getDNI(), getNombre(), getApellido(), getGenero(), getDireccion(), getFechaNacimiento(), new String[]{getNumeroCuenta()}, (byte) 0));
        cliente.grabar();
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Opción incorrecto");
                break;
            case 1:
                OperacionesCuentas.asignarNuevaCuenta(new Cuenta(getNumeroCuenta(), getContraseña(), getDNI(), getNumeroTarjeta(), "Crédito"), getDNI(), new TarjetaCredito(getNumeroTarjeta(), getCodigoSeguridadCredito(), getFechaVencimiento(), "Crédito", getNumeroCuenta(), getDineroDisponible()));
                break;
            case 2:
                OperacionesCuentas.asignarNuevaCuenta(new Cuenta(getNumeroCuenta(), getContraseña(), getDNI(), getNumeroTarjeta(), "Débiti"), getDNI(), new TarjetaDebito(getDineroDisponible(), getNumeroTarjeta(), getCodigoSeguridadDebito(), getFechaVencimiento(), "Débito", getNumeroCuenta()));
                break;
        }
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
       new MenuCliente().setVisible(true);
       dispose();
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void panelRound1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelRound1MouseDragged

    private void panelRound1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelRound1MousePressed

    public void modifiedBoxes(int pos) {
        switch (pos) {
            case 1:
                initialBoxesCuenta();
                txtNumeroCuenta.setBorder(new TitledBorder("N° Cuenta Crédito"));
                txtNumeroTarjeta.setBorder(new TitledBorder("N° Tarjeta Crédito"));
                txtDineroDisponible.setBorder(new TitledBorder("Línea Aprobada"));
                txtContraseña.setBorder(new TitledBorder("Contraseña"));
                txtFechaVencimiento.setBorder(new TitledBorder("Fecha vencimiento"));
                break;
            case 2:
                initialBoxesCuenta();
                txtNumeroCuenta.setBorder(new TitledBorder("N° Cuenta Débito"));
                txtNumeroTarjeta.setBorder(new TitledBorder("N° Tarjeta Débito"));
                txtDineroDisponible.setBorder(new TitledBorder("Saldo disponible"));
                txtContraseña.setBorder(new TitledBorder("Contraseña"));
                txtFechaVencimiento.setBorder(new TitledBorder("Fecha vencimiento"));
                break;
            case 0:
                clearBoxes();
                this.requestFocus();
                break;
        }
    }

    public void initialBoxesCuenta() {
        txtNumeroCuenta.setText(GenerarNumeros.generarNumeroCuenta());
        txtNumeroTarjeta.setText(GenerarNumeros.generarNumeroTarjeta());
        txtDineroDisponible.requestFocus();
        txtContraseña.setText(GenerarNumeros.generaContraseña());
    }

    public void clearBoxes() {
        txtNumeroCuenta.setBorder(null);
        txtNumeroTarjeta.setBorder(null);
        txtDineroDisponible.setBorder(null);
        txtFechaVencimiento.setBorder(null);
        txtContraseña.setBorder(null);
        txtNumeroCuenta.setText("");
        txtNumeroTarjeta.setText("");
        txtContraseña.setText("");
        txtFechaVencimiento.setText("");
    }

    public String getDNI() {
        return txtDNI.getText();
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellido() {
        return txtApellido.getText();
    }

    public String getGenero() {
        return txtGenero.getText();
    }

    public String getDireccion() {
        return txtDireccion.getText();
    }

    public String getFechaNacimiento() {
        return txtFecha.getText();
    }

    public String getNumeroCuenta() {
        return txtNumeroCuenta.getText();
    }

    public String getContraseña() {
        return txtContraseña.getText();
    }

    public String getNumeroTarjeta() {
        return txtNumeroTarjeta.getText();
    }

    public float getDineroDisponible() {
        return Float.valueOf(txtDineroDisponible.getText());
    }

    public String getCodigoSeguridadCredito() {
        return GenerarNumeros.generaCodigoSeguridadCredito();
    }

    public String getCodigoSeguridadDebito() {
        return GenerarNumeros.generaCodigoSeguridadDebito();
    }

    public String getFechaVencimiento() {
        return txtFechaVencimiento.getText();
    }

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.company.componentframe.ButtonRound buttonRound1;
    private com.company.componentframe.ButtonRound buttonRound2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.company.componentframe.PanelRound panelRound1;
    private com.company.componentframe.PanelRound panelRound2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDineroDisponible;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
