
public class Uso_Arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = new int [4][5];
		
		matrix[0][0]= 92;
		matrix[0][1]= 84;
		matrix[0][2]= 65;
		matrix[0][3]= 32;
		matrix[0][4]= 20;
		
		matrix[1][0]= 78;
		matrix[1][1]= 94;
		matrix[1][2]= 16;
		matrix[1][3]= 23;
		matrix[1][4]= 56;
		
		matrix[2][0]= 89;
		matrix[2][1]= 50;
		matrix[2][2]= 25;
		matrix[2][3]= 10;
		matrix[2][4]= 99;
		
		matrix[3][0]= 37;
		matrix[3][1]= 92;
		matrix[3][2]= 31;
		matrix[3][3]= 15;
		matrix[3][4]= 19;
		
		for(int i = 0; i<4; i++) {
			System.out.println();
			
			for(int j = 0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

	}

}
