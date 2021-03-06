/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_Referencial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import control.E_Control.Control_Perfil;
import modelo.Entidades.Entidad_Perfil;

/**
 *
 * @author jose
 */
public class Perfil extends javax.swing.JInternalFrame implements ActionListener{//primero implementa la accion 
//te muestra este error porque tenes quecrear el metodo para que pueda escuchar la un boton
    Entidad_Perfil enPer = new Entidad_Perfil();
    Control_Perfil control = new Control_Perfil();
	
	
    public Perfil() {
        initComponents();
        setSize(435, 445);
        setTitle("Perfil");
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
		
    	panelperfil.setModel(modelo);
		modelo.addColumn("Codigo");
		modelo.addColumn("Descripcion");
		
		panelperfil.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		panelperfil.getTableHeader().setReorderingAllowed(false);
		
		control.tablamodelo(modelo);
		jScrollPane1.setViewportView(panelperfil);
		panelperfil.addMouseListener(new MouseAdapter() { 	
				 
			  public void mouseClicked(MouseEvent e)
			  {
			  int seleccion = panelperfil.rowAtPoint(e.getPoint());
			  txtcodigo.setText(String.valueOf(panelperfil.getValueAt(seleccion, 0)));
			
			  txtdescripcion.setText(String.valueOf(panelperfil.getValueAt(seleccion, 1)));
			  
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
        etiperfil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelperfil = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnvista = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        eticodigo.setFont(new java.awt.Font("Arial", 1, 12));
        
        eticodigo.setText("Codigo:");
        jPanel1.add(eticodigo);
        eticodigo.setBounds(12, 25, 42, 15);
        eticodigo.setVisible(false);

        etidescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etidescripcion.setText("Descripcion:");
        jPanel1.add(etidescripcion);
        etidescripcion.setBounds(10, 70, 71, 23);
                
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(90, 20, 90, 23);
        txtcodigo.setEnabled(false);
        txtcodigo.setVisible(false);
        
        
        jPanel1.add(txtdescripcion);
        txtdescripcion.setBounds(90, 70, 160, 20);
        txtdescripcion.setEnabled(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 400, 140);

        etiperfil.setFont(new java.awt.Font("Arial", 1, 24)); 
        etiperfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiperfil.setText("Perfil");
        getContentPane().add(etiperfil);
        etiperfil.setBounds(10, 10, 400, 29);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);


        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 380, 120);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 400, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        btnnuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
       // btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Agregar.png")));
        jPanel3.add(btnnuevo);
        btnnuevo.setBounds(10, 10,  40, 40);
        btnnuevo.addActionListener(this);//aca le agregamos el metodo para que escuche este boton o mas o menos eso jajaja .l.l.
        btnnuevo.setToolTipText("Agreagar Registro");
        
        btnguardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
       // btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Guardar.png")));
        jPanel3.add(btnguardar);
        btnguardar.setBounds(70, 10, 40, 40);
        btnguardar.addActionListener(this);
        btnguardar.setEnabled(false);
        btnguardar.setToolTipText("Guardar Datos");

        btnmodificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        //btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Modificar.png")));
        jPanel3.add(btnmodificar);
        btnmodificar.setBounds(130, 10, 40, 40);
        btnmodificar.addActionListener(this);
        btnmodificar.setEnabled(false);
        btnmodificar.setToolTipText("Modificar Registro");

        btneliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/Delete.png")));
        jPanel3.add(btneliminar);
        btneliminar.setBounds(190, 10, 40, 40);
        btneliminar.addActionListener(this);
        btneliminar.setEnabled(false);
        btneliminar.setToolTipText("Eliminar Registro");

        btncancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cancel.png")));
        jPanel3.add(btncancelar);
        btncancelar.setBounds(270, 10, 40, 40);
        btncancelar.addActionListener(this);
        btncancelar.setToolTipText("Cancelar Opercion");

        btnvista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnvista.setToolTipText("Crear Reporte");
        jPanel3.add(btnvista);
        btnvista.setBounds(340, 10, 40, 40);
        btnvista.setEnabled(false);
        btnvista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vista.png")));

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
    private javax.swing.JLabel etiperfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable panelperfil;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
	
    
    //aca te crea el metodo 
    @Override
	public void actionPerformed(ActionEvent e) {
		//aca hay que especificar cual va ser el evento que se va a producir al escuchar un boton especifico o algo asi jjajajaja
    	if(e.getSource()==btnnuevo){//decimos que si escucha el boton nuevo que llame el metodo habilitar campos
    		habilitarComponentes();//colocamos el metodo al que se le invoca sale error ahora porque aun no creamos el metodo
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
    		LimpiarCampos();
    	}
    	
	}

    private void LimpiarCampos() {
    	
		// TODO Auto-generated method stub
    	txtdescripcion.setEnabled(false);
    	txtcodigo.setText("");
		txtdescripcion.setText("");
		
		btnguardar.setEnabled(false);
		btnmodificar.setEnabled(false);
		btneliminar.setEnabled(false);
		btnvista.setEnabled(false);
		btnnuevo.setEnabled(true);
    			
	}

	private void Eliminar() {
		// TODO Auto-generated method stub
int opcion= JOptionPane.showConfirmDialog(this, "Desea Eliminar datos?",null,JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    	
    	if(opcion==0){
    		enPer.setIdPerfil(Integer.parseInt(txtcodigo.getText().trim()));
    		enPer.setDescripcion(txtdescripcion.getText());
    		control.eliminar(enPer);
    		txtcodigo.setText("");
    		txtdescripcion.setText("");
    	}
    	 mostrardatosdetabla();
     	 txtdescripcion.setEnabled(true);
    	 txtcodigo.setText("");
    	 txtdescripcion.setText("");
 		txtdescripcion.requestFocus();
    	 btnguardar.setEnabled(false);
    	
    }

	private void Modificar() {
		
    	int opcion= JOptionPane.showConfirmDialog(this, "Desea Modificar datos?",null,JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    	
    	if(opcion==0){
    		enPer.setIdPerfil(Integer.parseInt(txtcodigo.getText().trim()));
    		enPer.setDescripcion(txtdescripcion.getText());
    		control.modificar(enPer);
    		
    		
    		
    		
    	}  	
    	 mostrardatosdetabla();
    	 txtdescripcion.setEnabled(true);
    	 txtcodigo.setText("");
    	 txtdescripcion.setText("");
 		txtdescripcion.requestFocus();
    	 btnguardar.setEnabled(false);
    	 
    	 
    	
		
	}

	private void Registrar() {
		// aca te creo el metodo ahora tenes que capturar los datos que se ingresa en los campos de texto con tu clase entidad arriba crea el objeto de tu clase entidad y tu clase control
		//ahora vamos a decirle a la entidad que capture o transporte esos datos que ingresas en el formulario
    	int opcion= JOptionPane.showConfirmDialog(this, "Desea guardar datos?",null,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    	//JOptionPane.showMessageDialog(null, "opcion" + opcion);
    	if(opcion ==0){
    		enPer.setDescripcion(txtdescripcion.getText());
        	control.registrar(enPer);
        	 
    	}
    	 mostrardatosdetabla();
    	 txtcodigo.setText("");
    	txtdescripcion.setText("");
    	
    	
	}

	//aca nos creo el metodo
    //ejecuta para ver tu formulario
	private void habilitarComponentes() {
		txtdescripcion.setEnabled(true);
		txtdescripcion.setText("");
		txtdescripcion.requestFocus();
		btnguardar.setEnabled(true);
			
	}
}
