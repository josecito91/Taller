package modelo.Entidades;

public class Entidad_Usuario {
	
	private int idusuario;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private int Perfil_idPerfil;
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getPerfil_idPerfil() {
		return Perfil_idPerfil;
	}
	public void setPerfil_idPerfil(int perfil_idPerfil) {
		Perfil_idPerfil = perfil_idPerfil;
	}
	
	
	

}
