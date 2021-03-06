/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.E_Control.Control_Paises;
import modelo.Entidades.Entidad_Paises;

/**
 *
 * @author jose
 */
public class Paises extends javax.swing.JInternalFrame implements ActionListener{
	Entidad_Paises entpa =new Entidad_Paises();
	Control_Paises contpa=new Control_Paises();

    /**
     * Creates new form Paises
     */
    public Paises() {
        initComponents();
        setSize(435, 445);
        setTitle("Paises");
        setClosable(true);
        setIconifiable(true);
        setResizable(false);
        setMaximizable(false);
        mostrardatosdetabla();
    }
    private void mostrardatosdetabla() {
		// TODO Auto-generated method stub
    	DefaultTableModel modelo =new DefaultTableModel(){
    		@Override
    		public boolean isCellEditable(int filas,int columna){
    			if (columna==1){
    				return true;
    			}else{
    				return false;
    			}
    			
    		}
    	};
		
    	panelpaises.setModel(modelo);
		modelo.addColumn("Codigo");
		modelo.addColumn("Descripcion");
		
		panelpaises.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		panelpaises.getTableHeader().setReorderingAllowed(false);
		
		contpa.tablamodelo(modelo);
		jScrollPane1.setViewportView(panelpaises);
		panelpaises.addMouseListener(new MouseAdapter() { 	
				 
			  public void mouseClicked(MouseEvent e)
			  {
			  int seleccion = panelpaises.rowAtPoint(e.getPoint());
			  txtcodigo.setText(String.valueOf(panelpaises.getValueAt(seleccion, 0)));
			
			  txtdescripcion.setText(String.valueOf(panelpaises.getValueAt(seleccion, 1)));
			  
				btnmodificar.setEnabled(true);
				btneliminar.setEnabled(true);
			
				txtdescripcion.requestFocus();
				txtdescripcion.setEnabled(true);
				btnnuevo.setEnabled(false);
				btnvista.setEnabled(true);
				btnguardar.setEnabled(false);
				txtcodigo.setVisible(true);
				eticodigo.setVisible(true);
			  }
			  });
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
        etipaises = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelpaises = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new JButton();

        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        eticodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eticodigo.setText("Codigo:");
        jPanel1.add(eticodigo);
        eticodigo.setBounds(20, 30, 50, 15);
        eticodigo.setVisible(false);
        

        etidescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etidescripcion.setText("Descripcion:");
        jPanel1.add(etidescripcion);
        etidescripcion.setBounds(20, 80, 80, 15);
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(80, 30, 70, 20);
        txtcodigo.setEnabled(false);
        txtcodigo.setVisible(false);
        
        jPanel1.add(txtdescripcion);        
        txtdescripcion.setBounds(100, 80, 150, 20);
        txtdescripcion.setEnabled(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 45, 400, 140);

        etipaises.setFont(new java.awt.Font("Arial", 1, 24));
        etipaises.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etipaises.setText("Paises");
        getContentPane().add(etipaises);
        etipaises.setBounds(10, 10, 400, 29);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 380, 120);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 400, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        btnnuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Agregar.png")));
        jPanel3.add(btnnuevo);
        btnnuevo.setBounds(10, 10,  40, 40);
        btnnuevo.addActionListener(this);
        btnnuevo.setToolTipText("Agregar Registro");

        btnguardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Guardar.png")));
        jPanel3.add(btnguardar);
        btnguardar.setBounds(70, 10, 40, 40);
        btnguardar.addActionListener(this);
        btnguardar.setEnabled(false);
        btnguardar.setToolTipText("Guardar Datos");
        

        btnmodificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Modificar.png")));
        jPanel3.add(btnmodificar);
        btnmodificar.setBounds(130, 10, 40, 40);
        btnmodificar.addActionListener(this);
        btnmodificar.setEnabled(false);
        btnmodificar.setToolTipText("Modificar Registro");

        btneliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Borrar.png")));
        jPanel3.add(btneliminar);
        btneliminar.setBounds(190, 10, 40, 40);
        btneliminar.addActionListener(this);
        btneliminar.setEnabled(false);
        btneliminar.setToolTipText("Eliminar Registro");

        btncancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png")));
        jPanel3.add(btncancelar);
        btncancelar.setBounds(270, 10, 40, 40);
        btncancelar.addActionListener(this);
        btncancelar.setToolTipText("Cancelar Operacion");
        

        btnvista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnvista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vista.png")));
        jPanel3.add(btnvista);
        btnvista.setBounds(340, 10, 40, 40);
        btnvista.addActionListener(this);
        btnvista.setEnabled(false);
        btnvista.setToolTipText("Crear Reporte");

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 340, 400, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnvista;
    private javax.swing.JLabel eticodigo;
    private javax.swing.JLabel etidescripcion;
    private javax.swing.JLabel etipaises;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable panelpaises;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnnuevo){
			habilitarcampos();
		}
		if(e.getSource()==btnguardar){
			Registrar();
		}
		if(e.getSource()==btnmodificar){
			Modificar();
		}
		if(e.getSource()==btneliminar){
			Eliminar();
			
		}
		if(e.getSource()==btncancelar){
			Cancelar();
		}
		
		
	}

	private void Cancelar() {
		//para deshabilitar botones y campos
		//primero campos
		
		txtdescripcion.setEnabled(false);
    	txtcodigo.setText("");
		txtdescripcion.setText("");
		
		btnguardar.setEnabled(false);
		btnmodificar.setEnabled(false);
		btneliminar.setEnabled(false);
		btnvista.setEnabled(false);
		btnnuevo.setEnabled(true);
		eticodigo.setVisible(false);
		txtcodigo.setVisible(false);
		
		
	}
	

	private void Eliminar() {
		// TODO Auto-generated method stub
		int option=JOptionPane.showConfirmDialog(this, "Desea Eliminar Registro", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 if(option==0){
			 entpa.setIdpaises(Integer.parseInt(txtcodigo.getText().trim()));
			 entpa.setNombre(txtdescripcion.getText().trim());
			 contpa.eliminar(entpa);
		 }
		 mostrardatosdetabla();
	 	 txtdescripcion.setEnabled(true);
    	 txtcodigo.setText("");
    	 txtdescripcion.setText("");
 		txtdescripcion.requestFocus();
    	 btnguardar.setEnabled(false);
		
	}

	private void Modificar() {
		// TODO Auto-generated method stub
		int opcion=JOptionPane.showConfirmDialog(this, "Desea Modificar el Registro", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 if(opcion==0){
			 entpa.setIdpaises(Integer.parseInt(txtcodigo.getText().trim()));
			 entpa.setNombre(txtdescripcion.getText().trim());
			 contpa.modificar(entpa);
			 
		 }
				
		mostrardatosdetabla();
	  	 txtdescripcion.setEnabled(true);
    	 txtcodigo.setText("");
    	 txtdescripcion.setText("");
 		txtdescripcion.requestFocus();
    	 btnguardar.setEnabled(false);
	}

	private void Registrar() {
		// TODO Auto-generated method stub
		int opcion=JOptionPane.showConfirmDialog(this, "Desea Guardar Datos",null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "La Opcion es "+ opcion);//Para capturar el valor de la opcion
		if(opcion==0){
			entpa.setNombre(txtdescripcion.getText().trim());
			contpa.registrar(entpa);
		}
		mostrardatosdetabla();
		txtcodigo.setText("");
    	txtdescripcion.setText("");
		
	}

	private void habilitarcampos() {
		// TODO Auto-generated method stub
		txtdescripcion.setEnabled(true);
		txtdescripcion.setText("");
		txtdescripcion.requestFocus();
		btnguardar.setEnabled(true);
		
	}
}
