package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		
		MarcoConDibujos mi_marco = new MarcoConDibujos();
		
		mi_marco.setVisible(true);
		
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Prueba de dibujo");
		
		setSize(400,400);
		
		Laminaconfigura milamina = new Laminaconfigura();
		
		add(milamina);
	}
}

class Laminaconfigura extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		/*g.drawRect(50, 50, 200, 200);
		
		g.drawLine(100, 100, 300, 200);
		
		g.drawArc(50, 70, 200, 300, 120, 90);*/
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100 ,300, 250));
		
		double CentroenX = rectangulo.getCenterX();
		
		double CentroenY = rectangulo.getCenterY();
		
		double radio = 125;
		
		Ellipse2D Circulo = new Ellipse2D.Double();
		
		Circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);
		
		g2.draw(Circulo);
		
	}
}