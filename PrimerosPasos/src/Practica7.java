import java.util.*;
public class Practica7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
	String a = entrada.nextLine();
	String b = entrada.nextLine();
	
	System.out.println(String.format("La cadena %s esta dentro de %s", b, a));
	
	System.out.println(subcadena(a,b));
	
	}
	public static boolean subcadena(String posta, String substring) {
			
		boolean resultado = false;
		
		int i = 0; 
		
		while(i<= posta.length() - substring.length()) {
			
			String aux = posta.substring(i, i + substring.length());
			
			if(aux.toUpperCase().charAt(0) == substring.toUpperCase().charAt(0)) {
				resultado = true;
						break;
			}
			
		} i++;
		
		return resultado;
		
		
	}
	

}
