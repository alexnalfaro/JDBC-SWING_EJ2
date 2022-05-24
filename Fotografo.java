package EJERCICIO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Fotografo 
{
	Connection con;
	Statement st;
	ResultSet rs;
	public void AbrirConexion()
	{
		String url = "jdbc:mysql://localhost/JDBC_ALEX_EJERCICIO1";
		String user = "root";
		String psswd = "root";
		try {
			con = DriverManager.getConnection(url,user,psswd);
			System.out.println("Conectado");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public static ArrayList<String> listaFotografo() 
	{
		
		
		ArrayList<String> a = new ArrayList<String>();
		return a;
	}
}
