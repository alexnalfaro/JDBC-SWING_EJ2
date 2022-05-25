package EJERCICIO2;

import java.util.ArrayList;

public class Fotografo 
{
	public static ArrayList<String> listaFotografo() 
	{	
		ArrayList<String> a = new ArrayList<String>();
		Conexion.AbrirConexion();
		String query = "SELECT nombre FROM fotografos";
		a = Conexion.ejecutarQueryLista(query);
		Conexion.CerrarConexion();
		return a;
	}
}
