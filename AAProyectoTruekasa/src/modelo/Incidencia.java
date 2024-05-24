package modelo;

public class Incidencia {

	String ID;
	String descripcion;
	String estado;
	int puntos_Coste;
	int num_clientes;
	String f_abierta;
	int num_repara;
	String f_repara;
	String valoracion;
	String N_tecnico;
	String f_aprobada;
	public Incidencia(String iD, String descripcion, String estado, int puntos_Coste, int num_clientes,
			String f_abierta, int num_repara, String f_repara, String valoracion, String n_tecnico, String f_aprobada) {
		super();
		ID = iD;
		this.descripcion = descripcion;
		this.estado = estado;
		this.puntos_Coste = puntos_Coste;
		this.num_clientes = num_clientes;
		this.f_abierta = f_abierta;
		this.num_repara = num_repara;
		this.f_repara = f_repara;
		this.valoracion = valoracion;
		N_tecnico = n_tecnico;
		this.f_aprobada = f_aprobada;
	}
	public Incidencia(String iD) {
		super();
		ID = iD;
	}
	public Incidencia() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPuntos_Coste() {
		return puntos_Coste;
	}
	public void setPuntos_Coste(int puntos_Coste) {
		this.puntos_Coste = puntos_Coste;
	}
	public int getNum_clientes() {
		return num_clientes;
	}
	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}
	public String getF_abierta() {
		return f_abierta;
	}
	public void setF_abierta(String f_abierta) {
		this.f_abierta = f_abierta;
	}
	public int getNum_repara() {
		return num_repara;
	}
	public void setNum_repara(int num_repara) {
		this.num_repara = num_repara;
	}
	public String getF_repara() {
		return f_repara;
	}
	public void setF_repara(String f_repara) {
		this.f_repara = f_repara;
	}
	public String getValoracion() {
		return valoracion;
	}
	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
	public String getN_tecnico() {
		return N_tecnico;
	}
	public void setN_tecnico(String n_tecnico) {
		N_tecnico = n_tecnico;
	}
	public String getF_aprobada() {
		return f_aprobada;
	}
	public void setF_aprobada(String f_aprobada) {
		this.f_aprobada = f_aprobada;
	}
	@Override
	public String toString() {
		return "Incidencia [ID=" + ID + ", descripcion=" + descripcion + ", estado=" + estado + ", puntos_Coste="
				+ puntos_Coste + ", num_clientes=" + num_clientes + ", f_abierta=" + f_abierta + ", num_repara="
				+ num_repara + ", f_repara=" + f_repara + ", valoracion=" + valoracion + ", N_tecnico=" + N_tecnico
				+ ", f_aprobada=" + f_aprobada + "]";
	}
	
}
