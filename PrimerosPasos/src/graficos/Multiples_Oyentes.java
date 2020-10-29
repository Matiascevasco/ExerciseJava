package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multiples_Oyentes {

	public static void main(String[] args) {

		MarcoPrincipal mi_marco = new MarcoPrincipal();

		mi_marco.setVisible(true);

		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrincipal extends JFrame {

	public MarcoPrincipal() {

		setTitle("Prueba Varios");

		setBounds(800, 100, 300, 200);

		LaminaPrincial milamina = new LaminaPrincial();

		add(milamina);
	}
}

class LaminaPrincial extends JPanel {

	public LaminaPrincial() {

		JButton BotonNuevo = new JButton("Nuevo");

		add(BotonNuevo);

		BotonCerrar = new JButton("Cerrar todo");

		add(BotonCerrar);

		OyenteNuevo MiOyente = new OyenteNuevo();

		BotonNuevo.addActionListener(MiOyente);

	}

	private class OyenteNuevo implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			MarcoEmergente Marco = new MarcoEmergente(BotonCerrar);

			Marco.setVisible(true);
		}

	}

	JButton BotonCerrar;

}

class MarcoEmergente extends JFrame {

	public MarcoEmergente(JButton BotonDePrincipal) {

		contador++;

		setTitle("Ventana " + contador);

		setBounds(40 * contador, 40 * contador, 300, 150);

		CierraTodos oyenteCerrar = new CierraTodos();

		BotonDePrincipal.addActionListener(oyenteCerrar);

	}

	private class CierraTodos implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			dispose();
		}

	}

	private static int contador = 0;

}