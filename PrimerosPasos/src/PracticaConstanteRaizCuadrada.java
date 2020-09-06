
public class PracticaConstanteRaizCuadrada {

	public static void main(String[] args) {

		constante(36);

	}

	public static void constante(int N) {

		double x = 1;

		for (int i = 1; i < 1000000000; i++) {

			x = (x + N / x) / 2;
		}
		System.out.println("La raiz de " + N + " es igual a " + x);

	}

}
