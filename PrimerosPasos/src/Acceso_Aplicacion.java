import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {

		String clave = "Matias";

		String a = "";

		while (clave.equals(a) == false) {

			a = JOptionPane.showInputDialog("Introduce la contrase�a");
			if (clave.equals(a) == false) {
				System.out.println("Contrase�a Incorrecta");

			}
		}

		System.out.println("Contrase�a Correcta. Acceso Permitido");

	}

}
