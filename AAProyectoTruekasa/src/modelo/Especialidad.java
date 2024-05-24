package modelo;

public class Especialidad {
/**
 * Atributos de la clase especialidad
 */
private int codigo;
private String nombre;

/**
 * Constructor con la clave primaria
 * @param codigo
 */
public Especialidad(int codigo) {
	super();
	this.codigo = codigo;
}


/**
 * Constructor con todos los atributos
 * @param codigo
 * @param nombre
 */
public Especialidad(int codigo, String nombre) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
}



public Especialidad() {
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
	return "Especialidad [codigo=" + codigo + ", nombre=" + nombre + "]";
}




}
