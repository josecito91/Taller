/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

/**
 *
 * @author jose
 */
public class Barrios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Barrio
     */
    public Barrios() {
        initComponents();
        setSize(639, 479);
        setTitle("Barrios");
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

        jTextField1 = new javax.swing.JTextField();
        etibarrio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        eticodigo = new javax.swing.JLabel();
        etidescripcion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelbarrio = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        getContentPane().setLayout(null);

        etibarrio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etibarrio.setText("Barrios");
        getContentPane().add(etibarrio);
        etibarrio.setBounds(240, 20, 100, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        eticodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eticodigo.setText("Codigo:");
        jPanel1.add(eticodigo);
        eticodigo.setBounds(20, 20, 50, 15);

        etidescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etidescripcion.setText("Descripcion:");
        jPanel1.add(etidescripcion);
        etidescripcion.setBounds(20, 60, 70, 15);
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(80, 20, 80, 20);
        jPanel1.add(txtdescripcion);
        txtdescripcion.setBounds(100, 60, 180, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 550, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        panelbarrio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(panelbarrio);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 550, 120);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 210, 570, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        btnnuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnnuevo.setText("Nuevo");
        jPanel3.add(btnnuevo);
        btnnuevo.setBounds(10, 10, 90, 23);

        btnguardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar.setText("Guardar");
        jPanel3.add(btnguardar);
        btnguardar.setBounds(110, 10, 90, 23);

        btnmodificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnmodificar.setText("Modificar");
        jPanel3.add(btnmodificar);
        btnmodificar.setBounds(210, 10, 90, 23);

        btneliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btneliminar);
        btneliminar.setBounds(310, 10, 90, 23);

        btncancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncancelar.setText("Cancelar");
        jPanel3.add(btncancelar);
        btncancelar.setBounds(410, 10, 90, 23);

        btnvista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnvista.setText("Vista");
        jPanel3.add(btnvista);
        btnvista.setBounds(510, 10, 90, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 360, 610, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnvista;
    private javax.swing.JLabel etibarrio;
    private javax.swing.JLabel eticodigo;
    private javax.swing.JLabel etidescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable panelbarrio;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
