package control.E_Control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Conexion.ConexionBd;
import modelo.Entidades.Entidad_Paises;
import modelo.Entidades.Entidad_Paises;

public class Control_Paises {
	ConexionBd conex =new ConexionBd();
	Entidad_Paises entpa =new Entidad_Paises();
	
	
	public void registrar(Entidad_Paises entpa ){
		conex.conectar();
		
		
		try {
			PreparedStatement pres=conex.conn.prepareStatement("insert into Paises (nombre) values(?)");
			pres.setString(1,entpa.getNombre());
			pres.execute();
			
			JOptionPane.showMessageDialog(null, "Registro Exitoso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error De Registro"+e.getMessage());
			e.printStackTrace();
		}
		conex.desconectar();
	}


public void modificar(Entidad_Paises entpa){
	conex.conectar();
	
	
	
	try {
		PreparedStatement mod=conex.conn.prepareStatement("update Paises set nombre=? where idpaises=? ");
		mod.setString(1, entpa.getNombre());
		
		mod.setInt(2,entpa.getIdpaises());
		mod.execute();
		
		JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null, "Error al Modificar"+e.getMessage());
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	conex.desconectar();
}
public void eliminar (Entidad_Paises entpa){
	conex.conectar();
	
	
	try {
		PreparedStatement eli=conex.conn.prepareStatement("delete from Paises where idpaises=?");
		
		eli.setInt(1,entpa.getIdpaises());
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
	conex.ejecutaSQL("select * from Paises");
	
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
