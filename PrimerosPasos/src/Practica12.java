
public class Practica12 {

	public static void main(String[] args) {
		
		int[] lista = {15, 26, 7, 92, 81, 5};
		
		System.out.println(exist_number( lista , 15));

	} 
	public static boolean exist_number(int[] numeros, int a) {
		
		for(int i = 0; i < numeros.length; i++) {
			if( numeros[i] == a) {
			return true;
			
	       }
		}
		return false;	
	}		
}
