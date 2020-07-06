package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class Temporizador_claseinterna {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj(5000,true);
		
		mireloj.Enmarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar ");
		
		System.exit(0);

	}

}

class Reloj{
	
	public Reloj(int intervalo,boolean sonido) {
		
		this.intervalo = intervalo;
		
		this.sonido = sonido;
		
	}
	
	public void Enmarcha() {
		
		ActionListener oyente = new Decimelahora();
		
		Timer mitemporizador = new Timer(intervalo,oyente);
		
		mitemporizador.start();
		
	}
	
	private int intervalo;
	
	private boolean sonido;
	
	private class Decimelahora implements ActionListener{
		
		public void actionPerformed(ActionEvent evento) {
			
		Date ahora = new Date();
		
		System.out.println("Te digo la hora cada 5 sg " + ahora);
		
		if(sonido) {
			
			Toolkit.getDefaultToolkit().beep();
		}
	  }
	}
}