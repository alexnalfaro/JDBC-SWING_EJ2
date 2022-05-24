package EJERCICIO2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class VerImagen extends JFrame
{
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	ArrayList<String> fotografos = new ArrayList<String>();
	public VerImagen()
	{
		setSize(500,400);
		setTitle ("Ejercicio2");
		setLayout(new GridLayout(2,2));
		panel1.setLayout(new GridLayout(1,2));
		JLabel labelfoto = new JLabel ("Fotografo: ");
		panel1.add(labelfoto);
		JComboBox combo = new JComboBox();
		fotografos = Fotografo.listaFotografo();
		for (int i=0;i<fotografos.size();i++)
		{
			combo.addItem(fotografos.get(i));
		}
		
		
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
