package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Temporizador_claseinternalocal {

	public static void main(String[] args) {

		Reloj1 mireloj = new Reloj1();

		mireloj.Enmarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar ");

		System.exit(0);

	}

}

class Reloj1 {

	public void Enmarcha(int intervalo, final boolean sonido) {

		class Decimelahora2 implements ActionListener {

			public void actionPerformed(ActionEvent evento) {

				Date ahora = new Date();

				System.out.println("Te pongo la hora cada 3 sg " + ahora);

				if (sonido) {

					Toolkit.getDefaultToolkit().beep();
				}
			}

		}

		ActionListener oyente = new Decimelahora2();

		Timer mitemporizador = new Timer(intervalo, oyente);

		mitemporizador.start();

	}
}
