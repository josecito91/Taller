/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

/**
 *
 * @author jose
 */
public class Departamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Departamento
     */
    public Departamento() {
        initComponents();
        setTitle("Departamento");
        setSize(656, 435);
        setClosable(true);
        setIconifiable(true);
        setResizable(false);
        setMaximizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneldepartamento = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        eticodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        etinombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        etidepartamento = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 139, 0, 0);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        paneldepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        paneldepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(paneldepartamento);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 540, 130);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 170, 560, 150);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Codigo:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 50, 15);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(70, 20, 70, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(190, 20, 50, 15);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Descripcion:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(170, 50, 70, 15);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(240, 20, 180, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(240, 50, 180, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 20, 490, 0);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        btnnuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnnuevo.setText("Nuevo");
        jPanel4.add(btnnuevo);
        btnnuevo.setBounds(10, 10, 90, 23);

        btnguardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnguardar.setText("Guardar");
        jPanel4.add(btnguardar);
        btnguardar.setBounds(110, 10, 90, 23);

        btnmodificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnmodificar);
        btnmodificar.setBounds(210, 10, 90, 23);

        btneliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btneliminar);
        btneliminar.setBounds(310, 10, 90, 23);

        btncancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btncancelar.setText("Cancelar");
        jPanel4.add(btncancelar);
        btncancelar.setBounds(410, 10, 90, 23);

        btnvista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnvista.setText("Vista");
        jPanel4.add(btnvista);
        btnvista.setBounds(510, 10, 70, 23);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(30, 340, 590, 50);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel5.setLayout(null);

        eticodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eticodigo.setText("Codigo:");
        jPanel5.add(eticodigo);
        eticodigo.setBounds(20, 20, 50, 15);
        jPanel5.add(txtcodigo);
        txtcodigo.setBounds(70, 20, 80, 20);

        etinombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etinombre.setText("Nombre:");
        jPanel5.add(etinombre);
        etinombre.setBounds(20, 60, 50, 15);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel5.add(txtnombre);
        txtnombre.setBounds(70, 60, 180, 20);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(40, 50, 560, 100);

        etidepartamento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etidepartamento.setText("Departamento");
        getContentPane().add(etidepartamento);
        etidepartamento.setBounds(250, 20, 170, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnvista;
    private javax.swing.JLabel eticodigo;
    private javax.swing.JLabel etidepartamento;
    private javax.swing.JLabel etinombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable paneldepartamento;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}