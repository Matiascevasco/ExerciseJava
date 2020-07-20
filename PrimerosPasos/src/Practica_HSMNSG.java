import javax.swing.JOptionPane;

public class Practica_HSMNSG {

	private static final String HS = "Horas";

	private static final String MN = "Minutos";

	private static final String SG = "Segundos";

	public static void main(String[] args) {

		String Medida_tiempo = "";

		int res = 0;

		do {

			Medida_tiempo = JOptionPane.showInputDialog("Elije uno: Horas, Minutos, Segundos");

		} while (Medida_tiempo.equals(HS) == false && Medida_tiempo.equals(MN) == false
				&& Medida_tiempo.equals(SG) == false);

		int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad deseada a convertir"));

		if (Medida_tiempo.equals(HS)) {
			res = Cantidad * 3600;

		} else if (Medida_tiempo.equals(MN)) {
			res = Cantidad * 60;

		} else if (Medida_tiempo.equals(SG)) {
			res = Cantidad;

		}
		System.out.println(Cantidad + " " + Medida_tiempo + " es igual a " + res + " segundos ");

	}

}
