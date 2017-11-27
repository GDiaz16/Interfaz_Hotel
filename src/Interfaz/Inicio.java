package Interfaz;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JPanel {

    private URL url = getClass().getResource("/Imagenes/fondo_inicio.jpg");
    private Image image = new ImageIcon(url).getImage();
    private CRUD cn = new CRUD();
    private String user;
    private String password;

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    public Inicio() {
        initComponents();
        anotherComponents();
    }

    public void userSelected(String user) {
        switch (user) {
            case "Recepcionista":
                this.user = "recepcionista";
                cn.conexionUsuario(this.user, password);
                System.out.println("conect " + cn.conect);
                if (cn.conect == 1) {
                    this.setVisible(false);
                    this.getTopLevelAncestor().add(new panelRecepcionista());
                } else if (cn.conect == 0) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Mensaje de la BD",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Gerente":
                this.user = "gerente";
                break;
            case "Personal de aseo":
                this.user = "persona_aseo";
                System.out.println("pa");
                break;
            case "Personal de Mantenimiento":
                this.user = "personal_mantenimiento";
                System.out.println("pm");
                break;
            case "Administrador Zona Comun":
                this.user = "admon_zon_comunes";
                System.out.println("azc");
                break;
            case "Jefe de personal":
                this.user = "jefe_personal";
                System.out.println("azc");
                cn.conexionUsuario(this.user, password);
                System.out.println("conect " + cn.conect);
                if (cn.conect == 1) {
                    this.setVisible(false);
                    this.getTopLevelAncestor().add(new NewJPanel());
                } else if (cn.conect == 0) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Mensaje de la BD",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;

        }
    }

    public void anotherComponents() {
        String[] usuarios = {"Gerente", "Recepcionista", "Personal de Mantenimiento", "Personal de Aseo", "Jefe de personal", "Administrador Zona Comun",};
        listaUsuarios.setModel(new DefaultComboBoxModel(usuarios));
        listaUsuarios.setLocation(600, 500);
        listaUsuarios.setVisible(true);

        this.add(listaUsuarios);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaUsuarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        listaUsuarios.setBackground(new java.awt.Color(208, 217, 127));
        listaUsuarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listaUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuarios.setAlignmentX(600.0F);
        listaUsuarios.setAlignmentY(2000.0F);
        listaUsuarios.setBorder(null);
        listaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(240, 216, 127));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIO");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(240, 216, 127));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA");
        jLabel2.setToolTipText("");

        passwordText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 203, 213));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hotel Continental");

        botonIngresar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordText)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(botonIngresar)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonIngresar)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuariosActionPerformed
       
    }//GEN-LAST:event_listaUsuariosActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        userSelected((String) listaUsuarios.getModel().getSelectedItem());
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void passwordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyReleased
        password = (String) passwordText.getText();
        System.out.println(password);
    }//GEN-LAST:event_passwordTextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listaUsuarios;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables
}
