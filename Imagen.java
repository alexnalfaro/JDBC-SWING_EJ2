package EJERCICIO2;

import java.sql.Date;

public class Imagen 
{
	int id;
	String titulo;
	Date fecha;
	String nombrearchivo;
	int visitas;
	Fotografo2 fotografo;
	
	public Imagen(int i, String t, Date f, String nombre, int v, Fotografo2 fo)
	{
		this.id=i;
		this.titulo=t;
		this.fecha=f;
		this.nombrearchivo=nombre;
		this.visitas=v;
		this.fotografo=fo;
	}
	
	public void insertarImagen ()
	{
		
	}
}
