package modelo.Entidades;

public class Entidad_Empleado {
	
	private int idempleado;
	private int cargo_idcargo;
	private int ci;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Telefono;
	private int cuidad_idcuidad;
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getCargo_idcargo() {
		return cargo_idcargo;
	}
	public void setCargo_idcargo(int cargo_idcargo) {
		this.cargo_idcargo = cargo_idcargo;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getCuidad_idcuidad() {
		return cuidad_idcuidad;
	}
	public void setCuidad_idcuidad(int cuidad_idcuidad) {
		this.cuidad_idcuidad = cuidad_idcuidad;
	}
	
	

}
