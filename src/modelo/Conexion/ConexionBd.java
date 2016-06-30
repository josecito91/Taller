package modelo.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionBd {

		public Statement stm;
		public ResultSet rs;
		private String driver="com.mysql.jdbc.Driver";
		private String nombreBd="taller";
		private String usuario="root";
		private String pass="";
		private String url="jdbc:mysql://localhost:3306/"+nombreBd;
		
		public Connection conn;
		
		public void conectar(){
			
			
			try{
				System.setProperty("jdbc.Driver",driver);
				
			
				conn=DriverManager.getConnection(url,usuario,pass);
				//JOptionPane.showMessageDialog(null, "conexion exitosa a la Bd:"+nombreBd);
			}catch (SQLException e){
				JOptionPane.showMessageDialog(null,"Error al Conectarse a la Bd:"+e.getMessage());
				
			}
			
		}
		public void ejecutaSQL(String sql){
			try{
				stm= conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);	
				rs=stm.executeQuery(sql);
			}catch (SQLException e){
				System.out.println("Error de EjecutaSQL!/n "+e.getMessage());
			}
		}
	
		public void desconectar(){
			try {
				conn.close();
			} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al desconectar la Bd"+e.getMessage());
			}
			
			
			}
		
			
	}


