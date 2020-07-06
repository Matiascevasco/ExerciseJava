import javax.swing.JOptionPane;

public class Practica_signodelresultado {

	public static void main(String[] args) {
		
		int n1 = 0;
		
		int n2 = 0;
		
		int cuenta = n1 * n2;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

		if((n1<0 && n2 <0) || (n1>0 && n2>0)) {
			System.out.println("El resultado es positivo");
		}else if (n1 == 0 || n2 == 0) {
			System.out.println("El resultado no tiene signo ");
		}else {
			System.out.println("El resultado es negativo");
		}

	}

}
