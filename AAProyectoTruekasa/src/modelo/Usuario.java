package modelo;

public class Usuario {

	public int numero;
	public String nombre;
	public String apellidos;
	public String direccion;
	public String poblacion;
	public int puntos_acumulados;
	public Usuario(int numero,String nombre, String apellidos, String direccion, String poblacion, int puntos_acumulados) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.puntos_acumulados = puntos_acumulados;
	}
	public Usuario(int numero) {
		super();
		this.numero = numero;
	}
	public Usuario() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public int getPuntos_acumulados() {
		return puntos_acumulados;
	}
	public void setPuntos_acumulados(int puntos_acumulados) {
		this.puntos_acumulados = puntos_acumulados;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", poblacion="
				+ poblacion + ", puntos_acumulados=" + puntos_acumulados + "]";
	}
	
	

}
