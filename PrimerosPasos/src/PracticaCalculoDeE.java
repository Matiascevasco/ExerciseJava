
public class PracticaCalculoDeE {

	public static void main(String[] args) {

		int cantidad = 20;
		
		double suma = 0;

		double den = 0;

		for (int i = 0; i < cantidad; i++) {

			den = 1 / factorial(i);

			suma += den;

		}
		System.out.println("e es igual a: " + suma);
	}

	public static double factorial(int n) {

		double num = 1;

		for (int i = 2; i <= n; i++) {

			num *= i;
		}

		return num;

	}

}
