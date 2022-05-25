package EJERCICIO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion 
{
	static Connection con;
	static Statement st;
	static ResultSet rs;
	static String url = "jdbc:mysql://localhost/JDBC2";
	static String user = "root";
	static String password = "root";
	
	public static void AbrirConexion() 
	{
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			System.err.print("No se ha podido conectar con la base de datos");
		}
	}
	
	public static void CerrarConexion()
	{
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			System.err.print("No se ha podido cerrar la conexion");
		}
	}
	
	public static ArrayList<String> ejecutarQueryLista (String query)
	{
		ArrayList <String> a = new ArrayList <String>();
		try {
			rs = st.executeQuery(query);
			while(rs.next())
			{
				String nombre = rs.getString("nombre");
				a.add(nombre);
			}
			System.out.println("Consulta realizada");
			
		} catch (SQLException e) {
			System.err.print("No se ha podido realizar la consulta");
		}
		return a;
	}
}
