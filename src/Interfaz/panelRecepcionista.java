package Interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import javax.swing.Popup;

public class panelRecepcionista extends javax.swing.JPanel {

    private URL url = getClass().getResource("/Imagenes/Fondo_perfiles.png");
    private Image image = new ImageIcon(url).getImage();
    private String nombreHuesped;
    private String apellidoHuesped;
    private long documentoHuesped;
    private long telefonoHuesped;
    private String fechaNacHuesped;
    private String modoPagoHuesped;
    private String placaHuesped;

    private String nombreAcompanante;
    private String apellidoAcompanante;
    private long documentoAcompanante;
    private long telefonoAcompanante;
    private String fechaNacAcompanante;
    
    private CRUD cn = new CRUD();
    JPopupMenu error = new JPopupMenu("Hola mundo");

    public panelRecepcionista() {
        initComponents();
    }

    public void paint(Graphics g) {

        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error1 = new javax.swing.JPopupMenu();
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
        jPanel1 = new javax.swing.JPanel();
        documentoCliente = new javax.swing.JTextField();
        botonGuardarResponsable = new javax.swing.JButton();
        telefonoCliente = new javax.swing.JTextField();
        fechaNacCliente = new javax.swing.JTextField();
        modoPagoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apellidoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        placaCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nuevoAcompanante = new javax.swing.JButton();
        botonGuardarAuto = new javax.swing.JButton();
        botonGuardarResponsable1 = new javax.swing.JButton();

        error1.setToolTipText("12335");
        error1.setInvoker(fechaNacCliente);
        error1.setLabel("Formato de fecha incorrecto");

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

        setPreferredSize(new java.awt.Dimension(800, 600));

        documentoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                documentoClienteKeyReleased(evt);
            }
        });

        botonGuardarResponsable.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonGuardarResponsable.setText("Guardar");
        botonGuardarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarResponsableActionPerformed(evt);
            }
        });

        telefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoClienteKeyReleased(evt);
            }
        });

        fechaNacCliente.setToolTipText("Formato fecha: AAAA-MM-DD");
        fechaNacCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaNacClienteKeyReleased(evt);
            }
        });

        modoPagoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modoPagoClienteKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Telefono");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Documento de identificacion");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro de nuevo huesped");

        nombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreClienteKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de Nacimiento");

        apellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoClienteKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Modo de pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(documentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modoPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel1)
                        .addComponent(botonGuardarResponsable))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel5)
                    .addGap(0, 0, 0)
                    .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(documentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fechaNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(modoPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(botonGuardarResponsable)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Automovil");

        placaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placaClienteKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Placa");

        nuevoAcompanante.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        nuevoAcompanante.setText("Registrar Huesped Acompañante");
        nuevoAcompanante.setEnabled(false);
        nuevoAcompanante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAcompananteActionPerformed(evt);
            }
        });

        botonGuardarAuto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        botonGuardarAuto.setText("Guardar");
        botonGuardarAuto.setEnabled(false);
        botonGuardarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(placaCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardarAuto))
                    .addComponent(nuevoAcompanante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarAuto))
                .addGap(18, 18, 18)
                .addComponent(nuevoAcompanante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonGuardarResponsable1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonGuardarResponsable1.setText("Cerrar sesión");
        botonGuardarResponsable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarResponsable1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(botonGuardarResponsable1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardarResponsable1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarResponsableActionPerformed
        cn.insertarHuesped(documentoHuesped, nombreHuesped, apellidoHuesped, telefonoHuesped, 
                fechaNacHuesped, modoPagoHuesped, 0, 0);
        botonGuardarAuto.setEnabled(true);
        nuevoAcompanante.setEnabled(true);
    }//GEN-LAST:event_botonGuardarResponsableActionPerformed

    private void nombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreClienteKeyReleased
        nombreHuesped = nombreCliente.getText();
    }//GEN-LAST:event_nombreClienteKeyReleased

    private void apellidoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoClienteKeyReleased
        apellidoHuesped = apellidoCliente.getText();
    }//GEN-LAST:event_apellidoClienteKeyReleased

    private void documentoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoClienteKeyReleased
        documentoHuesped = Long.parseLong(documentoCliente.getText());
    }//GEN-LAST:event_documentoClienteKeyReleased

    private void telefonoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoClienteKeyReleased
        telefonoHuesped = Long.parseLong(telefonoCliente.getText());
    }//GEN-LAST:event_telefonoClienteKeyReleased

    private void fechaNacClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaNacClienteKeyReleased
        fechaNacHuesped = fechaNacCliente.getText();

        if (fechaNacHuesped.length() >= 10) {
            System.out.println(fechaNacHuesped.substring(0, 4));
            System.out.println(fechaNacHuesped.substring(4, 5));
            System.out.println(fechaNacHuesped.substring(5, 7));
            System.out.println(fechaNacHuesped.substring(7, 8));
            System.out.println(fechaNacHuesped.substring(8, 10));

        }

    }//GEN-LAST:event_fechaNacClienteKeyReleased

    private void modoPagoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modoPagoClienteKeyReleased
        modoPagoHuesped = modoPagoCliente.getText();
    }//GEN-LAST:event_modoPagoClienteKeyReleased

    private void placaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaClienteKeyReleased
        placaHuesped = placaCliente.getText();
    }//GEN-LAST:event_placaClienteKeyReleased

    private void nuevoAcompananteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAcompananteActionPerformed
        ventanaHuesped.setLocationRelativeTo(this);
        ventanaHuesped.setVisible(true);
        System.out.println("Ventana");
    }//GEN-LAST:event_nuevoAcompananteActionPerformed

    private void documentoAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoAcompananteTextKeyReleased
        documentoAcompanante = Long.parseLong(documentoAcompananteText.getText());
    }//GEN-LAST:event_documentoAcompananteTextKeyReleased

    private void buttonAcompananteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcompananteActionPerformed
        cn.insertarHuesped(documentoAcompanante, nombreAcompanante, apellidoAcompanante,
                telefonoAcompanante, fechaNacAcompanante, "", documentoHuesped, 1);
    }//GEN-LAST:event_buttonAcompananteActionPerformed

    private void telefonoAcompananteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoAcompananteTextKeyReleased
        telefonoAcompanante = Long.parseLong(telefonoAcompananteText.getText());
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

    private void botonGuardarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarAutoActionPerformed

    private void botonGuardarResponsable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarResponsable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarResponsable1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoAcompananteText;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JButton botonGuardarAuto;
    private javax.swing.JButton botonGuardarResponsable;
    private javax.swing.JButton botonGuardarResponsable1;
    private javax.swing.JButton buttonAcompanante;
    private javax.swing.JTextField documentoAcompananteText;
    private javax.swing.JTextField documentoCliente;
    private javax.swing.JPopupMenu error1;
    private javax.swing.JTextField fechaNacAcompananteText;
    private javax.swing.JTextField fechaNacCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField modoPagoCliente;
    private javax.swing.JTextField nombreAcompananteText;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JButton nuevoAcompanante;
    private javax.swing.JTextField placaCliente;
    private javax.swing.JTextField telefonoAcompananteText;
    private javax.swing.JTextField telefonoCliente;
    private javax.swing.JDialog ventanaHuesped;
    // End of variables declaration//GEN-END:variables
}
