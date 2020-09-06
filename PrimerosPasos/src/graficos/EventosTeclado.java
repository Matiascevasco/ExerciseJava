package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		
		MarcoconTeclas mimarco = new MarcoconTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoconTeclas extends JFrame{
	
	public MarcoconTeclas() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventodeTeclado Tecla = new EventodeTeclado();
		
		addKeyListener(Tecla);
	}
}

class EventodeTeclado implements KeyListener{

	public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
		
		System.out.println(letra);
	}

	public void keyPressed(KeyEvent e) {

		/*int codigo = e.getExtendedKeyCode();
		
		System.out.println(codigo);*/
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	
}
