package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoconFuentes {

	public static void main(String[] args) {

		MarcoconFuentes mimarco = new MarcoconFuentes();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);
	}

}

class MarcoconFuentes extends JFrame {

	public MarcoconFuentes() {

		setTitle("Prueba con fuentes");

		setSize(400, 400);

		Laminaconcolor2 milamina = new Laminaconcolor2();

		add(milamina);

		milamina.setForeground(Color.BLUE);
	}
}

class Laminaconcolor2 extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Font mifuente = new Font("Arial", Font.BOLD, 26);

		g2.setFont(mifuente);

		g2.drawString("Matias", 100, 100);

		g2.setFont(new Font("Timer", Font.ITALIC, 30));

		g2.drawString("Curso de java", 100, 200);
	}

}
