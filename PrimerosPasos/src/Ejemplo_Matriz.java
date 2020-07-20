
public class Ejemplo_Matriz {

	private static final int SIZE = 7;

	public static void main(String[] args) {

		int[][] matrizA = new int[SIZE][SIZE];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = i + j;
			}
		}
		printMatrix(matrizA);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(String.valueOf(matrix[i][j]) + "\t");
			}
			System.out.print("\n");
		}
	}
}