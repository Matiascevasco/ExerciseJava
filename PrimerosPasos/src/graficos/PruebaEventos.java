package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {

		/*MarcoBotones mimarco = new MarcoBotones();

		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y Eventos ");

		setBounds(700, 300, 500, 300);

		LaminaBotones milamina = new LaminaBotones();

		add(milamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener {

	JButton botonazul = new JButton("Azul");

	JButton botonamarillo = new JButton("Amarillo");

	JButton botonrojo = new JButton("Rojo");

	public LaminaBotones() {

		add(botonazul);

		add(botonamarillo);

		add(botonrojo);

		botonazul.addActionListener(this);

		botonamarillo.addActionListener(this);

		botonrojo.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		Object botonpulsado = e.getSource();

		if (botonpulsado == botonazul) {

			setBackground(Color.blue);
		} else if (botonpulsado == botonamarillo) {

			setBackground(Color.yellow);
		} else {

			setBackground(Color.red);
		}*/

		MarcoBotones mimarco = new MarcoBotones();

		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y Eventos ");

		setBounds(700, 300, 500, 300);

		LaminaBotones milamina = new LaminaBotones();

		add(milamina);
	}
}

class LaminaBotones extends JPanel{

	JButton botonazul = new JButton("Azul");

	JButton botonamarillo = new JButton("Amarillo");

	JButton botonrojo = new JButton("Rojo");

	public LaminaBotones() {

		add(botonazul);

		add(botonamarillo);

		add(botonrojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.yellow);
		
		ColorFondo Rojo = new ColorFondo(Color.red);
		
		ColorFondo Azul = new ColorFondo(Color.blue);

		botonazul.addActionListener(Azul);

		botonamarillo.addActionListener(Amarillo);

		botonrojo.addActionListener(Rojo);
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo (Color c) {
			
			colordefondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colordefondo);
		}
		
		private Color colordefondo;
	}
}