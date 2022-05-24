package EJERCICIO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Fotografo 
{
	public static ArrayList<String> listaFotografo() 
	{	
		ArrayList<String> a = new ArrayList<String>();
		String url = "jdbc:mysql://localhost/JDBC_ALEX_EJERCICIO1";
		String user = "root";
		String psswd = "root";
		Connection con;
		try {
			con = DriverManager.getConnection(url,user,psswd);
			System.out.println("Conectado");
			Statement st = con.createStatement();
			String query = "SELECT nombre from fotografos";
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				String nombre = rs.getString("nombre");
				a.add(nombre);
			}
		} catch (SQLException e) {
			System.err.print("No se ha podido conectar con la base de datos");
		}
		return a;
	}
}