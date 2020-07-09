import javax.swing.JOptionPane;

public class PracticaSumaDeNumeros {

	public static void main(String[] args) {
		
		int n1 = 0;
		
		int n2 = 0;
		
		int n3 = 0;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		
		if(n1 == n2 + n3) {
			System.out.println("El numero uno es igual a la suma del numero dos y tres");
		}else if(n2 == n1 + n3) {
			System.out.println("El numero dos es igual a la suma del numero uno y tres");
		}else if(n3 == n1 + n2) {
			System.out.println("El numero tres es igual a la suma del numero uno y dos");
		}else System.out.println("No se encuentra igualdad en la suma de dos numeros");
	}

}
