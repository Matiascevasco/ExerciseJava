import javax.swing.JOptionPane;

public class PracticaFechaEdad {

	public static void main(String[] args) {

		int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dia de nacimiento"));

		int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar mes de nacimiento"));

		int anio1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar año de nacimiento"));

		int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia actual"));

		int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes actual"));

		int anio2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año actual"));

		if (mes1 == 2 && dia1 >= 29 || mes2 == 2 && dia2 >= 29) {
			JOptionPane.showMessageDialog(null, "Febrero tiene 28 o 29 dias");
			return;
		}

		if ((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) && dia1 > 30
				|| (mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11) && dia2 > 30) {
			JOptionPane.showMessageDialog(null, "El máximo número de estos meses es de 30");
			return;
		}

		if (dia1 <= 0 || dia2 <= 0 || dia1 > 31 || dia2 > 31 || mes1 <= 0 || mes2 <= 0 || mes1 > 12 || mes2 > 12
				|| anio1 < 0 || anio2 < 0) {
			JOptionPane.showMessageDialog(null,
					"Los dias deben ir de 1 a 31, los meses de 1 a 12 y los años deben ser mayor a 0");
			return;
		}

		int edad = anio2 - anio1;

		if (dia2 < dia1 && mes2 <= mes1) {
			edad = edad - 1;
		}

		System.out.println("La edad de la persona es de: " + edad + " años ");

	}

}
