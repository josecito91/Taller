package control.E_Control;

import java.sql.PreparedStatement;

import modelo.Conexion.ConexionBd;
import modelo.Entidades.Entidad_Iva;

public class Control_Iva {
	
	ConexionBd conex =new ConexionBd();
	Entidad_Iva entIv =new Entidad_Iva();
	
	public void  registrar(Entidad_Iva enIv) {
		conex.conectar();
		
		
		//PreparedStatement pre=conex.conn.prepareStatement("insert into iva ()")
		
	}

}
