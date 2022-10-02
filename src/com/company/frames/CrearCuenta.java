package com.company.frames;

import com.company.classbase.Cuenta;
import com.company.classbase.GenerarNumeros;
import com.company.classbase.OperacionesCliente;
import com.company.classbase.OperacionesCuentas;
import com.company.classbase.TarjetaCredito;
import com.company.classbase.TarjetaDebito;
import javax.swing.border.TitledBorder;

public class CrearCuenta extends javax.swing.JDialog {

    String dni;

    public CrearCuenta(String dni, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.dni = dni;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtDineroDisponible = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JTextField();
        btnCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuenta Crédito", "Tarjeta Débito" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de cuenta"));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtNumeroCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtDineroDisponible.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtNumeroTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtFechaVencimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        btnCrearCuenta.setBackground(new java.awt.Color(0, 153, 204));
        btnCrearCuenta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDineroDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        modifiedBoxes(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                OperacionesCuentas.asignarNuevaCuenta(new Cuenta(getNumeroCuenta(), getContraseña(), this.dni, getNumeroTarjeta(), "Crédito"), dni, new TarjetaCredito(getNumeroTarjeta(), getCodigoSeguridadCredito(), getFechaVencimiento(), "Crédito", getNumeroCuenta(), getDineroDisponible()));
                break;
            case 2:
                OperacionesCuentas.asignarNuevaCuenta(new Cuenta(getNumeroCuenta(), getContraseña(), this.dni, getNumeroTarjeta(), "Débito"), dni, new TarjetaDebito(getDineroDisponible(), getNumeroTarjeta(), getCodigoSeguridadDebito(), getFechaVencimiento(), "Débito", getNumeroCuenta()));
                break;
            case 0:
                break;
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed
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

    public String getFechaVencimiento() {
        return txtFechaVencimiento.getText();
    }

    public String getCodigoSeguridadCredito() {
        return GenerarNumeros.generaCodigoSeguridadCredito();
    }

    public String getCodigoSeguridadDebito() {
        return GenerarNumeros.generaCodigoSeguridadDebito();
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            CrearCuenta dialog = new CrearCuenta(null, new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDineroDisponible;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
