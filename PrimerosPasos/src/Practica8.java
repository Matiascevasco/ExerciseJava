import java.util.*;

public class Practica8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase = "hola amigos. como estan";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o'
					&& frase.charAt(i) != 'u') {

				System.out.print(frase.charAt(i));
			}

		}

	}

}