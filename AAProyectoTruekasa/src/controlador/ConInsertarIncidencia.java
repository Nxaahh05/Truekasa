package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import modelo.Incidencia;
import modelo.IncidenciaDAO;
import vista.InsertarIncidencia;

public class ConInsertarIncidencia implements ActionListener {

	private IncidenciaDAO dao;
	private InsertarIncidencia ventana;
	Incidencia es;
	
	public ConInsertarIncidencia(IncidenciaDAO daoan, InsertarIncidencia vent) {
		this.dao = daoan;
		this.ventana = vent;
		this.ventana.insertButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.insertButton) {
			es = new Incidencia();
			try {
				es.setID(ventana.meterID.getText());
				es.setDescripcion(ventana.meterDescripcion.getText());
				es.setEstado(ventana.meterEstado.getText());
				es.setPuntos_Coste(Integer.parseInt(ventana.meterPuntosCoste.getText()));
				es.setNum_clientes(Integer.parseInt(ventana.meterNumCliente.getText()));
				es.setF_abierta(ventana.meterf_abierta.getText());
				es.setNum_repara(Integer.parseInt(ventana.meterNumRepara.getText()));
				es.setF_repara(ventana.meterFrepara.getText());
				es.setValoracion(ventana.meterValoracion.getText());
				es.setN_tecnico(ventana.meterNtecnico.getText());
				es.setF_aprobada(ventana.meterFAprobada.getText());
			} catch (NumberFormatException ex1) {
				System.out.println("Uno o más datos son erróneos: " + ex1.getMessage());
			} catch (InputMismatchException e2) {
				System.out.println("Uno o más datos son erróneos: " + e2.getMessage());
			}
			try {
				dao.create(es);
			} catch (Exception e3) {
				System.out.println("Error: " + e3.getMessage());
			}
		}
	}
}
