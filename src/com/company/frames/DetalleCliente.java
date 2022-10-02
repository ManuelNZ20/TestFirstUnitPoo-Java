package com.company.frames;

import com.company.classbase.ArrayCliente;
import com.company.classbase.ArrayCuenta;
import com.company.classbase.ArrayTarjetaCredito;
import com.company.classbase.ArrayTarjetaDebito;
import com.company.classbase.Cliente;
import com.company.classbase.Cuenta;
import com.company.classbase.GenerarNumeros;
import com.company.classbase.OperacionesCliente;
import com.company.classbase.OperacionesCuentas;
import com.company.classbase.TarjetaCredito;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalleCliente extends javax.swing.JFrame {

    ArrayCuenta arrayCuenta;
    Cliente cliente;
    DefaultTableModel model;
    ArrayTarjetaCredito arrayTarjetaCredito;
    ArrayTarjetaDebito arrayTarjetaDebito;
    byte row;
    String tipo, numero;
    private int x, y;
    public DetalleCliente(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        detallClient();
        setBackground(new Color(255, 255, 255, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.company.componentframe.PanelRound();
        panelRound2 = new com.company.componentframe.PanelRound();
        btnVolver = new com.company.componentframe.ButtonRound();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new com.company.componentframe.ButtonRound();
        btnEliminarCliente = new com.company.componentframe.ButtonRound();
        btnCrearCuenta = new com.company.componentframe.ButtonRound();
        btnEliminarCuenta = new com.company.componentframe.ButtonRound();
        btnDetalleTarjeta = new com.company.componentframe.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        panelRound2.setBackground(new java.awt.Color(51, 51, 51));
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRound2MouseDragged(evt);
            }
        });
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound2MousePressed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("<");
        btnVolver.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        txtGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "N° Cuenta", "N° Tarjeta", "Dinero Disponible"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnModificar.setBackground(new java.awt.Color(0, 153, 204));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar cliente");
        btnEliminarCliente.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(0, 153, 204));
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnDetalleTarjeta.setBackground(new java.awt.Color(0, 153, 204));
        btnDetalleTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalleTarjeta.setText("Detalle Tarjeta");
        btnDetalleTarjeta.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnDetalleTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtDireccion)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalleTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDetalleTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new ListaClientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        OperacionesCliente.ModificarCliente(OperacionesCliente.buscarCliente(getDNI()), getDireccion());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        OperacionesCliente.eliminarCliente(getDNI());
        new ListaClientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        CrearCuenta crear = new CrearCuenta(getDNI(), this, true);
        crear.setVisible(true);
        if (!crear.isVisible()) {
            dispose();
            ListaClientes listar = new ListaClientes();
            listar.setVisible(true);
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        ObtenerCuenta(1);
        int r = JOptionPane.showOptionDialog(this, "Desea eliminar esta cuenta " + numero, "Sistema de control", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (r == 0) {
            OperacionesCuentas.eliminarCuenta(OperacionesCuentas.buscarCuenta(numero), new ArrayCliente().buscar(cliente.getDNI()));
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnDetalleTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleTarjetaActionPerformed
        ObtenerCuenta(2);
        if (tipo.equals("Crédito")) {
            JOptionPane.showMessageDialog(null, arrayTarjetaCredito.buscar(numero).showDate());
        } else {
            JOptionPane.showMessageDialog(null, arrayTarjetaDebito.buscar(numero).showDate());
        }
    }//GEN-LAST:event_btnDetalleTarjetaActionPerformed

    private void panelRound2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseDragged
                this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelRound2MouseDragged

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
          x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelRound2MousePressed
    public void ObtenerCuenta(int column) {
        row = (byte) jTable1.getSelectedRow();
        if (row >= 0) {
            tipo = jTable1.getValueAt(row, 0).toString();
            numero = jTable1.getValueAt(row, column).toString();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una tarjeta de la lista");
        }
    }

    public void detallClient() {
        arrayCuenta = new ArrayCuenta();
        arrayTarjetaCredito = new ArrayTarjetaCredito();
        arrayTarjetaDebito = new ArrayTarjetaDebito();
        model = new DefaultTableModel(new Object[][]{}, new Object[]{"Tipo", "N° Cuenta", "N° Tarjeta", "Dinero"});
        jTable1.setModel(model);
        txtDNI.setText(cliente.getDNI());
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtGenero.setText(cliente.getGenero());
        txtDireccion.setText(cliente.getDireccion());
        txtFecha.setText(cliente.getFechaNacimiento());
        String[] cuentas = cliente.numeroCuentas().split("-");
        for (String cuenta1 : cuentas) {
            Cuenta cuenta = arrayCuenta.buscar(cuenta1);
            if (cuenta != null) {
                String tipo = cuenta.getTipo();
                float dinero = 0;
                if (tipo.equals("Crédito")) {
                    dinero = arrayTarjetaCredito.buscar(cuenta.getNumeroTarjeta()).getLineaDisponible();
                } else {
                    dinero = arrayTarjetaDebito.buscar(cuenta.getNumeroTarjeta()).getSaldo();
                }
                model.addRow(new Object[]{tipo, cuenta.getNumeroCuenta(), cuenta.getNumeroTarjeta(), dinero});
            }
        }
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

    public String getCodigoSeguridadCredito() {
        return GenerarNumeros.generaCodigoSeguridadCredito();
    }

    public String getCodigoSeguridadDebito() {
        return GenerarNumeros.generaCodigoSeguridadDebito();
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new DetalleCliente(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.company.componentframe.ButtonRound btnCrearCuenta;
    private com.company.componentframe.ButtonRound btnDetalleTarjeta;
    private com.company.componentframe.ButtonRound btnEliminarCliente;
    private com.company.componentframe.ButtonRound btnEliminarCuenta;
    private com.company.componentframe.ButtonRound btnModificar;
    private com.company.componentframe.ButtonRound btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.company.componentframe.PanelRound panelRound1;
    private com.company.componentframe.PanelRound panelRound2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
