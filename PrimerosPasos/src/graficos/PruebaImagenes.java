package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaImagenes {

	public static void main(String[] args) {

		MarcoAccion marco = new MarcoAccion();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);
	}

}

class MarcoAccion extends JFrame {

	public MarcoAccion() {

		setTitle("Prueba Acciones");

		setBounds(600, 350, 600, 300);

		PanelAccion lamina = new PanelAccion();

		add(lamina);
	}
}

class PanelAccion extends JPanel {

	public PanelAccion() {

		AccionColor AccionAmarillo = new AccionColor("Amarillo", new ImageIcon("graficos/amarillo.png"), Color.yellow);

		AccionColor AccionRojo = new AccionColor("Rojo", new ImageIcon("graficos/rojo.png"), Color.red);

		AccionColor AccionAzul = new AccionColor("Azul", new ImageIcon("graficos/azul.png"), Color.blue);

		/*
		 * JButton botonamarillo = new JButton(AccionAmarillo);
		 * 
		 * add(botonamarillo);
		 */

		add(new JButton(AccionAmarillo));

		add(new JButton(AccionRojo));

		add(new JButton(AccionAzul));

		/*
		 * JButton botonamarillo = new JButton("Amarillo");
		 * 
		 * JButton botonrojo = new JButton("Rojo");
		 * 
		 * JButton botonazul = new JButton("Azul");
		 * 
		 * add(botonamarillo);
		 * 
		 * add(botonrojo);
		 * 
		 * add(botonazul);
		 */

		InputMap MapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		// KeyStroke TeclaAmarilla = KeyStroke.getKeyStroke("ctrl A");

		MapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo amarillo");

		MapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo rojo");

		MapaEntrada.put(KeyStroke.getKeyStroke("ctrl C"), "fondo azul");

		ActionMap MapaAccion = getActionMap();

		MapaAccion.put("fondo amarillo", AccionAmarillo);

		MapaAccion.put("fondo rojo", AccionRojo);

		MapaAccion.put("fondo azul", AccionAzul);

	}

	private class AccionColor extends AbstractAction {

		public AccionColor(String nombre, Icon icono, Color color_boton) {

			putValue(Action.NAME, nombre);

			putValue(Action.SMALL_ICON, icono);

			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);

			putValue("Color_de_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e) {

			Color c = (Color) getValue("Color_de_fondo");

			setBackground(c);

			System.out.println(
					"Nombre: " + getValue(Action.NAME) + ". Descripcion: " + getValue(Action.SHORT_DESCRIPTION));

		}

	}
}
