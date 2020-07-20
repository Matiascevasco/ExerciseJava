package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Nombredefuentes {

	public static void main(String[] args) {

		String fuente = JOptionPane.showInputDialog("Intrduce la fuente");

		boolean estalafuente = false;

		String[] NombredeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String nombredelafuente : NombredeFuentes) {

			if (nombredelafuente.equals(fuente)) {

				estalafuente = true;
			}

		}

		if (estalafuente) {

			System.out.println("Fuente instalada");

		} else {

			System.out.println("No está instalada la fuente");
		}
	}

}
