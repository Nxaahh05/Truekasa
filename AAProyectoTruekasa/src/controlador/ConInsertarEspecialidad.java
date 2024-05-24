package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import modelo.Especialidad;
import modelo.EspecialidadDAO;
import vista.InsertarEspecialidad;
import vista.InsertarEspecialidad;

public class ConInsertarEspecialidad implements ActionListener {

	private EspecialidadDAO dao;
	private InsertarEspecialidad ventana;
	Especialidad es;

	public ConInsertarEspecialidad(EspecialidadDAO daoan, InsertarEspecialidad vent) {
		this.dao = daoan;
		this.ventana = vent;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ventana.InsertButton) {
		es = new Especialidad();
			try {
				int codigo = Integer.parseInt(ventana.nombreCodigo.getText());
				es.setCodigo(codigo);
				es.setNombre(ventana.nombreEspecialidad.getText());
			
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
