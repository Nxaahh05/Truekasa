package controlador;

import java.awt.event.ActionEvent;
import java.util.InputMismatchException;

import modelo.Especialidad;
import modelo.EspecialidadDAO;
import modelo.Tecnico;
import modelo.TecnicoDAO;
import vista.InsertarEspecialidad;
import vista.InsertarTecnico;

public class ConInsertarTecnico {
	private TecnicoDAO dao;
	private InsertarTecnico ventana;
	Tecnico es;
	
	public ConInsertarTecnico(TecnicoDAO daoan, InsertarTecnico vent) {
		this.dao = daoan;
		this.ventana = vent;

	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ventana.insertButton) {
		es = new Tecnico();
			try {
				int codigo = Integer.parseInt(ventana.meterCodigo.getText());
				es.setCodigo(codigo);
				es.setNombre(ventana.meterNombre.getText());
			
			} catch (NumberFormatException ex1) {
				// TODO: handle exception
				System.out.println("Uno o mas datos son erroneos"+ex1.getMessage());
			}catch (InputMismatchException e2) {
				// TODO: handle exception
				System.out.println("Uno o mas datos son erroneos"+e2.getMessage());
			}
			try {
				dao.create(es);
			} catch (Exception e3) {
				System.out.println("Error: "+e3.getMessage());
			}
		}
	}
	
	
}

