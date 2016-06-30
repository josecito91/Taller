package modelo.Entidades;

public class Entidad_Cliente {
	
	private int idcliente;
	private int ci;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String email;
	private String compañia;
	private int cuidad_idcuidad;
	private int Tipodedocumento_idTipodedocumento;
	private int Nacionalidad_idNacionalidad;
	private int Barrio_idBarrio;
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public int getCuidad_idcuidad() {
		return cuidad_idcuidad;
	}
	public void setCuidad_idcuidad(int cuidad_idcuidad) {
		this.cuidad_idcuidad = cuidad_idcuidad;
	}
	public int getTipodedocumento_idTipodedocumento() {
		return Tipodedocumento_idTipodedocumento;
	}
	public void setTipodedocumento_idTipodedocumento(
			int tipodedocumento_idTipodedocumento) {
		Tipodedocumento_idTipodedocumento = tipodedocumento_idTipodedocumento;
	}
	public int getNacionalidad_idNacionalidad() {
		return Nacionalidad_idNacionalidad;
	}
	public void setNacionalidad_idNacionalidad(int nacionalidad_idNacionalidad) {
		Nacionalidad_idNacionalidad = nacionalidad_idNacionalidad;
	}
	public int getBarrio_idBarrio() {
		return Barrio_idBarrio;
	}
	public void setBarrio_idBarrio(int barrio_idBarrio) {
		Barrio_idBarrio = barrio_idBarrio;
	}
	
	
	

}
