public class PracticaCuadradoDeUnNumero {

	private static final String CUADRADO = "Es cuadrado perfecto";

	public static void main(String[] args) {

		CuadradoPerfecto(16);

	}

	public static boolean CuadradoPerfecto(int n) {

		boolean res = false;

		if (n < 0) {
			System.out.println("El número debe ser positivo");
			return res;
		}

		if (n == 0) {
			res = true;
			System.out.println(n + " " + CUADRADO + " de " + n);
		} else {

			int sum = 0;

			for (int i = 1; sum <= n; i++) {
				sum += 2 * i - 1;
				if (sum == n) {
					res = true;
					System.out.println(n + " " + CUADRADO + " de " + i);
					break;
				}
			}
		}

		if (!res) {
			System.out.println("El número no tiene un cuadrado perfecto ");
		}

		return res;
	}
}