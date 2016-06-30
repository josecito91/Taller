package control.E_Control;

import java.sql.PreparedStatement;//el import del preparedstatemen para las consultas tipo insert o delete o update
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Entidades.Enti_Tipo_Servicio;
import modelo.Conexion.ConexionBd;

public class Control_Tipo_Serv {
	ConexionBd conex =new ConexionBd();
	Enti_Tipo_Servicio tp =new Enti_Tipo_Servicio();
	
	public void registrar(Enti_Tipo_Servicio tp ){//creamos el metodo y le enviamos como parametro nuestra clase entidad
		conex.conectar();//realizamos la conexion
		//lo mismo aca solo le agragamos el nombre
		try {
			PreparedStatement pres=conex.conn.prepareStatement("insert into tipodeservicio (nombredeservicio,descripcion)values (?,?,?)");//esto ya sabes que es
			//una vez  que cargamos el set aca mostramos ese dato con el get y el prest guarda en la tabla,...verifica tu sentencia y ve si esta escrito como en tu tabla
			pres.setString(1,tp.getNombredeservicio());
			pres.setString(2, tp.getDescripcion());//te das cuenta como cambia aca??si
			pres.execute();
			//dudas?no segui ejecuta...alguna duda no tranqui seguro??pregunta ani ekyhyje...muchas dudas tengo al chat
			JOptionPane.showMessageDialog(null, "Registro Exitoso");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error De Registro"+e.getMessage());
		} 
		conex.desconectar();
	}

	public void modificar(Enti_Tipo_Servicio tp) {
		//mira es el mismo procedimiento que en registrar lo unico que cambia el la sentencia en vez de insert va ser sentencia de update aca mira solo eso cambia manos a la obra
		//esp te va a pedir no hagas vos empeza por tu conexion conectate primero
		conex.conectar();
		try {
			PreparedStatement mod=conex.conn.prepareStatement("update tipodeservicio set nombredeservicio=?, descripcion=? where idtipodeservicio=?");
			 
			mod.setString(1,tp.getNombredeservicio());
			mod.setString(2,tp.getDescripcion());
			mod.setInt(3,tp.getIdtp());
			mod.execute();
			JOptionPane.showMessageDialog(null,"Exito al Modificar");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al Modificar"+e);
			
		}
		conex.desconectar();
	}

	public Enti_Tipo_Servicio primero(){
		conex.conectar();
		conex.ejecutaSQL("select * from tipodeservicio order by idtipodeservicio");
		try {
			conex.rs.first();
			 tp.setIdtp(conex.rs.getInt("idtipodeservicio"));
			 tp.setNombredeservicio(conex.rs.getString("nombredeservicio"));
			 tp.setDescripcion(conex.rs.getString("descripcion"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tp;
	}
    public Enti_Tipo_Servicio ultimo(){
    	conex.conectar();
    	conex.ejecutaSQL("select *from tipodeservicio orden by idtipodeservicio");
    	
    	try {
			conex.rs.last();
			tp.setIdtp(conex.rs.getInt("idtipodeservicio"));
			tp.setNombredeservicio(conex.rs.getString("nombredeservicio"));
			tp.setDescripcion(conex.rs.getString("descripcion"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return tp;
    }
	public Enti_Tipo_Servicio siguiente(){
		conex.conectar();
		try {
			conex.rs.next();
			tp.setIdtp(conex.rs.getInt("idtipodeservicio"));
			tp.setNombredeservicio(conex.rs.getString("nombredeservicio"));
			tp.setDescripcion(conex.rs.getString("descripcion"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tp;
	
	}
	public Enti_Tipo_Servicio anterior(){
		conex.conectar();
		
		try {
			conex.rs.previous();
			tp.setIdtp(conex.rs.getInt("idtipodeservicio"));
			tp.setNombredeservicio(conex.rs.getString("nombredeservicio"));
			tp.setDescripcion(conex.rs.getString("descripcion"));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tp;
		
	}
	public void borrar(Enti_Tipo_Servicio tp){
		conex.conectar();
		try {
			PreparedStatement bor=conex.conn.prepareStatement("delete from tipodeservicio where idtipodeservicio=?");
			
			bor.setInt(1,tp.getIdtp());
			bor.execute();
			JOptionPane.showMessageDialog(null,"Exito al Borrar");
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al Borrar"+e);
			e.printStackTrace();
		}
		conex.desconectar();
	}
}
	

