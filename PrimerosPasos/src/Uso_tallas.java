import java.util.*;

public class Uso_tallas {

	enum talla {

		CHICO("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private talla(String abreviatura) { // CONSTRUCTOR Y TRABAJA COMO SETTER

			this.abreviatura = abreviatura;
		}

		public String dame_abreviatura() { // GETTER

			return abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla: CHICO, MEDIANO, GRANDE, MUY_GRANDE");

		String entrada_datos = entrada.next().toUpperCase(); // si la respuesta es en minuscula la convierte en
																// mayuscula,

		talla la_talla = Enum.valueOf(talla.class, entrada_datos);

		System.out.println("Talla = " + la_talla);

		System.out.println("Abreviatura= " + la_talla.dame_abreviatura());

	}

}
