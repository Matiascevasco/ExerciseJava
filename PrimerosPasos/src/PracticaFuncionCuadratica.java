import javax.swing.JOptionPane;

public class PracticaFuncionCuadratica {

	public static void main(String[] args) {

		int A = 0;

		int B = 0;

		int C = 0;

		A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));

		B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));

		C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));

		double Raiz = Math.pow(B, 2) - (4 * A * C);

		if (Raiz > 0) {

			double x1 = (-B + Raiz) / (2 * A);

			double x2 = (-B - Raiz) / (2 * A);

			System.out.println("El valor de x1 = " + x1 + " y el valor de x2 = " + x2);
		}
	}

}