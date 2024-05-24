package controlador;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.InputMismatchException;

import modelo.Tecnico;
import modelo.TecnicoDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.InsertarTecnico;
import vista.InsertarUsuario;

public class ConInsertarUsuario {

	private UsuarioDAO dao;
	private InsertarUsuario ventana;
	Usuario es;
	
	public ConInsertarUsuario(UsuarioDAO daoan, InsertarUsuario vent) {
		this.dao = daoan;
		this.ventana = vent;

	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ventana.insertButton) {
		es = new Usuario();
			try {
				int numero = Integer.parseInt(ventana.meterNumeor.getText());
				es.setNumero(numero);
				es.setNombre(ventana.meterNombre.getText());
				es.setApellidos(ventana.meterApellidos.getText());
				es.setDireccion(ventana.meterDireccion.getText());
				es.setPoblacion(ventana.meterPoblacion.getText());
				int puntos_acumulados = Integer.parseInt(ventana.puntosAcumulados.getText());
				es.setPuntos_acumulados(puntos_acumulados);
				dao.create(es);

				
				
			} catch (NumberFormatException ex1) {
				// TODO: handle exception
				System.out.println("Uno o mas datos son erroneos"+ex1.getMessage());
			}catch (InputMismatchException e2) {
				// TODO: handle exception
				System.out.println("Uno o mas datos son erroneos"+e2.getMessage());
			}catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
			
		}
	}
	

}
