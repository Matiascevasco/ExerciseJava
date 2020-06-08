import javax.swing.JOptionPane;

public class Practica5{

	public static void main(String[] args) {

		String nombre;
		
		char letras;
		
		nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		
		for( int i = nombre.length()-1; i>=0; i--) {
		
		letras = nombre.charAt(i);
		
		System.out.print(letras);
		
		}

	}

}
