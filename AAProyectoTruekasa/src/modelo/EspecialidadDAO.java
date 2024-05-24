package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Conexion;

public class EspecialidadDAO {

	private static Connection con;
	private static PreparedStatement pstm;
	private static Statement stm;
	private static ResultSet resultado;

	public EspecialidadDAO() {
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
	public static void create(Especialidad especialidad) throws SQLException {
		if (especialidad != null) {
			String sql = "INSERT INTO TRUEKASA.ESPECIALIDAD VALUES (?,?)";

			try {

				pstm = con.prepareStatement(sql);
				pstm.setInt(1, especialidad.getCodigo());
				pstm.setString(2, especialidad.getNombre());

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

	/**
	 * Metodo que realiza una consulta sobre la tabla Especialidad en funcion de su
	 * codigo, y si encuentra algun registro crea una instancia del mismo en funcion
	 * de los datos de la tabla y la devuelve
	 * 
	 * @param String Clave_ID - ID que se introducira por el usuario posteriormente
	 *               para realizar la consulta
	 * @return City city
	 * @throws SQLException
	 */
	public static Especialidad read(int Clave_ID) throws SQLException {

		int codigo;
		String nombre;
		Especialidad especialidad = null;
		String sql = "SELECT * FROM TRUEKASA.ESPECIALIDAD WHERE UPPER (CODIGO) = ? ;";

		try {

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, Clave_ID);
			resultado = pstm.executeQuery();
			con.commit();
			con.setAutoCommit(true);

			while (resultado.next()) {
				codigo = resultado.getInt(1);
				nombre = resultado.getString(2);

				System.out.println("Vamos a crear una especialidad con los siguientes atributos: ");
				System.out.println("Codigo --> " + codigo);
				System.out.println("Nombre --> " + nombre);

				especialidad = new Especialidad(codigo, nombre);

				System.out.println("\nEspecialidad creada correctamente");

			}

		} catch (SQLException e) {
			System.out.println("Error al seleccionar la especialidad");
		} finally {
			resultado.close();
			pstm.close();
		}

		return especialidad; // En el caso de no encontrar ningun registro por el nombre introducido, se
		// devolveria un null
	}

	/**
	 * Metodo que nos actualiza un registro de la tabla City mediante una instancia de cITY, en el caso de cumplirse la clausula
	 * WHERE de la sentencia
	 * @param City city
	 * @throws SQLException
	 */
	public static void update(Especialidad especialidad) throws SQLException {
		
		    if (especialidad != null) {
		        String sql = "UPDATE TRUEKASA.ESPECIALIDAD " + 
		                "SET NOMBRE = UPPER(?), WHERE UPPER(CODIGO) = ?";


		        try {
		            pstm = con.prepareStatement(sql);
		            pstm.setString(1, especialidad.getNombre());
		            pstm.setInt(2,especialidad.getCodigo());

		            pstm.executeUpdate();
		            con.setAutoCommit(false);
		            con.commit();
		            con.setAutoCommit(true);
		            
		            System.out.println("Especialidad actualizada correctamente");

		        } catch (SQLException e) {
		            System.out.println("Error al actualizar la especialidad: " + e.getMessage());
		            con.rollback();
		        } finally {
		            pstm.close();
		        }
		    }
		    
		}
	/**
	 * Metodo que borra un registro de la tabla City si el ID introducido coincide con alguno existente en la misma
	 * @param int ID
	 * @throws SQLException
	 */
	public static void delete (int codigo) throws SQLException {
		
		String sql = "DELETE FROM TRUEKASA.ESPECIALIDAD WHERE CODIGO = ? ;";
		
		try {
			

			
			
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, codigo);
			pstm.executeUpdate();
			con.setAutoCommit(false);
			con.commit();
			con.setAutoCommit(true);
			
			System.out.println("Especialidad borrada correctamente");
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error al eliminar la especialidad por el id");
			con.rollback();
		}finally {
			pstm.close();
		}
	}
}
