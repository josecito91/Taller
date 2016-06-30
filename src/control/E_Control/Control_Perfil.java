package control.E_Control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import modelo.Conexion.ConexionBd;
import modelo.Entidades.Entidad_Perfil;

public class Control_Perfil {
	ConexionBd conex=new ConexionBd();
	Entidad_Perfil entP=new Entidad_Perfil();
	
	
	
	public void registrar(Entidad_Perfil entP ){
		conex.conectar();
		
		
		try {
			PreparedStatement pres=conex.conn.prepareStatement("insert into Perfil (descripcion) values(?)");
			pres.setString(1,entP.getDescripcion());
			pres.execute();
			
			JOptionPane.showMessageDialog(null, "Registro Exitoso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error De Registro"+e.getMessage());
			e.printStackTrace();
		}
		conex.desconectar();
	}
	public void modificar(Entidad_Perfil entp){
		conex.conectar();
		
		
		
		try {
			PreparedStatement mod=conex.conn.prepareStatement("update Perfil set descripcion=? where idPerfil=? ");
			mod.setString(1, entp.getDescripcion());//proba
			
			mod.setInt(2,entp.getIdPerfil());
			mod.execute();
			
			JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al Modificar"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conex.desconectar();
	}
	public void eliminar (Entidad_Perfil entp){
		conex.conectar();
		
		
		try {
			PreparedStatement eli=conex.conn.prepareStatement("delete from Perfil where idPerfil=?");
			
			eli.setInt(1,entp.getIdPerfil());//proba
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
		conex.ejecutaSQL("select * from Perfil");
		
		try{
		while(conex.rs.next()){
			Object[] fila =new Object[3];
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

	
//este no toques deja asi despues vamos a verficar andate a tu formulario perfil