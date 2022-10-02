package com.company.frames;

import com.company.classbase.ArrayCuenta;
import com.company.classbase.ArrayTarjetaDebito;
import com.company.classbase.Cliente;
import com.company.classbase.Cuenta;
import com.company.classbase.TarjetaDebito;
import com.company.classbase.Transacciones;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Cajero extends javax.swing.JFrame {

    ArrayCuenta arrayCuenta;
    String ultimaTransaccion;
    TarjetaDebito tarjetaDebito;
    Cuenta cuenta, cCliente;
    Cliente cliente;
    float cantidades = 0;
    DefaultComboBoxModel<String> model;
    ArrayTarjetaDebito debito;

    public Cajero(TarjetaDebito tarjetaDebito, Cuenta cuenta, Cliente cliente) {
        initComponents();
        this.tarjetaDebito = tarjetaDebito;
        this.cuenta = cuenta;
        this.cliente = cliente;
        model = new DefaultComboBoxModel<>();
        arrayCuenta = new ArrayCuenta();
        debito = new ArrayTarjetaDebito();
        completCombo();
        txtCuentaLocal1.setText(cuenta.getNumeroCuenta());
        txtCuentaLocal2.setText(cuenta.getNumeroCuenta());
        txtSaldo1.setText(String.valueOf(tarjetaDebito.getSaldo()));
        txtSaldo2.setText(String.valueOf(tarjetaDebito.getSaldo()));
    }

    private void completCombo() {
        String cuentas[] = cliente.numeroCuentas().split("-");
        for (int i = 0; i < cuentas.length; i++) {
            if (!cuentas[i].isEmpty() || cuentas[i] != null) {
                cCliente = arrayCuenta.buscar(cuentas[i]);
                if (cCliente != null) {
                    if (cCliente.getTipo().equalsIgnoreCase("Débito")) {
                        model.addElement(cCliente.getNumeroCuenta());
                    }
                }
            }
        }
        cbCuentas.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder = new javax.swing.JPanel();
        panelBase = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        panelInicial = new javax.swing.JPanel();
        panelRoundRetiro = new com.company.componentframe.PanelRound();
        lblD1 = new javax.swing.JLabel();
        panelRoundDeposito = new com.company.componentframe.PanelRound();
        lblD4 = new javax.swing.JLabel();
        panelRoundTransferencia = new com.company.componentframe.PanelRound();
        lblI1 = new javax.swing.JLabel();
        panelRoundConsultas = new com.company.componentframe.PanelRound();
        lblI4 = new javax.swing.JLabel();
        panelRoundSoles = new com.company.componentframe.PanelRound();
        lblD2 = new javax.swing.JLabel();
        panelRoundDolares = new com.company.componentframe.PanelRound();
        lblD3 = new javax.swing.JLabel();
        panelRound8 = new com.company.componentframe.PanelRound();
        lblI2 = new javax.swing.JLabel();
        panelRound9 = new com.company.componentframe.PanelRound();
        lblI3 = new javax.swing.JLabel();
        panelConsultas = new javax.swing.JPanel();
        panelRound1 = new com.company.componentframe.PanelRound();
        lblD6 = new javax.swing.JLabel();
        panelRound2 = new com.company.componentframe.PanelRound();
        lblD11 = new javax.swing.JLabel();
        panelRound3 = new com.company.componentframe.PanelRound();
        lblD7 = new javax.swing.JLabel();
        panelRetiro = new javax.swing.JPanel();
        panelRound4 = new com.company.componentframe.PanelRound();
        lblD8 = new javax.swing.JLabel();
        panelRound6 = new com.company.componentframe.PanelRound();
        lblD10 = new javax.swing.JLabel();
        panelRound7 = new com.company.componentframe.PanelRound();
        lblD9 = new javax.swing.JLabel();
        panelRound11 = new com.company.componentframe.PanelRound();
        lblD12 = new javax.swing.JLabel();
        panelRound12 = new com.company.componentframe.PanelRound();
        lblD13 = new javax.swing.JLabel();
        panelRound13 = new com.company.componentframe.PanelRound();
        lblD14 = new javax.swing.JLabel();
        panelRound14 = new com.company.componentframe.PanelRound();
        lblD15 = new javax.swing.JLabel();
        panelRound15 = new com.company.componentframe.PanelRound();
        lblD16 = new javax.swing.JLabel();
        panelTipoMoneda = new javax.swing.JPanel();
        panelRound16 = new com.company.componentframe.PanelRound();
        lblD17 = new javax.swing.JLabel();
        panelRound17 = new com.company.componentframe.PanelRound();
        lblD18 = new javax.swing.JLabel();
        panelRound18 = new com.company.componentframe.PanelRound();
        lblD19 = new javax.swing.JLabel();
        panelRound19 = new com.company.componentframe.PanelRound();
        lblD20 = new javax.swing.JLabel();
        panelRound20 = new com.company.componentframe.PanelRound();
        lblD21 = new javax.swing.JLabel();
        panelRound21 = new com.company.componentframe.PanelRound();
        lblD22 = new javax.swing.JLabel();
        panelRound22 = new com.company.componentframe.PanelRound();
        lblD23 = new javax.swing.JLabel();
        panelRound23 = new com.company.componentframe.PanelRound();
        lblD24 = new javax.swing.JLabel();
        panelCantidades = new javax.swing.JPanel();
        panelRound24 = new com.company.componentframe.PanelRound();
        lblD25 = new javax.swing.JLabel();
        panelRound25 = new com.company.componentframe.PanelRound();
        lblD26 = new javax.swing.JLabel();
        panelRound26 = new com.company.componentframe.PanelRound();
        lblD27 = new javax.swing.JLabel();
        panelRound27 = new com.company.componentframe.PanelRound();
        lblD28 = new javax.swing.JLabel();
        panelRound28 = new com.company.componentframe.PanelRound();
        lblD29 = new javax.swing.JLabel();
        panelRound29 = new com.company.componentframe.PanelRound();
        lblD30 = new javax.swing.JLabel();
        panelRound30 = new com.company.componentframe.PanelRound();
        lblD31 = new javax.swing.JLabel();
        panelRound31 = new com.company.componentframe.PanelRound();
        lblD32 = new javax.swing.JLabel();
        panelOtrasCantidades = new javax.swing.JPanel();
        panelRound33 = new com.company.componentframe.PanelRound();
        lblD34 = new javax.swing.JLabel();
        panelRound34 = new com.company.componentframe.PanelRound();
        lblD35 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidades = new javax.swing.JTextField();
        panelOpcionTransferencia = new javax.swing.JPanel();
        panelRound32 = new com.company.componentframe.PanelRound();
        lblD33 = new javax.swing.JLabel();
        panelRound35 = new com.company.componentframe.PanelRound();
        lblD36 = new javax.swing.JLabel();
        panelRound36 = new com.company.componentframe.PanelRound();
        lblD37 = new javax.swing.JLabel();
        panelMisCuentas = new javax.swing.JPanel();
        txtCuentaLocal1 = new javax.swing.JTextField();
        txtSaldo1 = new javax.swing.JTextField();
        cbCuentas = new javax.swing.JComboBox<>();
        panelRound37 = new com.company.componentframe.PanelRound();
        lblD38 = new javax.swing.JLabel();
        panelRound38 = new com.company.componentframe.PanelRound();
        lblD39 = new javax.swing.JLabel();
        panelOtrasCuentas = new javax.swing.JPanel();
        txtCuentaLocal2 = new javax.swing.JTextField();
        txtCuentaDestino = new javax.swing.JTextField();
        txtSaldo2 = new javax.swing.JTextField();
        panelRound39 = new com.company.componentframe.PanelRound();
        lblD40 = new javax.swing.JLabel();
        panelRound40 = new com.company.componentframe.PanelRound();
        lblD41 = new javax.swing.JLabel();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnI4 = new javax.swing.JButton();
        btnI3 = new javax.swing.JButton();
        btnI2 = new javax.swing.JButton();
        btnI1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelLateral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBorder.setBackground(new java.awt.Color(51, 51, 51));

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicial.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundRetiro.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundRetiro.setRoundBottomLeft(10);
        panelRoundRetiro.setRoundBottomRight(10);
        panelRoundRetiro.setRoundTopLeft(10);
        panelRoundRetiro.setRoundTopRight(10);

        lblD1.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD1.setForeground(new java.awt.Color(0, 102, 153));
        lblD1.setText("<< Retiro");

        javax.swing.GroupLayout panelRoundRetiroLayout = new javax.swing.GroupLayout(panelRoundRetiro);
        panelRoundRetiro.setLayout(panelRoundRetiroLayout);
        panelRoundRetiroLayout.setHorizontalGroup(
            panelRoundRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundRetiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundRetiroLayout.setVerticalGroup(
            panelRoundRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundRetiroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRoundDeposito.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundDeposito.setRoundBottomLeft(10);
        panelRoundDeposito.setRoundBottomRight(10);
        panelRoundDeposito.setRoundTopLeft(10);
        panelRoundDeposito.setRoundTopRight(10);

        lblD4.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD4.setForeground(new java.awt.Color(0, 102, 153));
        lblD4.setText("<< Depósito");

        javax.swing.GroupLayout panelRoundDepositoLayout = new javax.swing.GroupLayout(panelRoundDeposito);
        panelRoundDeposito.setLayout(panelRoundDepositoLayout);
        panelRoundDepositoLayout.setHorizontalGroup(
            panelRoundDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundDepositoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundDepositoLayout.setVerticalGroup(
            panelRoundDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundDepositoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD4)
                .addGap(10, 10, 10))
        );

        panelRoundTransferencia.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundTransferencia.setRoundBottomLeft(10);
        panelRoundTransferencia.setRoundBottomRight(10);
        panelRoundTransferencia.setRoundTopLeft(10);
        panelRoundTransferencia.setRoundTopRight(10);

        lblI1.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblI1.setForeground(new java.awt.Color(0, 102, 153));
        lblI1.setText("Transferencia >>");

        javax.swing.GroupLayout panelRoundTransferenciaLayout = new javax.swing.GroupLayout(panelRoundTransferencia);
        panelRoundTransferencia.setLayout(panelRoundTransferenciaLayout);
        panelRoundTransferenciaLayout.setHorizontalGroup(
            panelRoundTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblI1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundTransferenciaLayout.setVerticalGroup(
            panelRoundTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundTransferenciaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblI1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRoundConsultas.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundConsultas.setRoundBottomLeft(10);
        panelRoundConsultas.setRoundBottomRight(10);
        panelRoundConsultas.setRoundTopLeft(10);
        panelRoundConsultas.setRoundTopRight(10);

        lblI4.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblI4.setForeground(new java.awt.Color(0, 102, 153));
        lblI4.setText("Consultas >>");

        javax.swing.GroupLayout panelRoundConsultasLayout = new javax.swing.GroupLayout(panelRoundConsultas);
        panelRoundConsultas.setLayout(panelRoundConsultasLayout);
        panelRoundConsultasLayout.setHorizontalGroup(
            panelRoundConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblI4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundConsultasLayout.setVerticalGroup(
            panelRoundConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundConsultasLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblI4)
                .addGap(10, 10, 10))
        );

        panelRoundSoles.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundSoles.setRoundBottomLeft(10);
        panelRoundSoles.setRoundBottomRight(10);
        panelRoundSoles.setRoundTopLeft(10);
        panelRoundSoles.setRoundTopRight(10);

        lblD2.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD2.setForeground(new java.awt.Color(0, 102, 153));
        lblD2.setText("  ");

        javax.swing.GroupLayout panelRoundSolesLayout = new javax.swing.GroupLayout(panelRoundSoles);
        panelRoundSoles.setLayout(panelRoundSolesLayout);
        panelRoundSolesLayout.setHorizontalGroup(
            panelRoundSolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundSolesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundSolesLayout.setVerticalGroup(
            panelRoundSolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundSolesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRoundDolares.setBackground(new java.awt.Color(204, 204, 204));
        panelRoundDolares.setRoundBottomLeft(10);
        panelRoundDolares.setRoundBottomRight(10);
        panelRoundDolares.setRoundTopLeft(10);
        panelRoundDolares.setRoundTopRight(10);

        lblD3.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD3.setForeground(new java.awt.Color(0, 102, 153));
        lblD3.setText("  ");

        javax.swing.GroupLayout panelRoundDolaresLayout = new javax.swing.GroupLayout(panelRoundDolares);
        panelRoundDolares.setLayout(panelRoundDolaresLayout);
        panelRoundDolaresLayout.setHorizontalGroup(
            panelRoundDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundDolaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundDolaresLayout.setVerticalGroup(
            panelRoundDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundDolaresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound8.setBackground(new java.awt.Color(204, 204, 204));
        panelRound8.setRoundBottomLeft(10);
        panelRound8.setRoundBottomRight(10);
        panelRound8.setRoundTopLeft(10);
        panelRound8.setRoundTopRight(10);

        lblI2.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblI2.setForeground(new java.awt.Color(0, 102, 153));
        lblI2.setText("  ");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblI2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound9.setBackground(new java.awt.Color(204, 204, 204));
        panelRound9.setRoundBottomLeft(10);
        panelRound9.setRoundBottomRight(10);
        panelRound9.setRoundTopLeft(10);
        panelRound9.setRoundTopRight(10);

        lblI3.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblI3.setForeground(new java.awt.Color(0, 102, 153));
        lblI3.setText("  ");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblI3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblI3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInicialLayout = new javax.swing.GroupLayout(panelInicial);
        panelInicial.setLayout(panelInicialLayout);
        panelInicialLayout.setHorizontalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRoundDolares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundSoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundDeposito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundRetiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRoundTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        panelInicialLayout.setVerticalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRoundRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundSoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRoundDeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        TabbedPane.addTab("Deposito", panelInicial);

        panelConsultas.setBackground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(204, 204, 204));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        lblD6.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD6.setForeground(new java.awt.Color(0, 102, 153));
        lblD6.setText("<< En pantalla");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(lblD6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD6)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound2.setBackground(new java.awt.Color(204, 204, 204));
        panelRound2.setRoundBottomLeft(10);
        panelRound2.setRoundBottomRight(10);
        panelRound2.setRoundTopLeft(10);
        panelRound2.setRoundTopRight(10);

        lblD11.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD11.setForeground(new java.awt.Color(0, 102, 153));
        lblD11.setText("<< Imprimir voucher");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addComponent(lblD11)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound3.setBackground(new java.awt.Color(204, 204, 204));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);

        lblD7.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD7.setForeground(new java.awt.Color(0, 102, 153));
        lblD7.setText("No ver saldo >>");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD7, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD7)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panelConsultasLayout = new javax.swing.GroupLayout(panelConsultas);
        panelConsultas.setLayout(panelConsultasLayout);
        panelConsultasLayout.setHorizontalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        panelConsultasLayout.setVerticalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultasLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelConsultas);

        panelRetiro.setBackground(new java.awt.Color(255, 255, 255));

        panelRound4.setBackground(new java.awt.Color(204, 204, 204));
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);

        lblD8.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD8.setForeground(new java.awt.Color(0, 102, 153));
        lblD8.setText("  ");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addComponent(lblD8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD8)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound6.setBackground(new java.awt.Color(204, 204, 204));
        panelRound6.setRoundBottomLeft(10);
        panelRound6.setRoundBottomRight(10);
        panelRound6.setRoundTopLeft(10);
        panelRound6.setRoundTopRight(10);

        lblD10.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD10.setForeground(new java.awt.Color(0, 102, 153));
        lblD10.setText("<< Soles(S/.)");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD10)
                .addGap(10, 10, 10))
        );

        panelRound7.setBackground(new java.awt.Color(204, 204, 204));
        panelRound7.setRoundBottomLeft(10);
        panelRound7.setRoundBottomRight(10);
        panelRound7.setRoundTopLeft(10);
        panelRound7.setRoundTopRight(10);

        lblD9.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD9.setForeground(new java.awt.Color(0, 102, 153));
        lblD9.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD9, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound7Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD9)
                .addGap(10, 10, 10))
        );

        panelRound11.setBackground(new java.awt.Color(204, 204, 204));
        panelRound11.setRoundBottomLeft(10);
        panelRound11.setRoundBottomRight(10);
        panelRound11.setRoundTopLeft(10);
        panelRound11.setRoundTopRight(10);

        lblD12.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD12.setForeground(new java.awt.Color(0, 102, 153));
        lblD12.setText("<< Dolarés(USD)");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD12, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD12)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound12.setBackground(new java.awt.Color(204, 204, 204));
        panelRound12.setRoundBottomLeft(10);
        panelRound12.setRoundBottomRight(10);
        panelRound12.setRoundTopLeft(10);
        panelRound12.setRoundTopRight(10);

        lblD13.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD13.setForeground(new java.awt.Color(0, 102, 153));
        lblD13.setText("  ");

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound12Layout.createSequentialGroup()
                .addComponent(lblD13, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound13.setBackground(new java.awt.Color(204, 204, 204));
        panelRound13.setRoundBottomLeft(10);
        panelRound13.setRoundBottomRight(10);
        panelRound13.setRoundTopLeft(10);
        panelRound13.setRoundTopRight(10);

        lblD14.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD14.setForeground(new java.awt.Color(0, 102, 153));
        lblD14.setText("  ");

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addComponent(lblD14, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD14)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound14.setBackground(new java.awt.Color(204, 204, 204));
        panelRound14.setRoundBottomLeft(10);
        panelRound14.setRoundBottomRight(10);
        panelRound14.setRoundTopLeft(10);
        panelRound14.setRoundTopRight(10);

        lblD15.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD15.setForeground(new java.awt.Color(0, 102, 153));
        lblD15.setText("  ");

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound14Layout.createSequentialGroup()
                .addComponent(lblD15, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD15)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound15.setBackground(new java.awt.Color(204, 204, 204));
        panelRound15.setRoundBottomLeft(10);
        panelRound15.setRoundBottomRight(10);
        panelRound15.setRoundTopLeft(10);
        panelRound15.setRoundTopRight(10);

        lblD16.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD16.setForeground(new java.awt.Color(0, 102, 153));
        lblD16.setText("  ");

        javax.swing.GroupLayout panelRound15Layout = new javax.swing.GroupLayout(panelRound15);
        panelRound15.setLayout(panelRound15Layout);
        panelRound15Layout.setHorizontalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addComponent(lblD16, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound15Layout.setVerticalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD16)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRetiroLayout = new javax.swing.GroupLayout(panelRetiro);
        panelRetiro.setLayout(panelRetiroLayout);
        panelRetiroLayout.setHorizontalGroup(
            panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRetiroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRetiroLayout.createSequentialGroup()
                        .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRetiroLayout.createSequentialGroup()
                        .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRetiroLayout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRetiroLayout.createSequentialGroup()
                        .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        panelRetiroLayout.setVerticalGroup(
            panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRetiroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRetiroLayout.createSequentialGroup()
                        .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelRetiro);

        panelTipoMoneda.setBackground(new java.awt.Color(255, 255, 255));

        panelRound16.setBackground(new java.awt.Color(204, 204, 204));
        panelRound16.setRoundBottomLeft(10);
        panelRound16.setRoundBottomRight(10);
        panelRound16.setRoundTopLeft(10);
        panelRound16.setRoundTopRight(10);

        lblD17.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD17.setForeground(new java.awt.Color(0, 102, 153));
        lblD17.setText("  ");

        javax.swing.GroupLayout panelRound16Layout = new javax.swing.GroupLayout(panelRound16);
        panelRound16.setLayout(panelRound16Layout);
        panelRound16Layout.setHorizontalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound16Layout.createSequentialGroup()
                .addComponent(lblD17, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound16Layout.setVerticalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD17)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound17.setBackground(new java.awt.Color(204, 204, 204));
        panelRound17.setRoundBottomLeft(10);
        panelRound17.setRoundBottomRight(10);
        panelRound17.setRoundTopLeft(10);
        panelRound17.setRoundTopRight(10);

        lblD18.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD18.setForeground(new java.awt.Color(0, 102, 153));
        lblD18.setText("  ");

        javax.swing.GroupLayout panelRound17Layout = new javax.swing.GroupLayout(panelRound17);
        panelRound17.setLayout(panelRound17Layout);
        panelRound17Layout.setHorizontalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD18, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound17Layout.setVerticalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound17Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD18)
                .addGap(10, 10, 10))
        );

        panelRound18.setBackground(new java.awt.Color(204, 204, 204));
        panelRound18.setRoundBottomLeft(10);
        panelRound18.setRoundBottomRight(10);
        panelRound18.setRoundTopLeft(10);
        panelRound18.setRoundTopRight(10);

        lblD19.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD19.setForeground(new java.awt.Color(0, 102, 153));
        lblD19.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound18Layout = new javax.swing.GroupLayout(panelRound18);
        panelRound18.setLayout(panelRound18Layout);
        panelRound18Layout.setHorizontalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD19, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound18Layout.setVerticalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound18Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD19)
                .addGap(10, 10, 10))
        );

        panelRound19.setBackground(new java.awt.Color(204, 204, 204));
        panelRound19.setRoundBottomLeft(10);
        panelRound19.setRoundBottomRight(10);
        panelRound19.setRoundTopLeft(10);
        panelRound19.setRoundTopRight(10);

        lblD20.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD20.setForeground(new java.awt.Color(0, 102, 153));
        lblD20.setText("  ");

        javax.swing.GroupLayout panelRound19Layout = new javax.swing.GroupLayout(panelRound19);
        panelRound19.setLayout(panelRound19Layout);
        panelRound19Layout.setHorizontalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD20, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRound19Layout.setVerticalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD20)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound20.setBackground(new java.awt.Color(204, 204, 204));
        panelRound20.setRoundBottomLeft(10);
        panelRound20.setRoundBottomRight(10);
        panelRound20.setRoundTopLeft(10);
        panelRound20.setRoundTopRight(10);

        lblD21.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD21.setForeground(new java.awt.Color(0, 102, 153));
        lblD21.setText("<< Ahorros");

        javax.swing.GroupLayout panelRound20Layout = new javax.swing.GroupLayout(panelRound20);
        panelRound20.setLayout(panelRound20Layout);
        panelRound20Layout.setHorizontalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound20Layout.createSequentialGroup()
                .addComponent(lblD21, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound20Layout.setVerticalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound20Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD21)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound21.setBackground(new java.awt.Color(204, 204, 204));
        panelRound21.setRoundBottomLeft(10);
        panelRound21.setRoundBottomRight(10);
        panelRound21.setRoundTopLeft(10);
        panelRound21.setRoundTopRight(10);

        lblD22.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD22.setForeground(new java.awt.Color(0, 102, 153));
        lblD22.setText("  ");

        javax.swing.GroupLayout panelRound21Layout = new javax.swing.GroupLayout(panelRound21);
        panelRound21.setLayout(panelRound21Layout);
        panelRound21Layout.setHorizontalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound21Layout.createSequentialGroup()
                .addComponent(lblD22, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound21Layout.setVerticalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound21Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD22)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound22.setBackground(new java.awt.Color(204, 204, 204));
        panelRound22.setRoundBottomLeft(10);
        panelRound22.setRoundBottomRight(10);
        panelRound22.setRoundTopLeft(10);
        panelRound22.setRoundTopRight(10);

        lblD23.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD23.setForeground(new java.awt.Color(0, 102, 153));
        lblD23.setText("  ");

        javax.swing.GroupLayout panelRound22Layout = new javax.swing.GroupLayout(panelRound22);
        panelRound22.setLayout(panelRound22Layout);
        panelRound22Layout.setHorizontalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addComponent(lblD23, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound22Layout.setVerticalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD23)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound23.setBackground(new java.awt.Color(204, 204, 204));
        panelRound23.setRoundBottomLeft(10);
        panelRound23.setRoundBottomRight(10);
        panelRound23.setRoundTopLeft(10);
        panelRound23.setRoundTopRight(10);

        lblD24.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD24.setForeground(new java.awt.Color(0, 102, 153));
        lblD24.setText("  ");

        javax.swing.GroupLayout panelRound23Layout = new javax.swing.GroupLayout(panelRound23);
        panelRound23.setLayout(panelRound23Layout);
        panelRound23Layout.setHorizontalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addComponent(lblD24, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound23Layout.setVerticalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD24)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTipoMonedaLayout = new javax.swing.GroupLayout(panelTipoMoneda);
        panelTipoMoneda.setLayout(panelTipoMonedaLayout);
        panelTipoMonedaLayout.setHorizontalGroup(
            panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                        .addComponent(panelRound20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                        .addComponent(panelRound19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                        .addComponent(panelRound16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                        .addComponent(panelRound17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        panelTipoMonedaLayout.setVerticalGroup(
            panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTipoMonedaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTipoMonedaLayout.createSequentialGroup()
                        .addComponent(panelRound17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelTipoMoneda);

        panelCantidades.setBackground(new java.awt.Color(255, 255, 255));

        panelRound24.setBackground(new java.awt.Color(204, 204, 204));
        panelRound24.setRoundBottomLeft(10);
        panelRound24.setRoundBottomRight(10);
        panelRound24.setRoundTopLeft(10);
        panelRound24.setRoundTopRight(10);

        lblD25.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD25.setForeground(new java.awt.Color(0, 102, 153));
        lblD25.setText("<< S/. 200");

        javax.swing.GroupLayout panelRound24Layout = new javax.swing.GroupLayout(panelRound24);
        panelRound24.setLayout(panelRound24Layout);
        panelRound24Layout.setHorizontalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound24Layout.createSequentialGroup()
                .addComponent(lblD25, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound24Layout.setVerticalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD25)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound25.setBackground(new java.awt.Color(204, 204, 204));
        panelRound25.setRoundBottomLeft(10);
        panelRound25.setRoundBottomRight(10);
        panelRound25.setRoundTopLeft(10);
        panelRound25.setRoundTopRight(10);

        lblD26.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD26.setForeground(new java.awt.Color(0, 102, 153));
        lblD26.setText("<< S/. 50");

        javax.swing.GroupLayout panelRound25Layout = new javax.swing.GroupLayout(panelRound25);
        panelRound25.setLayout(panelRound25Layout);
        panelRound25Layout.setHorizontalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD26, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound25Layout.setVerticalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound25Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD26)
                .addGap(10, 10, 10))
        );

        panelRound26.setBackground(new java.awt.Color(204, 204, 204));
        panelRound26.setRoundBottomLeft(10);
        panelRound26.setRoundBottomRight(10);
        panelRound26.setRoundTopLeft(10);
        panelRound26.setRoundTopRight(10);

        lblD27.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD27.setForeground(new java.awt.Color(0, 102, 153));
        lblD27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD27.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound26Layout = new javax.swing.GroupLayout(panelRound26);
        panelRound26.setLayout(panelRound26Layout);
        panelRound26Layout.setHorizontalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD27, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound26Layout.setVerticalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound26Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD27)
                .addGap(10, 10, 10))
        );

        panelRound27.setBackground(new java.awt.Color(204, 204, 204));
        panelRound27.setRoundBottomLeft(10);
        panelRound27.setRoundBottomRight(10);
        panelRound27.setRoundTopLeft(10);
        panelRound27.setRoundTopRight(10);

        lblD28.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD28.setForeground(new java.awt.Color(0, 102, 153));
        lblD28.setText("<< S/. 100");

        javax.swing.GroupLayout panelRound27Layout = new javax.swing.GroupLayout(panelRound27);
        panelRound27.setLayout(panelRound27Layout);
        panelRound27Layout.setHorizontalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD28, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRound27Layout.setVerticalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound27Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD28)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound28.setBackground(new java.awt.Color(204, 204, 204));
        panelRound28.setRoundBottomLeft(10);
        panelRound28.setRoundBottomRight(10);
        panelRound28.setRoundTopLeft(10);
        panelRound28.setRoundTopRight(10);

        lblD29.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD29.setForeground(new java.awt.Color(0, 102, 153));
        lblD29.setText("<< S/. 20");

        javax.swing.GroupLayout panelRound28Layout = new javax.swing.GroupLayout(panelRound28);
        panelRound28.setLayout(panelRound28Layout);
        panelRound28Layout.setHorizontalGroup(
            panelRound28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound28Layout.createSequentialGroup()
                .addComponent(lblD29, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound28Layout.setVerticalGroup(
            panelRound28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound28Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD29)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound29.setBackground(new java.awt.Color(204, 204, 204));
        panelRound29.setRoundBottomLeft(10);
        panelRound29.setRoundBottomRight(10);
        panelRound29.setRoundTopLeft(10);
        panelRound29.setRoundTopRight(10);

        lblD30.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD30.setForeground(new java.awt.Color(0, 102, 153));
        lblD30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD30.setText("Otras cantidades >>");

        javax.swing.GroupLayout panelRound29Layout = new javax.swing.GroupLayout(panelRound29);
        panelRound29.setLayout(panelRound29Layout);
        panelRound29Layout.setHorizontalGroup(
            panelRound29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound29Layout.createSequentialGroup()
                .addComponent(lblD30, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound29Layout.setVerticalGroup(
            panelRound29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound29Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD30)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound30.setBackground(new java.awt.Color(204, 204, 204));
        panelRound30.setRoundBottomLeft(10);
        panelRound30.setRoundBottomRight(10);
        panelRound30.setRoundTopLeft(10);
        panelRound30.setRoundTopRight(10);

        lblD31.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD31.setForeground(new java.awt.Color(0, 102, 153));
        lblD31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD31.setText("S/. 3000 >>");

        javax.swing.GroupLayout panelRound30Layout = new javax.swing.GroupLayout(panelRound30);
        panelRound30.setLayout(panelRound30Layout);
        panelRound30Layout.setHorizontalGroup(
            panelRound30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound30Layout.createSequentialGroup()
                .addComponent(lblD31, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelRound30Layout.setVerticalGroup(
            panelRound30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound30Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD31)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound31.setBackground(new java.awt.Color(204, 204, 204));
        panelRound31.setRoundBottomLeft(10);
        panelRound31.setRoundBottomRight(10);
        panelRound31.setRoundTopLeft(10);
        panelRound31.setRoundTopRight(10);

        lblD32.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD32.setForeground(new java.awt.Color(0, 102, 153));
        lblD32.setText("S/ 500 >>");

        javax.swing.GroupLayout panelRound31Layout = new javax.swing.GroupLayout(panelRound31);
        panelRound31.setLayout(panelRound31Layout);
        panelRound31Layout.setHorizontalGroup(
            panelRound31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound31Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblD32)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRound31Layout.setVerticalGroup(
            panelRound31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound31Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD32)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCantidadesLayout = new javax.swing.GroupLayout(panelCantidades);
        panelCantidades.setLayout(panelCantidadesLayout);
        panelCantidadesLayout.setHorizontalGroup(
            panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCantidadesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCantidadesLayout.createSequentialGroup()
                        .addComponent(panelRound28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(panelRound31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCantidadesLayout.createSequentialGroup()
                        .addComponent(panelRound27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCantidadesLayout.createSequentialGroup()
                        .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCantidadesLayout.createSequentialGroup()
                        .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        panelCantidadesLayout.setVerticalGroup(
            panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCantidadesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCantidadesLayout.createSequentialGroup()
                        .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelCantidades);

        panelOtrasCantidades.setBackground(new java.awt.Color(255, 255, 255));

        panelRound33.setBackground(new java.awt.Color(204, 204, 204));
        panelRound33.setRoundBottomLeft(10);
        panelRound33.setRoundBottomRight(10);
        panelRound33.setRoundTopLeft(10);
        panelRound33.setRoundTopRight(10);

        lblD34.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD34.setForeground(new java.awt.Color(0, 102, 153));
        lblD34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD34.setText("Confirmar >>");

        javax.swing.GroupLayout panelRound33Layout = new javax.swing.GroupLayout(panelRound33);
        panelRound33.setLayout(panelRound33Layout);
        panelRound33Layout.setHorizontalGroup(
            panelRound33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblD34, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        panelRound33Layout.setVerticalGroup(
            panelRound33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound33Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD34)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound34.setBackground(new java.awt.Color(204, 204, 204));
        panelRound34.setRoundBottomLeft(10);
        panelRound34.setRoundBottomRight(10);
        panelRound34.setRoundTopLeft(10);
        panelRound34.setRoundTopRight(10);

        lblD35.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD35.setForeground(new java.awt.Color(0, 102, 153));
        lblD35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD35.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound34Layout = new javax.swing.GroupLayout(panelRound34);
        panelRound34.setLayout(panelRound34Layout);
        panelRound34Layout.setHorizontalGroup(
            panelRound34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD35, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound34Layout.setVerticalGroup(
            panelRound34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound34Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD35)
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese el monto a retirar en soles");

        txtCantidades.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        txtCantidades.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout panelOtrasCantidadesLayout = new javax.swing.GroupLayout(panelOtrasCantidades);
        panelOtrasCantidades.setLayout(panelOtrasCantidadesLayout);
        panelOtrasCantidadesLayout.setHorizontalGroup(
            panelOtrasCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrasCantidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOtrasCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(panelOtrasCantidadesLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(panelOtrasCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 116, Short.MAX_VALUE))
        );
        panelOtrasCantidadesLayout.setVerticalGroup(
            panelOtrasCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOtrasCantidadesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidades, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(panelRound33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelRound34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelOtrasCantidades);

        panelOpcionTransferencia.setBackground(new java.awt.Color(255, 255, 255));

        panelRound32.setBackground(new java.awt.Color(204, 204, 204));
        panelRound32.setRoundBottomLeft(10);
        panelRound32.setRoundBottomRight(10);
        panelRound32.setRoundTopLeft(10);
        panelRound32.setRoundTopRight(10);

        lblD33.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD33.setForeground(new java.awt.Color(0, 102, 153));
        lblD33.setText("<< Otras cuentas");

        javax.swing.GroupLayout panelRound32Layout = new javax.swing.GroupLayout(panelRound32);
        panelRound32.setLayout(panelRound32Layout);
        panelRound32Layout.setHorizontalGroup(
            panelRound32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD33, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound32Layout.setVerticalGroup(
            panelRound32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound32Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD33)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound35.setBackground(new java.awt.Color(204, 204, 204));
        panelRound35.setRoundBottomLeft(10);
        panelRound35.setRoundBottomRight(10);
        panelRound35.setRoundTopLeft(10);
        panelRound35.setRoundTopRight(10);

        lblD36.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD36.setForeground(new java.awt.Color(0, 102, 153));
        lblD36.setText("<< Mis cuentas");

        javax.swing.GroupLayout panelRound35Layout = new javax.swing.GroupLayout(panelRound35);
        panelRound35.setLayout(panelRound35Layout);
        panelRound35Layout.setHorizontalGroup(
            panelRound35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound35Layout.setVerticalGroup(
            panelRound35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound35Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD36)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound36.setBackground(new java.awt.Color(204, 204, 204));
        panelRound36.setRoundBottomLeft(10);
        panelRound36.setRoundBottomRight(10);
        panelRound36.setRoundTopLeft(10);
        panelRound36.setRoundTopRight(10);

        lblD37.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD37.setForeground(new java.awt.Color(0, 102, 153));
        lblD37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD37.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound36Layout = new javax.swing.GroupLayout(panelRound36);
        panelRound36.setLayout(panelRound36Layout);
        panelRound36Layout.setHorizontalGroup(
            panelRound36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD37, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound36Layout.setVerticalGroup(
            panelRound36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound36Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD37)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panelOpcionTransferenciaLayout = new javax.swing.GroupLayout(panelOpcionTransferencia);
        panelOpcionTransferencia.setLayout(panelOpcionTransferenciaLayout);
        panelOpcionTransferenciaLayout.setHorizontalGroup(
            panelOpcionTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionTransferenciaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelOpcionTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound32, javax.swing.GroupLayout.PREFERRED_SIZE, 211, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(panelRound36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        panelOpcionTransferenciaLayout.setVerticalGroup(
            panelOpcionTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionTransferenciaLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(panelRound35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelOpcionTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TabbedPane.addTab("tab1", panelOpcionTransferencia);

        panelMisCuentas.setBackground(new java.awt.Color(255, 255, 255));

        txtCuentaLocal1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtCuentaLocal1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuenta Local", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        txtSaldo1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtSaldo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Saldo disponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        cbCuentas.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cbCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mis cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        panelRound37.setBackground(new java.awt.Color(204, 204, 204));
        panelRound37.setRoundBottomLeft(10);
        panelRound37.setRoundBottomRight(10);
        panelRound37.setRoundTopLeft(10);
        panelRound37.setRoundTopRight(10);

        lblD38.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD38.setForeground(new java.awt.Color(0, 102, 153));
        lblD38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD38.setText("Confirmar >>");

        javax.swing.GroupLayout panelRound37Layout = new javax.swing.GroupLayout(panelRound37);
        panelRound37.setLayout(panelRound37Layout);
        panelRound37Layout.setHorizontalGroup(
            panelRound37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblD38, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        panelRound37Layout.setVerticalGroup(
            panelRound37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound37Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD38)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound38.setBackground(new java.awt.Color(204, 204, 204));
        panelRound38.setRoundBottomLeft(10);
        panelRound38.setRoundBottomRight(10);
        panelRound38.setRoundTopLeft(10);
        panelRound38.setRoundTopRight(10);

        lblD39.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD39.setForeground(new java.awt.Color(0, 102, 153));
        lblD39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD39.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound38Layout = new javax.swing.GroupLayout(panelRound38);
        panelRound38.setLayout(panelRound38Layout);
        panelRound38Layout.setHorizontalGroup(
            panelRound38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD39, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound38Layout.setVerticalGroup(
            panelRound38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound38Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD39)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panelMisCuentasLayout = new javax.swing.GroupLayout(panelMisCuentas);
        panelMisCuentas.setLayout(panelMisCuentasLayout);
        panelMisCuentasLayout.setHorizontalGroup(
            panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMisCuentasLayout.createSequentialGroup()
                .addGroup(panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMisCuentasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMisCuentasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCuentaLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMisCuentasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(panelRound37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSaldo1))))
                .addGap(15, 15, 15))
        );
        panelMisCuentasLayout.setVerticalGroup(
            panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMisCuentasLayout.createSequentialGroup()
                .addGroup(panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMisCuentasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(panelMisCuentasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelMisCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuentaLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(cbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addComponent(panelRound38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        TabbedPane.addTab("tab7", panelMisCuentas);

        panelOtrasCuentas.setBackground(new java.awt.Color(255, 255, 255));

        txtCuentaLocal2.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtCuentaLocal2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuenta Local", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        txtCuentaDestino.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtCuentaDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuenta destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        txtSaldo2.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        txtSaldo2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Saldo disponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 14))); // NOI18N

        panelRound39.setBackground(new java.awt.Color(204, 204, 204));
        panelRound39.setRoundBottomLeft(10);
        panelRound39.setRoundBottomRight(10);
        panelRound39.setRoundTopLeft(10);
        panelRound39.setRoundTopRight(10);

        lblD40.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD40.setForeground(new java.awt.Color(0, 102, 153));
        lblD40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD40.setText("Confirmar >>");

        javax.swing.GroupLayout panelRound39Layout = new javax.swing.GroupLayout(panelRound39);
        panelRound39.setLayout(panelRound39Layout);
        panelRound39Layout.setHorizontalGroup(
            panelRound39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblD40, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        panelRound39Layout.setVerticalGroup(
            panelRound39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound39Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblD40)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound40.setBackground(new java.awt.Color(204, 204, 204));
        panelRound40.setRoundBottomLeft(10);
        panelRound40.setRoundBottomRight(10);
        panelRound40.setRoundTopLeft(10);
        panelRound40.setRoundTopRight(10);

        lblD41.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        lblD41.setForeground(new java.awt.Color(0, 102, 153));
        lblD41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblD41.setText("Cancelar >>");

        javax.swing.GroupLayout panelRound40Layout = new javax.swing.GroupLayout(panelRound40);
        panelRound40.setLayout(panelRound40Layout);
        panelRound40Layout.setHorizontalGroup(
            panelRound40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD41, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound40Layout.setVerticalGroup(
            panelRound40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound40Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblD41)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panelOtrasCuentasLayout = new javax.swing.GroupLayout(panelOtrasCuentas);
        panelOtrasCuentas.setLayout(panelOtrasCuentasLayout);
        panelOtrasCuentasLayout.setHorizontalGroup(
            panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOtrasCuentasLayout.createSequentialGroup()
                .addGroup(panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOtrasCuentasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                                .addComponent(txtCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                                .addComponent(txtCuentaLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addGroup(panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(panelRound39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(txtSaldo2)))))))
                .addGap(15, 15, 15))
        );
        panelOtrasCuentasLayout.setVerticalGroup(
            panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtrasCuentasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelOtrasCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuentaLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelRound39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panelRound40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        TabbedPane.addTab("tab7", panelOtrasCuentas);

        panelBase.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -31, 640, 340));

        btnD1.setBackground(new java.awt.Color(204, 204, 204));
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });

        btnD2.setBackground(new java.awt.Color(204, 204, 204));
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });

        btnD3.setBackground(new java.awt.Color(204, 204, 204));
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });

        btnD4.setBackground(new java.awt.Color(204, 204, 204));
        btnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD4ActionPerformed(evt);
            }
        });

        btnI4.setBackground(new java.awt.Color(204, 204, 204));
        btnI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI4ActionPerformed(evt);
            }
        });

        btnI3.setBackground(new java.awt.Color(204, 204, 204));
        btnI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI3ActionPerformed(evt);
            }
        });

        btnI2.setBackground(new java.awt.Color(204, 204, 204));
        btnI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI2ActionPerformed(evt);
            }
        });

        btnI1.setBackground(new java.awt.Color(204, 204, 204));
        btnI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorderLayout = new javax.swing.GroupLayout(panelBorder);
        panelBorder.setLayout(panelBorderLayout);
        panelBorderLayout.setHorizontalGroup(
            panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderLayout.createSequentialGroup()
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorderLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnI1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelBorderLayout.setVerticalGroup(
            panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderLayout.createSequentialGroup()
                        .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderLayout.createSequentialGroup()
                        .addComponent(btnI1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnI2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnI3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnI4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        if (panelInicial.isShowing()) {//si estoy en el panel inicio me dirigo al panel de retiro
            TabbedPane.setSelectedIndex(2);
        } else if (panelCantidades.isShowing()) {//si estoy en panel de cantidades realizo el retiro de la cantidad de 20 soles y me dirigo al panel de consultas
            cantidades = 20;
            realizarRetiro(cantidades);
        }
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI4ActionPerformed
        if (panelInicial.isShowing()) {//si estoy en el panel principal me dirigo al panel de consultas
            TabbedPane.setSelectedIndex(1);
        } else {//caso contrario si me encuentro en otro panel simplemente salgo y me dirigo al panel inicio
            TabbedPane.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnI4ActionPerformed

    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        if (panelConsultas.isShowing()) {//se imprime la cantidad disponible y el saldo
            JOptionPane.showMessageDialog(null, "Monto: " + cantidades + "\nMonto inicial: " + (debito.buscar(tarjetaDebito.getNumeroTarjeta()).getSaldo()));
        } else if (panelCantidades.isShowing()) {//retiro de 200
            cantidades = 200;
            realizarRetiro(cantidades);
        } else if (panelInicial.isShowing()) {//Si voy a realizar un deposito
            cantidades = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que desea depositar cantidad"));
            realizarDeposito(cantidades);
        } else if (panelOpcionTransferencia.isShowing()) {
            //me dirigo a el panel de otras cuentas
            TabbedPane.setSelectedIndex(8);//me dirigo al panel de otra cuentas
        }
    }//GEN-LAST:event_btnD4ActionPerformed

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        if (panelConsultas.isShowing()) {
            jTextArea1.append(ultimaTransaccion);
        } else if (panelCantidades.isShowing()) {//retiro de 100
            cantidades = 100;
            realizarRetiro(cantidades);
        } else if (panelOpcionTransferencia.isShowing()) {
            TabbedPane.setSelectedIndex(7);//me dirigo al panel de mis cuentas
        }
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        if (panelRetiro.isShowing()) {//soles
            TabbedPane.setSelectedIndex(4);//me dirigo al panel de otrasCantides
        } else if (panelCantidades.isShowing()) {//retiro de 50
            cantidades = 50;
            realizarRetiro(cantidades);
        }
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI1ActionPerformed
        if (panelCantidades.isShowing()) {//si estoy en panel de cantidades realizo el retiro de la cantidad de 500 soles y me dirigo al panel de consultas
            cantidades = 500;
            realizarRetiro(cantidades);
        } else if (panelInicial.isShowing()) {//si estoy en el panel inicial me dirigo al panel de opciones de transferencia
            TabbedPane.setSelectedIndex(6);
        }
    }//GEN-LAST:event_btnI1ActionPerformed

    private void btnI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI2ActionPerformed
        if (panelCantidades.isShowing()) {//retiro de 3000
            cantidades = 3000;
            realizarRetiro(cantidades);
        }

    }//GEN-LAST:event_btnI2ActionPerformed

    private void btnI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI3ActionPerformed
        if (panelCantidades.isShowing()) {
            TabbedPane.setSelectedIndex(5);//me dirigo a el panel otras cantidades
        } else if (panelOtrasCantidades.isShowing()) {//[panelOtrasCantidades]panel de otras cantidades para retirar una cantidad ingresadad por teclado
            realizarRetiro(getCantidades());
        } else if (panelMisCuentas.isShowing()) {//Si estoy en el panel de misCuentas y desea realizar una transaccion
            cantidades = Float.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad que desea enviar"));
            realizarTransaccion(cantidades, getCuentaDestino());
        } else if (panelOtrasCuentas.isShowing()) {//SI estoy en el panel de OtrasCuentas y confirmo una transaccion a otras cuentas
            cantidades = Float.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad que desea enviar"));
            realizarTransaccion(cantidades, getOtrasCuentas());
        }
    }//GEN-LAST:event_btnI3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FormTarjeta().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void realizarRetiro(float cantidades) {
        String clave = JOptionPane.showInputDialog("Ingrese su clave");
        if (clave.equals(cuenta.getContraseña())) {
            if (cantidades <= tarjetaDebito.getSaldo()) {
                ultimaTransaccion = Transacciones.Retiro(cliente.getDNI(), tarjetaDebito.getNumeroTarjeta(), cantidades);
                if (!ultimaTransaccion.isEmpty()) {
                    tarjetaDebito = debito.buscar(tarjetaDebito.getNumeroTarjeta());
                    TabbedPane.setSelectedIndex(1);
                    txtCuentaLocal1.setText(cuenta.getNumeroCuenta());
                    txtCuentaLocal2.setText(cuenta.getNumeroCuenta());
                    txtSaldo1.setText(String.valueOf(tarjetaDebito.getSaldo()));
                    txtSaldo2.setText(String.valueOf(tarjetaDebito.getSaldo()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usted no cuenta con esa cantidad de dinero");
            }
        } else {
            JOptionPane.showMessageDialog(null, "clave incorrecta");
        }
    }

    public void realizarDeposito(float cantidades) {
        String clave = JOptionPane.showInputDialog("Ingrese su clave");
        if (clave.equals(cuenta.getContraseña())) {
            if (cantidades <= tarjetaDebito.getSaldo()) {
                ultimaTransaccion = Transacciones.Deposito(cliente.getDNI(), tarjetaDebito.getNumeroTarjeta(), cantidades);
                if (!ultimaTransaccion.isEmpty()) {
                    tarjetaDebito = debito.buscar(tarjetaDebito.getNumeroTarjeta());
                    TabbedPane.setSelectedIndex(1);
                    txtCuentaLocal1.setText(cuenta.getNumeroCuenta());
                    txtCuentaLocal2.setText(cuenta.getNumeroCuenta());
                    txtSaldo1.setText(String.valueOf(tarjetaDebito.getSaldo()));
                    txtSaldo2.setText(String.valueOf(tarjetaDebito.getSaldo()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usted no cuenta con esa cantidad de dinero");
            }
        } else {
            JOptionPane.showMessageDialog(null, "clave incorrecta");
            //salimos
        }
    }

    public void realizarTransaccion(float cantidades, String cuentaDestino) {
        String clave = JOptionPane.showInputDialog("Ingrese su clave");
        if (clave.equals(cuenta.getContraseña())) {
            if (cantidades <= tarjetaDebito.getSaldo()) {
                ultimaTransaccion = Transacciones.realizarTransaccion(cliente.getDNI(), cuentaDestino, tarjetaDebito.getNumeroTarjeta(), cantidades);
                if (!ultimaTransaccion.isEmpty()) {
                    tarjetaDebito = debito.buscar(tarjetaDebito.getNumeroTarjeta());
                    TabbedPane.setSelectedIndex(1);
                    txtCuentaLocal1.setText(cuenta.getNumeroCuenta());
                    txtCuentaLocal2.setText(cuenta.getNumeroCuenta());
                    txtSaldo1.setText(String.valueOf(tarjetaDebito.getSaldo()));
                    txtSaldo2.setText(String.valueOf(tarjetaDebito.getSaldo()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usted no cuenta con esa cantidad de dinero");
            }
        } else {
            JOptionPane.showMessageDialog(null, "clave incorrecta");
            //salimos
        }
    }

    public float getCantidades() {
        return Float.parseFloat(txtCantidades.getText());
    }

    public String getCuentaDestino() {
        return cbCuentas.getSelectedItem().toString();
    }

    public String getOtrasCuentas() {
        return txtCuentaDestino.getText();
    }

    private String getNumeroCuenta() {
        return cbCuentas.getSelectedIndex() != 0 ? cbCuentas.getSelectedItem().toString() : "";
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cajero(null, null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnD3;
    private javax.swing.JButton btnD4;
    private javax.swing.JButton btnI1;
    private javax.swing.JButton btnI2;
    private javax.swing.JButton btnI3;
    private javax.swing.JButton btnI4;
    private javax.swing.JComboBox<String> cbCuentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD10;
    private javax.swing.JLabel lblD11;
    private javax.swing.JLabel lblD12;
    private javax.swing.JLabel lblD13;
    private javax.swing.JLabel lblD14;
    private javax.swing.JLabel lblD15;
    private javax.swing.JLabel lblD16;
    private javax.swing.JLabel lblD17;
    private javax.swing.JLabel lblD18;
    private javax.swing.JLabel lblD19;
    private javax.swing.JLabel lblD2;
    private javax.swing.JLabel lblD20;
    private javax.swing.JLabel lblD21;
    private javax.swing.JLabel lblD22;
    private javax.swing.JLabel lblD23;
    private javax.swing.JLabel lblD24;
    private javax.swing.JLabel lblD25;
    private javax.swing.JLabel lblD26;
    private javax.swing.JLabel lblD27;
    private javax.swing.JLabel lblD28;
    private javax.swing.JLabel lblD29;
    private javax.swing.JLabel lblD3;
    private javax.swing.JLabel lblD30;
    private javax.swing.JLabel lblD31;
    private javax.swing.JLabel lblD32;
    private javax.swing.JLabel lblD33;
    private javax.swing.JLabel lblD34;
    private javax.swing.JLabel lblD35;
    private javax.swing.JLabel lblD36;
    private javax.swing.JLabel lblD37;
    private javax.swing.JLabel lblD38;
    private javax.swing.JLabel lblD39;
    private javax.swing.JLabel lblD4;
    private javax.swing.JLabel lblD40;
    private javax.swing.JLabel lblD41;
    private javax.swing.JLabel lblD6;
    private javax.swing.JLabel lblD7;
    private javax.swing.JLabel lblD8;
    private javax.swing.JLabel lblD9;
    private javax.swing.JLabel lblI1;
    private javax.swing.JLabel lblI2;
    private javax.swing.JLabel lblI3;
    private javax.swing.JLabel lblI4;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelCantidades;
    private javax.swing.JPanel panelConsultas;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelMisCuentas;
    private javax.swing.JPanel panelOpcionTransferencia;
    private javax.swing.JPanel panelOtrasCantidades;
    private javax.swing.JPanel panelOtrasCuentas;
    private javax.swing.JPanel panelRetiro;
    private com.company.componentframe.PanelRound panelRound1;
    private com.company.componentframe.PanelRound panelRound11;
    private com.company.componentframe.PanelRound panelRound12;
    private com.company.componentframe.PanelRound panelRound13;
    private com.company.componentframe.PanelRound panelRound14;
    private com.company.componentframe.PanelRound panelRound15;
    private com.company.componentframe.PanelRound panelRound16;
    private com.company.componentframe.PanelRound panelRound17;
    private com.company.componentframe.PanelRound panelRound18;
    private com.company.componentframe.PanelRound panelRound19;
    private com.company.componentframe.PanelRound panelRound2;
    private com.company.componentframe.PanelRound panelRound20;
    private com.company.componentframe.PanelRound panelRound21;
    private com.company.componentframe.PanelRound panelRound22;
    private com.company.componentframe.PanelRound panelRound23;
    private com.company.componentframe.PanelRound panelRound24;
    private com.company.componentframe.PanelRound panelRound25;
    private com.company.componentframe.PanelRound panelRound26;
    private com.company.componentframe.PanelRound panelRound27;
    private com.company.componentframe.PanelRound panelRound28;
    private com.company.componentframe.PanelRound panelRound29;
    private com.company.componentframe.PanelRound panelRound3;
    private com.company.componentframe.PanelRound panelRound30;
    private com.company.componentframe.PanelRound panelRound31;
    private com.company.componentframe.PanelRound panelRound32;
    private com.company.componentframe.PanelRound panelRound33;
    private com.company.componentframe.PanelRound panelRound34;
    private com.company.componentframe.PanelRound panelRound35;
    private com.company.componentframe.PanelRound panelRound36;
    private com.company.componentframe.PanelRound panelRound37;
    private com.company.componentframe.PanelRound panelRound38;
    private com.company.componentframe.PanelRound panelRound39;
    private com.company.componentframe.PanelRound panelRound4;
    private com.company.componentframe.PanelRound panelRound40;
    private com.company.componentframe.PanelRound panelRound6;
    private com.company.componentframe.PanelRound panelRound7;
    private com.company.componentframe.PanelRound panelRound8;
    private com.company.componentframe.PanelRound panelRound9;
    private com.company.componentframe.PanelRound panelRoundConsultas;
    private com.company.componentframe.PanelRound panelRoundDeposito;
    private com.company.componentframe.PanelRound panelRoundDolares;
    private com.company.componentframe.PanelRound panelRoundRetiro;
    private com.company.componentframe.PanelRound panelRoundSoles;
    private com.company.componentframe.PanelRound panelRoundTransferencia;
    private javax.swing.JPanel panelTipoMoneda;
    private javax.swing.JTextField txtCantidades;
    private javax.swing.JTextField txtCuentaDestino;
    private javax.swing.JTextField txtCuentaLocal1;
    private javax.swing.JTextField txtCuentaLocal2;
    private javax.swing.JTextField txtSaldo1;
    private javax.swing.JTextField txtSaldo2;
    // End of variables declaration//GEN-END:variables
}
