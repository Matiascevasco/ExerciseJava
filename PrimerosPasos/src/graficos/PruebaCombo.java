package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaCombo {

	public static void main(String[] args) {

		MarcoCombo mimarco = new MarcoCombo();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCombo extends JFrame {

	public MarcoCombo() {

		setBounds(550, 300, 550, 400);

		setVisible(true);

		LaminaCombo milamina = new LaminaCombo();

		add(milamina);
	}
}

class LaminaCombo extends JPanel {

	public LaminaCombo() {

		setLayout(new BorderLayout());

		texto = new JLabel("El grupo se habia compuesto por elementos...");

		texto.setFont(new Font("Serif", Font.PLAIN, 18));

		add(texto, BorderLayout.CENTER);
		
		JPanel laminanorte = new JPanel();
		
		micombo = new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		
		micombo.addItem("Arial");
		
		micombo.addItem("Monospaced");
		
		micombo.addItem("Cambria");
		
		eventocombo mievento =  new eventocombo();
		
		micombo.addActionListener(mievento);
		
		laminanorte.add(micombo);
		
		add(laminanorte, BorderLayout.NORTH);

	}
	
	private class eventocombo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));

		}
		
		
	}

	private JLabel texto;

	private JComboBox micombo;

	
}
