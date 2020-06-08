
public class Practica10 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 1;
		int objeto;
		int limite = 50;
	 
		System.out.println(numero1);
		System.out.println(numero2);
		
		while(numero2 + numero1 <= limite) {
			objeto = numero1;
			numero1 = numero2;
			numero2 = objeto + numero1;
			System.out.println(numero2);
		}

	}

}
