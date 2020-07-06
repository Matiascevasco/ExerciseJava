package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoconColor {

	public static void main(String[] args) {
		
        MarcoConColor mimarco = new MarcoConColor();
		
		mimarco .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {

		setTitle("Prueba con color");
		
		setSize(400, 400);
		
		Laminaconcolor milamina = new Laminaconcolor();
		
		add(milamina);
		
		milamina.setBackground(Color.PINK);
	}
}

class Laminaconcolor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
        Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.YELLOW);
		
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(128, 255, 255).darker().darker());
		
		g2.fill(elipse);

	}

}
