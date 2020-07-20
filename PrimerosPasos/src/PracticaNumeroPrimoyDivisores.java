import javax.swing.JOptionPane;

public class PracticaNumeroPrimoyDivisores {

	public static void main(String[] args) {

		int numero = 0;
		int divisor = 0;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisor++;

				System.out.println("El divisor es: " + i);
			}
		}

		for (int i = -1; i >= numero; i--) {
			if (numero % i == 0) {
				divisor--;

				System.out.println("El divisor es: " + i);
			}
		}

		if (divisor == 2 || divisor == -2) {
			System.out.println("El número " + numero + " es primo");
		} else
			System.out.println("El número " + numero + " no es primo");

	}

}
