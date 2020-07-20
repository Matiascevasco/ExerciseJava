
public class Uso_Arrays_3_Simplificado {

	public static void main(String[] args) {

		int[][] matrix = { { 92, 84, 65, 32, 20 }, { 78, 94, 16, 23, 56 }, { 89, 50, 25, 10, 99 },
				{ 37, 92, 31, 15, 19 } };

		for (int[] fila : matrix) {
			System.out.println();

			for (int z : fila) {
				System.out.print(z + " ");
			}
		}

	}

}
