package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Conexion;

public class TecnicoDAO {
	private static Connection con;
	private static PreparedStatement pstm;
	private static Statement stm;
	private static ResultSet resultado;

	public TecnicoDAO() {
		con = Conexion.conectarBBDD();
		System.out.println("Conexion realizada"); // Al hacer una instancia de este constructor, crearemos conexion con
													// la BBDD
	}
	
	/**
	 * Metodo mediante el cual, cogeremos una instancia de la clase Tecnico y
	 * la insertaremos dentro de la tabla Truekasa de nuestra Base de Datos.
	 * 
	 * @param
	 * @throws SQLException
	 */
	public static void create(Tecnico tecnico) throws SQLException {
		if (tecnico != null) {
			String sql = "INSERT INTO TRUEKASA.TECNICO VALUES (?,?)";

			try {

				pstm = con.prepareStatement(sql);
				pstm.setInt(1, tecnico.getCodigo());
				pstm.setString(2, tecnico.getNombre());

				pstm.executeUpdate();
				con.setAutoCommit(false);
				con.commit();
				con.setAutoCommit(true);

				System.out.println("Tecnico introducido con exito");

			} catch (SQLException e) {
				System.out.println(e.getMessage());
				con.rollback();
			} finally {
				pstm.close();
			}
		}
	}
}
