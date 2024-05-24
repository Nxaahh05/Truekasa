package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { // Todo los metodos y todas las variables de esta clase seran estaticas

	public static String url = "jdbc:mysql://localhost:3306/truekasa";;
	public static String user = "root";
	public static String password = "Usuario0?";
	public static Connection conexion = null;

	public Conexion() {

	}
/**
 * Metodo que inicia la conexion de la base de datos
 * @return Connection conexion
 */
	public static Connection conectarBBDD() {

		try {

			conexion = DriverManager.getConnection(url, user, password);
			System.out.println("Se ha establecido la conexion con exito");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexion;

	}
/**
 * Metodo que finaliza la conexion de la base de datos
 * 
 */
	public static void desconectarBBDD() {

		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\nSe ha cerrado la conexion a la BBDD con exito");
	}

}
