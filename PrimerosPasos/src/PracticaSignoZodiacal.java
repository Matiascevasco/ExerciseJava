import javax.swing.JOptionPane;

public class PracticaSignoZodiacal {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su número de dia de nacimiento"));

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su número de mes de nacimiento"));

		if (dia >= 21 && dia <= 31 && mes == 3 || dia <= 20 && dia >= 1 && mes == 4) {
			System.out.println("Tu signo zodiacal es aries");

		} else if (dia >= 21 && dia <= 30 && mes == 4 || dia <= 20 && dia >= 1 && mes == 5) {
			System.out.println("Tu signo zodiacal es tauro");

		} else if (dia >= 21 && dia <= 31 && mes == 5 || dia <= 20 && dia >= 1 && mes == 6) {
			System.out.println("Tu signo zodiacal es geminis");

		} else if (dia >= 21 && dia <= 30 && mes == 6 || dia <= 22 && dia >= 1 && mes == 7) {
			System.out.println("Tu signo zodiacal es cáncer");

		} else if (dia >= 23 && dia <= 31 && mes == 7 || dia <= 22 && dia >= 1 && mes == 8) {
			System.out.println("Tu signo zodiacal es leo");

		} else if (dia >= 23 && dia <= 31 && mes == 8 || dia <= 22 && dia >= 1 && mes == 9) {
			System.out.println("Tu signo zodiacal es virgo");

		} else if (dia >= 23 && dia <= 30 && mes == 9 || dia <= 22 && dia >= 1 && mes == 10) {
			System.out.println("Tu signo zodiacal es libra");

		} else if (dia >= 23 && dia <= 31 && mes == 10 || dia <= 22 && dia >= 1 && mes == 11) {
			System.out.println("Tu signo zodiacal es escorpio");

		} else if (dia >= 23 && dia <= 30 && mes == 11 || dia <= 21 && dia >= 1 && mes == 12) {
			System.out.println("Tu signo zodiacal es sagitario");

		} else if (dia >= 22 && dia <= 31 && mes == 12 || dia <= 20 && dia >= 1 && mes == 1) {
			System.out.println("Tu signo zodiacal es capricornio");

		} else if (dia >= 21 && dia <= 31 && mes == 1 || dia <= 18 && dia >= 1 && mes == 2) {
			System.out.println("Tu signo zodiacal es acuario");

		} else if (dia >= 19 && dia <= 29 && mes == 2 || dia <= 20 && dia >= 1 && mes == 3) {
			System.out.println("Tu signo zodiacal es piscis");

		}

	}

}
