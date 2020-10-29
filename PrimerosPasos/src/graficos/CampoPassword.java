package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class CampoPassword {

	public static void main(String[] args) {

		MarcoPassword mimarco = new MarcoPassword();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPassword extends JFrame {

	public MarcoPassword() {

		setBounds(400, 300, 550, 400);

		LaminaPassword milamina = new LaminaPassword();

		add(milamina);

		setVisible(true);
	}
}

class LaminaPassword extends JPanel {

	public LaminaPassword() {

		setLayout(new BorderLayout());

		JPanel laminasuperior = new JPanel();

		laminasuperior.setLayout(new GridLayout(2, 2));

		add(laminasuperior, BorderLayout.NORTH);

		JLabel etiqueta1 = new JLabel("Usuario");

		JLabel etiqueta2 = new JLabel("Contraseña");

		JTextField c_usuario = new JTextField(15);
		
		Comprueba_pass mievento = new Comprueba_pass();

		c_contra = new JPasswordField(15);
		
		c_contra.getDocument().addDocumentListener(mievento);

		laminasuperior.add(etiqueta1);

		laminasuperior.add(c_usuario);

		laminasuperior.add(etiqueta2);

		laminasuperior.add(c_contra);

		JButton enviar = new JButton();

		add(enviar, BorderLayout.SOUTH);
	}

	private class Comprueba_pass implements DocumentListener {

		public void insertUpdate(DocumentEvent e) {

			char[] contrasena;

			contrasena = c_contra.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {

				c_contra.setBackground(Color.red);

			} else {

				c_contra.setBackground(Color.white);

			}
		}

		public void removeUpdate(DocumentEvent e) {
			
			char[] contrasena;

			contrasena = c_contra.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {

				c_contra.setBackground(Color.red);

			} else {

				c_contra.setBackground(Color.white);

			}

		}

		public void changedUpdate(DocumentEvent e) {

		}

	}

	JPasswordField c_contra;
}