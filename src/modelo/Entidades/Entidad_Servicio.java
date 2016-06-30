package modelo.Entidades;

public class Entidad_Servicio {
	
	private int idservicio;
	private String Nombre;
	private int Costo;
	private String descripcion;
	private int iva_idiva;
	private int tipodeservicio_idtipodeservicio;
	public int getIdservicio() {
		return idservicio;
	}
	public void setIdservicio(int idservicio) {
		this.idservicio = idservicio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCosto() {
		return Costo;
	}
	public void setCosto(int costo) {
		Costo = costo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIva_idiva() {
		return iva_idiva;
	}
	public void setIva_idiva(int iva_idiva) {
		this.iva_idiva = iva_idiva;
	}
	public int getTipodeservicio_idtipodeservicio() {
		return tipodeservicio_idtipodeservicio;
	}
	public void setTipodeservicio_idtipodeservicio(
			int tipodeservicio_idtipodeservicio) {
		this.tipodeservicio_idtipodeservicio = tipodeservicio_idtipodeservicio;
	}
	
	

}
