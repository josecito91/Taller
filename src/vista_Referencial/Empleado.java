/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

/**
 *
 * @author HOME
 */
public class Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleado
     */
    public Empleado() {
        initComponents();
        setTitle("Empleado");
        setSize(674, 534);
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
        eticodigo = new javax.swing.JLabel();
        etidescripcion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        etinombre = new javax.swing.JLabel();
        etidireccion = new javax.swing.JLabel();
        etitelefono = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        eticargo = new javax.swing.JLabel();
        ComboCargo = new javax.swing.JComboBox();
        etiapellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelempleado = new javax.swing.JTable();
        etiempleado = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(null);

        eticodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eticodigo.setText("Codigo:");
        jPanel1.add(eticodigo);
        eticodigo.setBounds(20, 20, 50, 15);

        etidescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etidescripcion.setText("Descripcion:");
        jPanel1.add(etidescripcion);
        etidescripcion.setBounds(190, 110, 69, 15);
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(70, 20, 60, 20);

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtdescripcion);
        txtdescripcion.setBounds(260, 110, 170, 20);

        etinombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etinombre.setText("Nombre:");
        jPanel1.add(etinombre);
        etinombre.setBounds(210, 20, 50, 15);

        etidireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etidireccion.setText("Direccion:");
        jPanel1.add(etidireccion);
        etidireccion.setBounds(200, 80, 60, 15);

        etitelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etitelefono.setText("Telefono:");
        jPanel1.add(etitelefono);
        etitelefono.setBounds(200, 140, 60, 15);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre);
        txtnombre.setBounds(260, 20, 170, 20);

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtdireccion);
        txtdireccion.setBounds(260, 80, 170, 20);
        jPanel1.add(txttelefono);
        txttelefono.setBounds(260, 140, 170, 20);

        eticargo.setText("Cargo:");
        jPanel1.add(eticargo);
        eticargo.setBounds(210, 170, 33, 14);

        ComboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCargoActionPerformed(evt);
            }
        });
        jPanel1.add(ComboCargo);
        ComboCargo.setBounds(260, 170, 170, 20);

        etiapellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiapellido.setText("Apellido:");
        jPanel1.add(etiapellido);
        etiapellido.setBounds(210, 50, 50, 15);

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido);
        txtapellido.setBounds(260, 50, 170, 20);

        btnnuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnnuevo.setText("Nuevo");
        jPanel1.add(btnnuevo);
        btnnuevo.setBounds(10, 70, 90, 23);

        btnguardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar);
        btnguardar.setBounds(10, 100, 90, 23);

        btnmodificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnmodificar.setText("Modificar");
        jPanel1.add(btnmodificar);
        btnmodificar.setBounds(10, 130, 90, 23);

        btneliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        jPanel1.add(btneliminar);
        btneliminar.setBounds(10, 160, 90, 23);

        btncancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelar);
        btncancelar.setBounds(10, 190, 90, 23);

        btnvista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnvista.setText("Vista");
        jPanel1.add(btnvista);
        btnvista.setBounds(10, 220, 90, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 60, 550, 250);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        panelempleado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Direccion", "Descripcion", "Telefono", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(panelempleado);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 590, 120);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 330, 610, 150);

        etiempleado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiempleado.setText("Empleado");
        getContentPane().add(etiempleado);
        etiempleado.setBounds(280, 30, 130, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void ComboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCargoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCargo;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnvista;
    private javax.swing.JLabel etiapellido;
    private javax.swing.JLabel eticargo;
    private javax.swing.JLabel eticodigo;
    private javax.swing.JLabel etidescripcion;
    private javax.swing.JLabel etidireccion;
    private javax.swing.JLabel etiempleado;
    private javax.swing.JLabel etinombre;
    private javax.swing.JLabel etitelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable panelempleado;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
