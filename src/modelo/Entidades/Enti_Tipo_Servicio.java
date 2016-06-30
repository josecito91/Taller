package modelo.Entidades;

//antes que todo esta clase nos sirve para capturar y mostrar datos  jajajajajaja

public class Enti_Tipo_Servicio {
		
	private int idtp;
	private String nombredeservicio;
	private String descripcion;
	
	
	public String getNombredeservicio() {
		return nombredeservicio;
	}
	public void setNombredeservicio(String nombredeservicio) {
		this.nombredeservicio = nombredeservicio;
	}
	public int getIdtp() {
		return idtp;
	}
	public void setIdtp(int idtp) {//con el set capturamos o modificamos
		this.idtp = idtp;
	}
	public String getDescripcion() {//con el get mostramos o enviamos bueno para que tengas una mejor vision vamos al formulario
		return descripcion;
	}
	public void setDescripcion(String descripcion) {//cargamos esto pillas
		this.descripcion = descripcion;
	}
	


}
