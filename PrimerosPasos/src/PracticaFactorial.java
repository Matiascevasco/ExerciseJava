
public class PracticaFactorial {

	public static void main(String[] args) {

		int factorial = 1;
		int numero = 5;

		for (int i = 2; i <= numero; i++) {

			factorial = factorial * i;

		}

		System.out.println("El factorial del número " + numero + " es " + factorial);

	}

}
