
public class PracticaAproximacionPI {

	public static void main(String[] args) {

		constante(1000);

	}

	public static void constante(int N) {

		double numerador = 1;

		double denominador = 1;

		double div = numerador / denominador;

		for (int i = 2; i < N; i += 2) {
			numerador = Math.pow(i, 2);
			denominador = (i - 1) * (i + 1);

			div = div * numerador / denominador;

		}
		System.out.println(div * 2);

	}

}
