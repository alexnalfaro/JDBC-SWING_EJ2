package EJERCICIO2;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class VerImagen extends JFrame
{
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	ArrayList<String> fotografos = new ArrayList<String>();
	ArrayList<String> fotos = new ArrayList<String>();
	public VerImagen() throws SQLException
	{
		setSize(500,400);
		setTitle ("Ejercicio2");
		setLayout(new GridLayout(2,2));
		//PANEL 1 (ARRIBA IZQUIERDA)
		panel1.setLayout(new GridLayout(1,2));
		JLabel labelfoto = new JLabel ("Fotografo: ");
		panel1.add(labelfoto);
		JComboBox combo = new JComboBox();
		fotografos = Fotografo2.listaFotografo();
		for (int i=0;i<fotografos.size();i++)
		{
			combo.addItem(fotografos.get(i));
		}
		panel1.add(combo);
		add(panel1);
		//PANEL 2 (ARRIBA DERECHA)
		panel2.setLayout(new GridLayout(2,2));
		JLabel labelfecha = new JLabel ("Fotos despues de: ");
		panel2.add(labelfecha);
		add(panel2);
		//PANEL 3 (ABAJO IZQUIERDA)
		panel3.setLayout(new GridLayout(1,1));
		JList lista = new JList();
		
 		panel3.add(lista);
		add(panel3);
		//PANEL 4 (ABAJO DERECHA)
		panel4.setLayout(new GridLayout(1,1));
		JButton b = new JButton ("B");
		panel4.add(b);
		add(panel4);
	}
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					VerImagen frame = new VerImagen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}