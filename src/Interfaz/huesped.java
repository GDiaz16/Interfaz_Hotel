
package Interfaz;

public class huesped extends javax.swing.JPanel {

    public huesped(String nombre, String apellido, long telefono, long id) {
        initComponents();
        nombreApellidoLabel.setText(nombre+" "+apellido);
        telefonoLabel.setText(telefono+"");
        docIDLabel.setText(id+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreApellidoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        docIDLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setText("Nombre y apellido");

        nombreApellidoLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nombreApellidoLabel.setText("--");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setText("Documento de identificacion");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");

        docIDLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        docIDLabel.setText("--");

        telefonoLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        telefonoLabel.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(nombreApellidoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(docIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefonoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreApellidoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docIDLabel)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nombreApellidoLabel;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
