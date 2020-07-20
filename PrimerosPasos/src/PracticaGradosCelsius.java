import javax.swing.JOptionPane;

public class PracticaGradosCelsius {

	private static final String Cel = "Celsius";
	private static final String Far = "Fahrenheit";

	public static void main(String[] args) {

		String Grados1 = "";

		String Grados2 = "";

		double cantidad = 0;

		Grados1 = JOptionPane.showInputDialog("Introducir tipo de grado : Celsius/Fahrenheit");

		cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad deseada a convertir"));

		System.out.println(cantidad + " " + Grados1);

		Grados2 = JOptionPane.showInputDialog("Introducir tipo de grado : Celsius/Fahrenheit");

		if (Grados1.equals(Cel) && Grados2.equals(Far)) {
			System.out.println("Es igual a " + (cantidad * 1.8 + 32) + " " + Grados2);

		}

		if (Grados1.equals(Far) && Grados2.equals(Cel)) {
			System.out.println("Es igual a " + (cantidad - 32) / 1.8 + " " + Grados2);
			return;
		}
	}
}