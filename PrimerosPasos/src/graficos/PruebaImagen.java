package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagen {

	public static void main(String[] args) {

		MarcoImagen mi_marco = new MarcoImagen();

		mi_marco.setVisible(true);

		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame {

	public MarcoImagen() {

		setTitle("Marco con imagen");

		setBounds(750, 300, 500, 300);

		Laminaconimagen milamina = new Laminaconimagen();

		add(milamina);
	}
}

class Laminaconimagen extends JPanel {

	public Laminaconimagen() {

		/*
		 * try { miimagen.getCanonicalPath();
		 * System.out.println(miimagen.getCanonicalPath()); } catch (IOException e1) {
		 * 
		 * e1.printStackTrace(); }
		 */

		try {
			imagen = ImageIO.read(new File("graficos/zoom.jpg"));
		} catch (IOException e) {

			System.out.println("La imagen no se encuentra");
		}
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		File miimagen = new File("src/graficos/zoom.jpg");

		int anchoimg = imagen.getWidth(this);

		int altoimg = imagen.getHeight(this);

		g.drawImage(imagen, 0, 0, null);

		for (int i = 0; i < 300; i++) {

			for (int j = 0; j < 200; j++) {

				if (i + j > 0) {

					// g.copyArea(0, 0, 153, 227, 153*i, 227*j);

					g.copyArea(0, 0, anchoimg, altoimg, anchoimg * i, altoimg * j);

				}
			}
		}

	}

	private Image imagen;
}