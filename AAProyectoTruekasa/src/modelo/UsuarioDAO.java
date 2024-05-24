package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Conexion;

public class UsuarioDAO {


	private static Connection con;
	private static PreparedStatement pstm;
	private static Statement stm;
	private static ResultSet resultado;

	public UsuarioDAO() {
		con = Conexion.conectarBBDD();
		System.out.println("Conexion realizada"); // Al hacer una instancia de este constructor, crearemos conexion con
													// la BBDD
	}

	/**
	 * Metodo mediante el cual, cogeremos una instancia de la clase Usuario y
	 * la insertaremos dentro de la tabla Truekasa de nuestra Base de Datos.
	 * 
	 * @param
	 * @throws SQLException
	 */
	public static void create(Usuario usuario) throws SQLException {
		if (usuario != null) {
			String sql = "INSERT INTO TRUEKASA.USUARIO VALUES (?,?,?,?,?)";

			try {

				pstm = con.prepareStatement(sql);
				pstm.setString(1, usuario.getNombre());
				pstm.setString(2, usuario.getApellidos());
				pstm.setString(3, usuario.getDireccion());
				pstm.setString(4, usuario.getPoblacion());
				pstm.setInt(5, usuario.getPuntos_acumulados());


				pstm.executeUpdate();
				con.setAutoCommit(false);
				con.commit();
				con.setAutoCommit(true);

				System.out.println("Especialidad introducida con exito");

			} catch (SQLException e) {
				System.out.println(e.getMessage());
				con.rollback();
			} finally {
				pstm.close();
			}
		}
	}
}
