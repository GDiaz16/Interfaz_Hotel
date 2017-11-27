package Interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

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
    ArrayList<huesped> huespedes = new ArrayList<>();
    private int habitacion;

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

    public void cargarHuespedes() {
        for (int i = 0; i < cn.IDs.size(); i++) {
            huespedes.add(new huesped(cn.nombres.get(i), cn.apellidos.get(i), cn.telefonos.get(i), cn.IDs.get(i)));

        }
        for (huesped huesped : huespedes) {
            huesped.setVisible(true);
            jPanel5.add(huesped);
        }
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
        jDialogResHuespedes = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jDialogReservacion = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
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
        botonGuardarResponsable1 = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        habEspecificaText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        buttonHabEspecifica = new javax.swing.JButton();
        buttonResumenHuespedes = new javax.swing.JButton();
        dispHabitacionLabel = new javax.swing.JLabel();
        botonClienteExistente = new javax.swing.JButton();

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

        jDialogResHuespedes.setTitle("Huespes registrados en el hotel");
        jDialogResHuespedes.setMinimumSize(new java.awt.Dimension(420, 490));
        jDialogResHuespedes.setResizable(false);

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel18.setText("Huespedes actuales");

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout jDialogResHuespedesLayout = new javax.swing.GroupLayout(jDialogResHuespedes.getContentPane());
        jDialogResHuespedes.getContentPane().setLayout(jDialogResHuespedesLayout);
        jDialogResHuespedesLayout.setHorizontalGroup(
            jDialogResHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogResHuespedesLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel18)
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jDialogResHuespedesLayout.setVerticalGroup(
            jDialogResHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogResHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        jDialogReservacion.setTitle("Reservacion");
        jDialogReservacion.setMinimumSize(new java.awt.Dimension(620, 500));
        jDialogReservacion.setModal(true);
        jDialogReservacion.setResizable(false);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jDialogReservacionLayout = new javax.swing.GroupLayout(jDialogReservacion.getContentPane());
        jDialogReservacion.getContentPane().setLayout(jDialogReservacionLayout);
        jDialogReservacionLayout.setHorizontalGroup(
            jDialogReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        jDialogReservacionLayout.setVerticalGroup(
            jDialogReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(800, 630));
        setPreferredSize(new java.awt.Dimension(800, 630));

        documentoCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        documentoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                documentoClienteKeyReleased(evt);
            }
        });

        botonGuardarResponsable.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonGuardarResponsable.setText("Hacer Reservacion");
        botonGuardarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarResponsableActionPerformed(evt);
            }
        });

        telefonoCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        telefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoClienteKeyReleased(evt);
            }
        });

        fechaNacCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        fechaNacCliente.setToolTipText("Formato fecha: AAAA-MM-DD");
        fechaNacCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaNacClienteKeyReleased(evt);
            }
        });

        modoPagoCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
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

        nombreCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        nombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreClienteKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de Nacimiento");

        apellidoCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        apellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoClienteKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Modo de pago");

        botonGuardarResponsable1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        botonGuardarResponsable1.setText("Limpiar");
        botonGuardarResponsable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarResponsable1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(botonGuardarResponsable1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(botonGuardarResponsable)))
                .addContainerGap(58, Short.MAX_VALUE))
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
                        .addComponent(jLabel1))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(botonGuardarResponsable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardarResponsable1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        botonCerrarSesion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonCerrarSesion.setText("Cerrar sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Consultas");

        habEspecificaText.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        habEspecificaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habEspecificaTextKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Habitacion especifica");

        buttonHabEspecifica.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        buttonHabEspecifica.setText("Buscar");
        buttonHabEspecifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHabEspecificaActionPerformed(evt);
            }
        });

        buttonResumenHuespedes.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        buttonResumenHuespedes.setText("Listado de huespedes actuales");
        buttonResumenHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResumenHuespedesActionPerformed(evt);
            }
        });

        dispHabitacionLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        dispHabitacionLabel.setForeground(new java.awt.Color(51, 51, 51));
        dispHabitacionLabel.setText("--");

        botonClienteExistente.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonClienteExistente.setText("Reserva cliente existente");
        botonClienteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteExistenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(185, 185, 185))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(habEspecificaText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonHabEspecifica)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonClienteExistente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonResumenHuespedes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispHabitacionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habEspecificaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHabEspecifica))
                .addGap(2, 2, 2)
                .addComponent(dispHabitacionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonResumenHuespedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonClienteExistente)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(botonCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCerrarSesion)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarResponsableActionPerformed
        cn.insertarHuesped(documentoHuesped, nombreHuesped, apellidoHuesped, telefonoHuesped,
                fechaNacHuesped, modoPagoHuesped, 0, 0);
        if (cn.retorno) {
            jPanel6.removeAll();
            jPanel6.add(new panelReserva(documentoHuesped, false));
            jDialogReservacion.setLocationRelativeTo(this);
            jDialogReservacion.setVisible(true);

        }
    }//GEN-LAST:event_botonGuardarResponsableActionPerformed

    private void nombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreClienteKeyReleased
        nombreHuesped = nombreCliente.getText();
    }//GEN-LAST:event_nombreClienteKeyReleased

    private void apellidoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoClienteKeyReleased
        apellidoHuesped = apellidoCliente.getText();
    }//GEN-LAST:event_apellidoClienteKeyReleased

    private void documentoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoClienteKeyReleased
        try {
            documentoHuesped = Long.parseLong(documentoCliente.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_documentoClienteKeyReleased

    private void telefonoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoClienteKeyReleased
        try {
            telefonoHuesped = Long.parseLong(telefonoCliente.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }

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

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        cn.cerrarConexion();
        this.setVisible(false);
        this.getTopLevelAncestor().add(new Inicio());
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void buttonResumenHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResumenHuespedesActionPerformed
        jDialogResHuespedes.setLocationRelativeTo(this);
        jDialogResHuespedes.setVisible(true);
        cn.consultaHuespedes();
        cargarHuespedes();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);

    }//GEN-LAST:event_buttonResumenHuespedesActionPerformed

    private void buttonHabEspecificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHabEspecificaActionPerformed
        dispHabitacionLabel.setText(cn.habFavorita(habitacion));
        if (cn.habFavorita(habitacion).equalsIgnoreCase("Disponible")) {
            dispHabitacionLabel.setForeground(Color.GREEN.darker());
        } else if (cn.habFavorita(habitacion).equalsIgnoreCase("No disponible")) {
            dispHabitacionLabel.setForeground(Color.red);
        } else {
            dispHabitacionLabel.setForeground(Color.black);
        }
    }//GEN-LAST:event_buttonHabEspecificaActionPerformed

    private void habEspecificaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habEspecificaTextKeyReleased
        try {
            habitacion = Integer.parseInt(habEspecificaText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "Error de dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_habEspecificaTextKeyReleased

    private void botonClienteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteExistenteActionPerformed
        jPanel6.removeAll();
        jPanel6.add(new panelReserva(documentoHuesped, true));
        jDialogReservacion.setLocationRelativeTo(this);
        jDialogReservacion.setVisible(true);
        
    }//GEN-LAST:event_botonClienteExistenteActionPerformed

    private void botonGuardarResponsable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarResponsable1ActionPerformed
    nombreCliente.setText("");
    apellidoCliente.setText("");
    documentoCliente.setText("");
    telefonoCliente.setText("");
    fechaNacCliente.setText("");
    modoPagoCliente.setText("");
    }//GEN-LAST:event_botonGuardarResponsable1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoAcompananteText;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonClienteExistente;
    private javax.swing.JButton botonGuardarResponsable;
    private javax.swing.JButton botonGuardarResponsable1;
    private javax.swing.JButton buttonAcompanante;
    private javax.swing.JButton buttonHabEspecifica;
    private javax.swing.JButton buttonResumenHuespedes;
    private javax.swing.JLabel dispHabitacionLabel;
    private javax.swing.JTextField documentoAcompananteText;
    private javax.swing.JTextField documentoCliente;
    private javax.swing.JPopupMenu error1;
    private javax.swing.JTextField fechaNacAcompananteText;
    private javax.swing.JTextField fechaNacCliente;
    private javax.swing.JTextField habEspecificaText;
    private javax.swing.JDialog jDialogResHuespedes;
    private javax.swing.JDialog jDialogReservacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modoPagoCliente;
    private javax.swing.JTextField nombreAcompananteText;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField telefonoAcompananteText;
    private javax.swing.JTextField telefonoCliente;
    private javax.swing.JDialog ventanaHuesped;
    // End of variables declaration//GEN-END:variables
}
