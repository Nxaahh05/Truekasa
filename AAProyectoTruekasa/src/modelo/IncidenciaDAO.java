package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Conexion;

public class IncidenciaDAO {


	private static Connection con;
	private static PreparedStatement pstm;
	private static Statement stm;
	private static ResultSet resultado;

	public IncidenciaDAO() {
		con = Conexion.conectarBBDD();
		System.out.println("Conexion realizada"); // Al hacer una instancia de este constructor, crearemos conexion con
													// la BBDD
	}

	/**
	 * Metodo mediante el cual, cogeremos una instancia de la clase Especialidad y
	 * la insertaremos dentro de la tabla Truekasa de nuestra Base de Datos.
	 * 
	 * @param
	 * @throws SQLException
	 */
	public void create(Incidencia incidencia) throws SQLException {
		System.out.println(incidencia);
		if (incidencia != null) {
			String sql = "INSERT INTO TRUEKASA.INCIDENCIA VALUES (?,?,?,?,?,?,?,?,?,?,?)";

			try {

				pstm = con.prepareStatement(sql);
				pstm.setString(1, incidencia.getID());
				pstm.setString(2, incidencia.getDescripcion());
				pstm.setString(3, incidencia.getEstado());
				pstm.setInt(4, incidencia.getPuntos_Coste());
				pstm.setInt(5, incidencia.getNum_clientes());
				pstm.setString(6, incidencia.getF_abierta());
				pstm.setInt(7, incidencia.getNum_repara());
				pstm.setString(8, incidencia.getF_repara());
				pstm.setString(9, incidencia.getValoracion());
				pstm.setString(10, incidencia.getN_tecnico());
				pstm.setString(11, incidencia.getF_aprobada());
				//NUMTECNICO
				//FAPROBADA


				pstm.executeUpdate();
				con.setAutoCommit(false);
				con.commit();
				con.setAutoCommit(true);

				System.out.println("Incidencia introducida con exito");

			} catch (SQLException e) {
				System.out.println(e.getMessage());
				//con.rollback();
			} finally {
				pstm.close();
			}
		}
	}
}
