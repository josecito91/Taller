/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

/**
 *
 * @author jose
 */
public class Marca extends javax.swing.JInternalFrame {

    /**
     * Creates new form Marca
     */
    public Marca() {
        initComponents();
        setTitle("Marca");
        setSize(606, 421);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelmarca = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new javax.swing.JButton();
        etmarca = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.setLayout(null);

        eticodigo.setText("Codigo:");
        jPanel1.add(eticodigo);
        eticodigo.setBounds(80, 20, 40, 14);

        etidescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etidescripcion.setText("Descripcion:");
        jPanel1.add(etidescripcion);
        etidescripcion.setBounds(60, 50, 69, 15);
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(130, 20, 90, 20);
        jPanel1.add(txtdescripcion);
        txtdescripcion.setBounds(130, 50, 120, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 40, 470, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        panelmarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panelmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(panelmarca);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 480, 130);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 140, 510, 150);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnnuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnnuevo.setText("Nuevo");
        jPanel3.add(btnnuevo);
        btnnuevo.setBounds(20, 20, 73, 23);

        btnguardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnguardar.setText("Guardar");
        jPanel3.add(btnguardar);
        btnguardar.setBounds(100, 20, 77, 23);

        btnmodificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodificar);
        btnmodificar.setBounds(190, 20, 90, 23);

        btneliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        jPanel3.add(btneliminar);
        btneliminar.setBounds(290, 20, 80, 23);

        btncancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btncancelar.setText("Cancelar");
        jPanel3.add(btncancelar);
        btncancelar.setBounds(380, 20, 83, 23);

        btnvista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnvista.setText("Vista");
        jPanel3.add(btnvista);
        btnvista.setBounds(470, 20, 59, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 300, 540, 60);

        etmarca.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etmarca.setText("Marca");
        getContentPane().add(etmarca);
        etmarca.setBounds(260, 10, 80, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnvista;
    private javax.swing.JLabel eticodigo;
    private javax.swing.JLabel etidescripcion;
    private javax.swing.JLabel etmarca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable panelmarca;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}