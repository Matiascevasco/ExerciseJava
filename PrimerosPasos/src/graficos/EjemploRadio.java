package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio {

	public static void main(String[] args) {

		MarcoRadio mimarco = new MarcoRadio();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadio extends JFrame {

	public MarcoRadio() {

		setBounds(550, 300, 500, 300);

		setVisible(true);

		LaminaRadio milamina = new LaminaRadio();

		add(milamina);
	}
}

class LaminaRadio extends JPanel {

	public LaminaRadio() {

		setLayout(new BorderLayout());

		texto = new JLabel("El fin del guerrero de cuba...");

		texto.setFont(new Font("Serif", Font.PLAIN, 12));

		add(texto, BorderLayout.CENTER);

		laminabotones = new JPanel();

		migrupo = new ButtonGroup();

		colocarbotones("Pequeño", false, 10);

		colocarbotones("Mediano", true, 12);

		colocarbotones("Grande", false, 16);

		colocarbotones("Muy Grande", false, 20);

		add(laminabotones, BorderLayout.SOUTH);

	}

	public void colocarbotones(String nombre, boolean seleccionado, final int tamanio) {

		JRadioButton boton = new JRadioButton(nombre, seleccionado);

		migrupo.add(boton);

		laminabotones.add(boton);

		ActionListener mievento = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
			}
		};

		boton.addActionListener(mievento);
	}

	private JPanel laminabotones;

	private ButtonGroup migrupo;

	private JLabel texto;

	private JRadioButton boton1, boton2, boton3, boton4;
}
