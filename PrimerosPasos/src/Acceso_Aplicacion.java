import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {

		String clave = "Matias";

		String a = "";

		while (clave.equals(a) == false) {

			a = JOptionPane.showInputDialog("Introduce la contraseņa");
			if (clave.equals(a) == false) {
				System.out.println("Contraseņa Incorrecta");

			}
		}

		System.out.println("Contraseņa Correcta. Acceso Permitido");

	}

}
