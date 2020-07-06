package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setBounds(500,300,400,200);
		
		setTitle("Primer texto");
		
		Lamina milamina = new Lamina();
		
		add(milamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo swing", 30, 50);
		
	}
}