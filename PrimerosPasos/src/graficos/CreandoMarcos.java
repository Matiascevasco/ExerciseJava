package graficos;
import java.awt.Frame;

import javax.swing.*;

class CreandoMarcos {

	public static void main(String[] args) {
		
		Mi_marco marco1 = new Mi_marco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Mi_marco extends JFrame{
	
	public Mi_marco(){
		
		//setSize(500,300);
		
		//setLocation(500,300);
		
		setBounds(500,300,550,250);  // en vez de usar setSize y setLocation usamos los dos juntos en setBounds
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
	}
}
