package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora mimarco = new MarcoCalculadora();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {

		setTitle("Calculadora");

		setBounds(500, 300, 450, 300);

		LaminaCalculadora milamina = new LaminaCalculadora();

		add(milamina);

		// pack();
	}
}

class LaminaCalculadora extends JPanel {

	public LaminaCalculadora() {

		principio = true;

		setLayout(new BorderLayout());

		pantalla = new JButton("0");

		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);

		milamina2 = new JPanel();

		milamina2.setLayout(new GridLayout(4, 4));

		ActionListener Insertar = new InsertaNumero();

		ActionListener orden = new AccionOrden();

		ponerboton("7", Insertar);

		ponerboton("8", Insertar);

		ponerboton("9", Insertar);

		ponerboton("/", orden);

		ponerboton("4", Insertar);

		ponerboton("5", Insertar);

		ponerboton("6", Insertar);

		ponerboton("*", orden);

		ponerboton("1", Insertar);

		ponerboton("2", Insertar);

		ponerboton("3", Insertar);

		ponerboton("-", orden);

		ponerboton("0", Insertar);

		ponerboton(",", Insertar);

		ponerboton("=", orden);

		ponerboton("+", orden);

		/*
		 * JButton boton1 = new JButton("1");
		 * 
		 * milamina2.add(boton1);
		 * 
		 * JButton boton2 = new JButton("2");
		 * 
		 * milamina2.add(boton2);
		 * 
		 * JButton boton3 = new JButton("3");
		 * 
		 * milamina2.add(boton3);
		 * 
		 * JButton boton4 = new JButton("4");
		 * 
		 * milamina2.add(boton4);
		 * 
		 * JButton boton5 = new JButton("5");
		 * 
		 * milamina2.add(boton5);
		 * 
		 * JButton boton6 = new JButton("6");
		 * 
		 * milamina2.add(boton6);
		 * 
		 * JButton boton7 = new JButton("7");
		 * 
		 * milamina2.add(boton7);
		 * 
		 * JButton boton8 = new JButton("8");
		 * 
		 * milamina2.add(boton8);
		 * 
		 * JButton boton9 = new JButton("9");
		 * 
		 * milamina2.add(boton9);
		 * 
		 * JButton botonigual = new JButton("=");
		 * 
		 * milamina2.add(botonigual);
		 * 
		 * JButton botonpor = new JButton("*");
		 * 
		 * milamina2.add(botonpor);
		 * 
		 * JButton botonmas = new JButton("+");
		 * 
		 * milamina2.add(botonmas);
		 * 
		 * JButton botoncoma = new JButton(",");
		 * 
		 * milamina2.add(botoncoma);
		 * 
		 * JButton botondividir = new JButton("/");
		 * 
		 * milamina2.add(botondividir);
		 * 
		 * JButton botonresta = new JButton("-");
		 * 
		 * milamina2.add(botonresta);
		 */

		add(milamina2, BorderLayout.CENTER);

		ultimaoperacion = "=";
	}

	private void ponerboton(String rotulo, ActionListener oyente) {

		JButton boton = new JButton(rotulo);

		boton.addActionListener(oyente);

		milamina2.add(boton);

	}

	private class InsertaNumero implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String entrada = e.getActionCommand();

			if (principio) {

				pantalla.setText("");

				principio = false;
			}

			pantalla.setText(pantalla.getText() + entrada);

		}

	}

	private class AccionOrden implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String operacion = e.getActionCommand();

			calcular(Double.parseDouble(pantalla.getText()));

			ultimaoperacion = operacion;

			principio = true;

		}

		public void calcular(double x) {

			if (ultimaoperacion.equals("+")) {

				resultado += x;

			}

			else if (ultimaoperacion.equals("-")) {

				resultado -= x;
			}

			else if (ultimaoperacion.equals("*")) {

				resultado *= x;
			}

			else if (ultimaoperacion.equals("/")) {

				resultado /= x;
			}

			else if (ultimaoperacion.equals("=")) {

				resultado = x;
			}
			
			pantalla.setText("" + resultado);
		}

	}

	private JPanel milamina2;

	private JButton pantalla;

	private boolean principio;

	private double resultado;

	private String ultimaoperacion;
}
