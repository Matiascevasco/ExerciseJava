package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class Prueba_temporizador {

	public static void main(String[] args) {

		Damelahora tiempo = new Damelahora();

		Timer mi_temporizador = new Timer(10000, tiempo);

		mi_temporizador.start();

		JOptionPane.showMessageDialog(null, "Pulsa ok para detener ");

		System.exit(0);

	}

}

class Damelahora implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		Date Ahora = new Date();

		System.out.println("Te pongo la hora cada 10 sg " + Ahora);

		Toolkit.getDefaultToolkit().beep();
	}
}
