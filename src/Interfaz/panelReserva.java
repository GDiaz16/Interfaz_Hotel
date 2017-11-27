package Interfaz;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class panelReserva extends javax.swing.JPanel {

    private CRUD cn = new CRUD();
    private String placaHuesped;
    private String nombreAcompanante;
    private String apellidoAcompanante;
    private long documentoAcompanante;
    private long telefonoAcompanante;
    private String fechaNacAcompanante;

    private String fechaInicio;
    private String fechaFin;
    private int abono;
    private int saldoTotal;
    private int numeroHabitacion;
    private long documentoHuesped;

    public panelReserva(long idHuesped) {
        documentoHuesped = idHuesped;
        initComponents();
    }
public void anotherComponents() {
        Integer[] habitaciones = new Integer[cn.habitacionesLibres().size()];
        listaHabitaciones.setModel(new DefaultComboBoxModel());
        listaHabitaciones.setLocation(600, 500);
        listaHabitaciones.setVisible(true);

        this.add(listaUsuarios);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaHuesped = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        documentoAcompananteText = new javax.swing.JTextField();
        buttonAcompanante = new javax.swing.JButton();
        telefonoAcompananteText = new javax.swing.JTextField();
        fechaNacAcompananteText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombreAcompananteText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        apellidoAcompananteText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        placaCliente = new javax.swing.JTextField();
        botonGuardarAuto = new javax.swing.JButton();
        nuevoAcompanante = new javax.swing.JButton();
        listaHabitaciones = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        ventanaHuesped.setTitle("Acompañante");
        ventanaHuesped.setMinimumSize(new java.awt.Dimension(380, 460));
        ventanaHuesped.setModal(true);
        ventanaHuesped.setResizable(false);

        documentoAcompananteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                documentoAcompananteTextKeyReleased(evt);
            }
        });

        buttonAcompanante.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        buttonAcompanante.setText("Guardar");
        buttonAcompanante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcompananteActionPerformed(evt);
            }
        });

        telefonoAcompananteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoAcompananteTextKeyReleased(evt);
            }
        });

        fechaNacAcompananteText.setToolTipText("Formato fecha: AAAA-MM-DD");
        fechaNacAcompananteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaNacAcompananteTextKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apellido");

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Documento de identificacion");

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Registro de nuevo acompañante");

        nombreAcompananteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreAcompananteTextKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Fecha de Nacimiento");

        apellidoAcompananteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoAcompananteTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(buttonAcompanante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(documentoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaNacAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(nombreAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(apellidoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(buttonAcompanante)
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel13)
                    .addGap(0, 0, 0)
                    .addComponent(nombreAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(apellidoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(documentoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telefonoAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fechaNacAcompananteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ventanaHuespedLayout = new javax.swing.GroupLayout(ventanaHuesped.getContentPane());
        ventanaHuesped.getContentPane().setLayout(ventanaHuespedLayout);
        ventanaHuespedLayout.setHorizontalGroup(
            ventanaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaHuespedLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ventanaHuespedLayout.setVerticalGroup(
            ventanaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaHuespedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBackground(java.awt.SystemColor.inactiveCaption);
        setMinimumSize(new java.awt.Dimension(620, 500));

        jLabel19.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 119, 198));
        jLabel19.setText("NUEVA RESERVACION");

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel21.setText("Fecha inicio");

        jTextField1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel20.setText("Fecha fin");

        jTextField4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel23.setText("Abono");

        jTextField2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel25.setText("Saldo total");

        jTextField3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel24.setText("Numero de habitacion");

        jLabel26.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel26.setText("Documento cliente responsable");

        jTextField6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setText("Guardar reservacion");

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Automovil");

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Placa");

        placaCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        placaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaClienteActionPerformed(evt);
            }
        });
        placaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placaClienteKeyReleased(evt);
            }
        });

        botonGuardarAuto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        botonGuardarAuto.setText("Guardar");
        botonGuardarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarAutoActionPerformed(evt);
            }
        });

        nuevoAcompanante.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        nuevoAcompanante.setText("Registrar Huesped Acompañante");
        nuevoAcompanante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAcompananteActionPerformed(evt);
            }
        });

        listaHabitaciones.setBackground(new java.awt.Color(208, 217, 127));
        listaHabitaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        listaHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaHabitaciones.setAlignmentX(600.0F);
        listaHabitaciones.setAlignmentY(2000.0F);
        listaHabitaciones.setBorder(null);
        listaHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaHabitacionesActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel27.setText("Habitacion numero:");

        jLabel28.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel28.setText("Numero de cuartos:");

        jLabel29.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel29.setText("Numero de camas:");

        jLabel30.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel30.setText("Vip:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel22.setText("Datos de la habitacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaHabitaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(placaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonGuardarAuto))
                                    .addComponent(nuevoAcompanante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(48, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(placaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonGuardarAuto))
                                .addGap(15, 15, 15)
                                .addComponent(nuevoAcompanante)))
                        .addGap(11, 11, 11)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(4, 4, 4)
                        .addComponent(listaHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel22)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaClienteActionPerformed

    private void placaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaClienteKeyReleased
        placaHuesped = placaCliente.getText();
    }//GEN-LAST:event_placaClienteKeyReleased

    private void nuevoAcompananteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAcompananteActionPerformed
        System.out.println("Ventana");
        ventanaHuesped.setLocationRelativeTo(this);
        ventanaHuesped.setVisible(true);
    }//GEN-LAST:event_nuevoAcompananteActionPerformed

    private void botonGuardarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarAutoActionPerformed
        cn.insertarAuto(placaHuesped, documentoHuesped);
    }//GEN-LAST:event_botonGuardarAutoActionPerformed

    private void documentoAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoAcompananteTextKeyReleased
        try {
            documentoAcompanante = Long.parseLong(documentoAcompananteText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_documentoAcompananteTextKeyReleased

    private void buttonAcompananteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcompananteActionPerformed
        System.out.println("Responsable: " + documentoHuesped);
        cn.insertarHuesped(documentoAcompanante, nombreAcompanante, apellidoAcompanante,
                telefonoAcompanante, fechaNacAcompanante, "", documentoHuesped, 1);
    }//GEN-LAST:event_buttonAcompananteActionPerformed

    private void telefonoAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoAcompananteTextKeyReleased
        try {
            telefonoAcompanante = Long.parseLong(telefonoAcompananteText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_telefonoAcompananteTextKeyReleased

    private void fechaNacAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaNacAcompananteTextKeyReleased
        fechaNacAcompanante = fechaNacAcompananteText.getText();

        if (fechaNacAcompanante.length() >= 10) {
            System.out.println(fechaNacAcompanante.substring(0, 4));
            System.out.println(fechaNacAcompanante.substring(4, 5));
            System.out.println(fechaNacAcompanante.substring(5, 7));
            System.out.println(fechaNacAcompanante.substring(7, 8));
            System.out.println(fechaNacAcompanante.substring(8, 10));

        }
    }//GEN-LAST:event_fechaNacAcompananteTextKeyReleased

    private void nombreAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAcompananteTextKeyReleased
        nombreAcompanante = nombreAcompananteText.getText();
    }//GEN-LAST:event_nombreAcompananteTextKeyReleased

    private void apellidoAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoAcompananteTextKeyReleased
        apellidoAcompanante = apellidoAcompananteText.getText();
    }//GEN-LAST:event_apellidoAcompananteTextKeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        fechaInicio = jTextField1.getText();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        fechaFin = jTextField4.getText();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        try {
            abono = Integer.parseInt(jTextField2.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        try {
           saldoTotal = Integer.parseInt(jTextField3.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void listaHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaHabitacionesActionPerformed

    }//GEN-LAST:event_listaHabitacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoAcompananteText;
    private javax.swing.JButton botonGuardarAuto;
    private javax.swing.JButton buttonAcompanante;
    private javax.swing.JTextField documentoAcompananteText;
    private javax.swing.JTextField fechaNacAcompananteText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox<String> listaHabitaciones;
    private javax.swing.JTextField nombreAcompananteText;
    private javax.swing.JButton nuevoAcompanante;
    private javax.swing.JTextField placaCliente;
    private javax.swing.JTextField telefonoAcompananteText;
    private javax.swing.JDialog ventanaHuesped;
    // End of variables declaration//GEN-END:variables
}
