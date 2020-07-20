
public class PracticaPiramidePascal {

	public static void main(String[] args) {

		pascal(10);

	}

	public static void pascal(int n) {

		if (n < 1 || n > 20) {
			System.out.println("El número debe estar entre 1 y 20 ");
			return;
		}

		System.out.println("1");
		if (n == 1) {
			return;
		}

		System.out.println("1 1");

		int[] ValoresPascalPorFila = new int[n];
		ValoresPascalPorFila[0] = 1;
		ValoresPascalPorFila[1] = 1;

		for (int i = 2; i < n; i++) {
			ValoresPascalPorFila[i] = 0;
		}

		int[] ValoresPascalPorFilaAux = new int[n];
		ValoresPascalPorFilaAux[0] = 1;

		for (int j = 0; j < n - 2; j++) {
			String FilaPascal = "1";

			for (int i = 1; i < n; i++) {
				ValoresPascalPorFilaAux[i] = ValoresPascalPorFila[i - 1] + ValoresPascalPorFila[i];

				if (ValoresPascalPorFilaAux[i] != 0) {
					FilaPascal += " " + ValoresPascalPorFilaAux[i];
				}
			}
			for (int i = 0; i < n; i++) {

				ValoresPascalPorFila[i] = ValoresPascalPorFilaAux[i];

			}

			System.out.println(FilaPascal);
		}
	}

}
