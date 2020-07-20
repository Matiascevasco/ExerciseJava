import javax.swing.JOptionPane;

public class PracticaSegundosHoras {

	public static void main(String[] args) {

		int Segundos = 3600;

		int Horas1 = Integer.parseInt(JOptionPane.showInputDialog("Primer horario"));

		int Horas2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo horario"));

		int res = Horas1 - Horas2;

		if (Horas1 > Horas2) {

			res = (24 - res) * Segundos;

		} else if (Horas1 < Horas2) {
			res = res * -Segundos;
		} else
			res = 0;

		System.out.println(
				"La cantidad de segundos transcurridos entre " + Horas1 + "hs" + " y " + Horas2 + "hs" + " son " + res);

	}

}
