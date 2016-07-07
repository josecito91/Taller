package control.E_Control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Conexion.ConexionBd;
import modelo.Entidades.Entidad_Formas_de_Pago;


public class Control_Formas_de_Pago {
	ConexionBd conex =new ConexionBd();
	Entidad_Formas_de_Pago entFo =new Entidad_Formas_de_Pago();
	
	public void registrar(Entidad_Formas_de_Pago entFo){
	conex.conectar();
	
	
	try {
		PreparedStatement pres=conex.conn.prepareStatement("insert into formas_de_pago (descripcion) values(?)");
		pres.setString(1,entFo.getDescripcion());
		pres.execute();
		
		JOptionPane.showMessageDialog(null, "Registro Exitoso");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null, "Error de Registro"+e.getMessage());
		
		e.printStackTrace();
	}
	conex.desconectar();
}
	public void modificar(Entidad_Formas_de_Pago entfo){
		conex.conectar();
		
		
		
		try {
			PreparedStatement mod=conex.conn.prepareStatement("update formas_de_pago set descripcion=? where idFormas_de_Pago=? ");
			mod.setString(1, entfo.getDescripcion());
			
			mod.setInt(2,entfo.getIdFormas_de_Pago());
			mod.execute();
			
			JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al Modificar"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conex.desconectar();
	}
	public void eliminar (Entidad_Formas_de_Pago entfo){
		conex.conectar();
		
		
		try {
			PreparedStatement eli=conex.conn.prepareStatement("delete from formas_de_pago where idFormas_de_Pago=?");
			
			eli.setInt(1,entfo.getIdFormas_de_Pago());
			eli.execute();
			
			JOptionPane.showMessageDialog(null, "Registro Eliminado Exitosamente");			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al Eliminar"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conex.desconectar();
	}
	public void tablamodelo(DefaultTableModel modelo){
		conex.conectar();
		conex.ejecutaSQL("SELECT * FROM formas_de_pago");
		
		try{
		while(conex.rs.next()){
			Object[] fila =new Object[2];
			for (int i=0; i<2; i++)
				fila[i]= conex.rs.getObject(i+1);
			modelo.addRow(fila);
		}
		conex.desconectar();
	}catch (SQLException e) {
		JOptionPane.showMessageDialog(null, "Error al Consultar");
	
}

	}

	}

	


