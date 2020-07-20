import javax.swing.JOptionPane;

public class PracticaInvertirNumeros {

	public static void main(String[] args) {

		String numeros1;

		char numeros2;

		numeros1 = JOptionPane.showInputDialog("Ingresa un número del 0 al 1000");

		if (Integer.parseInt(numeros1) >= 1000 || Integer.parseInt(numeros1) < 0) {
			JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a 0 o mayor o igual a 1000");
			return;
		}

		for (int i = numeros1.length() - 1; i >= 0; i--) {

			numeros2 = numeros1.charAt(i);

			System.out.print(numeros2);

		}

	}

}
