package com.company.frames;

import com.company.classbase.ArrayCliente;
import com.company.classbase.ArrayCuenta;
import com.company.classbase.ArrayTarjetaCredito;
import com.company.classbase.ArrayTarjetaDebito;
import com.company.classbase.Cliente;
import com.company.classbase.Cuenta;
import com.company.classbase.TarjetaCredito;
import com.company.classbase.TarjetaDebito;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ListaClientes extends javax.swing.JFrame {

    DefaultTableModel model;
    ArrayCliente arrayCliente;
    ArrayCuenta arrayCuenta;
    ArrayTarjetaCredito arrayTarjetaCredito;
    ArrayTarjetaDebito arrayTarjetaDebito;
    private int x, y;

    public ListaClientes() {
        initComponents();
        completTable();
        setBackground(new Color(255, 255, 255, 0));
    }

    public void completTable() {
        model = new DefaultTableModel(new Object[][]{}, new Object[]{"Clientes", "Deuda Individual", "Saldo Individual"});
        jTable1.setModel(model);
        arrayCliente = new ArrayCliente();
        arrayCuenta = new ArrayCuenta();
        arrayTarjetaDebito = new ArrayTarjetaDebito();
        arrayTarjetaCredito = new ArrayTarjetaCredito();
        float deudaIndidual = 0, deudaTotal = 0, saldoIndividual = 0, saldoTotal = 0;
        String dni = "";
        for (int i = 0; i < arrayCliente.getTamaño(); i++) {
            Cliente c = arrayCliente.getArrayList().get(i);
            dni = c.getDNI();
            String cuentas[] = c.numeroCuentas().split("-");
            for (int j = 0; j < cuentas.length; j++) {
                Cuenta cuenta1 = arrayCuenta.buscar(cuentas[j]);
                if (cuenta1 != null) {
                    if (cuenta1.getTipo().equals("Crédito")) {
                        TarjetaCredito credito = arrayTarjetaCredito.buscar(cuenta1.getNumeroTarjeta());
                        if (credito != null) {
                            deudaIndidual += credito.getDeudaTotal();
                            deudaTotal += deudaIndidual;
                        }
                    } else {
                        TarjetaDebito debito = arrayTarjetaDebito.buscar(cuenta1.getNumeroTarjeta());
                        if (debito != null) {
                            saldoIndividual += debito.getSaldo();
                            saldoTotal += saldoIndividual;
                        }
                    }
                }
            }
            model.addRow(new Object[]{dni, deudaIndidual, saldoIndividual});
            deudaIndidual = saldoIndividual = 0;
        }

        lblDeudaTotal.setText(String.valueOf(deudaTotal));
        lblSaldoTotal.setText(String.valueOf(saldoTotal));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.company.componentframe.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSaldoTotal = new javax.swing.JLabel();
        lblDeudaTotal = new javax.swing.JLabel();
        lblMontoTotal1 = new javax.swing.JLabel();
        panelRound2 = new com.company.componentframe.PanelRound();
        buttonRound2 = new com.company.componentframe.ButtonRound();
        buttonRound1 = new com.company.componentframe.ButtonRound();
        jTextField1 = new javax.swing.JTextField();
        buttonRound3 = new com.company.componentframe.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Deuda Total", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblSaldoTotal.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        lblSaldoTotal.setText("00.00");

        lblDeudaTotal.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        lblDeudaTotal.setText("00.00");

        lblMontoTotal1.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        lblMontoTotal1.setText("Monto total:");

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

        buttonRound2.setBackground(new java.awt.Color(51, 51, 51));
        buttonRound2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound2.setText("<");
        buttonRound2.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        buttonRound1.setBackground(new java.awt.Color(0, 153, 204));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("Detalle");
        buttonRound1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        buttonRound3.setBackground(new java.awt.Color(204, 204, 204));
        buttonRound3.setForeground(new java.awt.Color(0, 153, 204));
        buttonRound3.setText("Buscar");
        buttonRound3.setRadius(10);
        buttonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonRound1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addComponent(lblMontoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblDeudaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(buttonRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeudaTotal)
                    .addComponent(lblMontoTotal1)
                    .addComponent(lblSaldoTotal))
                .addGap(10, 10, 10)
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            String column = jTable1.getValueAt(row, 0).toString();
            new DetalleCliente(arrayCliente.buscar(column)).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        MenuCliente menuCliente = new MenuCliente();
        menuCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelRound2MousePressed

    private void panelRound2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelRound2MouseDragged

    private void buttonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound3ActionPerformed
        if (!getBusqueda().isEmpty()) {
            Cliente cliente = arrayCliente.buscar(getBusqueda());
            if (cliente != null) {
                float deudaIndidual = 0, saldoIndividual = 0;
                model = new DefaultTableModel(new Object[][]{}, new Object[]{"Clientes", "Deuda Individual", "Saldo Individual"});
                jTable1.setModel(model);
                String cuentas[] = cliente.numeroCuentas().split("-");
                for (int j = 0; j < cuentas.length; j++) {
                    Cuenta cuenta1 = arrayCuenta.buscar(cuentas[j]);
                    if (cuenta1 != null) {
                        if (cuenta1.getTipo().equals("Crédito")) {
                            TarjetaCredito credito = arrayTarjetaCredito.buscar(cuenta1.getNumeroTarjeta());
                            if (credito != null) {
                                deudaIndidual += credito.getDeudaTotal();
                            }
                        } else {
                            TarjetaDebito debito = arrayTarjetaDebito.buscar(cuenta1.getNumeroTarjeta());
                            if (debito != null) {
                                saldoIndividual += debito.getSaldo();
                            }
                        }
                    }
                }
                model.addRow(new Object[]{cliente.getDNI(), deudaIndidual, saldoIndividual});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacío");
        }
    }//GEN-LAST:event_buttonRound3ActionPerformed
    public String getBusqueda() {
        return jTextField1.getText();
    }

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new ListaClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.company.componentframe.ButtonRound buttonRound1;
    private com.company.componentframe.ButtonRound buttonRound2;
    private com.company.componentframe.ButtonRound buttonRound3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDeudaTotal;
    private javax.swing.JLabel lblMontoTotal1;
    private javax.swing.JLabel lblSaldoTotal;
    private com.company.componentframe.PanelRound panelRound1;
    private com.company.componentframe.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
