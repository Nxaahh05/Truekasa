package modelo;

public class Tecnico {

	private int codigo;
	private String nombre;
	public Tecnico(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public Tecnico(int codigo) {
		super();
		this.codigo = codigo;
	}
	public Tecnico() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Tecnico [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
}
