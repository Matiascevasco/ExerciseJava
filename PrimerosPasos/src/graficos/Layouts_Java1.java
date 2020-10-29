package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_Java1 {

	public static void main(String[] args) {

		MarcoLayout marco = new MarcoLayout();

		marco.setVisible(true);

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout extends JFrame {

	public MarcoLayout() {

		setTitle("Prueba Acciones");

		setBounds(600, 350, 600, 300);

		Panel_Layout lamina = new Panel_Layout();

		/*
		 * FlowLayout Dispocision = new FlowLayout(FlowLayout.LEFT);
		 * 
		 * lamina.setLayout(Dispocision);
		 */

		Panel_Layout2 lamina2 = new Panel_Layout2();

		add(lamina, BorderLayout.NORTH);

		add(lamina2, BorderLayout.SOUTH);

	}
}

class Panel_Layout extends JPanel {

	public Panel_Layout() {

		// setLayout(new FlowLayout(FlowLayout.CENTER, 80, 40));

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(new JButton("Amarillo"), BorderLayout.NORTH);

		add(new JButton("Rojo"), BorderLayout.SOUTH);

	}
}

class Panel_Layout2 extends JPanel {

	public Panel_Layout2() {

		setLayout(new BorderLayout());

		add(new JButton("Azul"), BorderLayout.WEST);

		add(new JButton("Verde"), BorderLayout.EAST);

		add(new JButton("Negro"), BorderLayout.CENTER);
	}
}