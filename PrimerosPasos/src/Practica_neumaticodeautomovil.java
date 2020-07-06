import javax.swing.JOptionPane;

public class Practica_neumaticodeautomovil {
	
	public static void main(String[] args) {
		
		double pre,vol,tem,res1,res2,masa; 
		
		pre = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad de presion"));
		
		System.out.println("Presion = " +pre);
		
		vol = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad de volumen"));
		
		System.out.println("Volumen = " + vol);
		
		tem = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad de temperatura"));
		
		while(tem == -460) {
			
			tem = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad de temperatura"));
			
		}
		
		System.out.println("Temperatura = " + tem);
		
		res1 = pre * vol;
		
		System.out.println("Presion X volumen = "  + res1);
		
		res2 = 0.37 * (tem +460);
		
		System.out.println("0,37 X temperatura + 460 = " + res2 );
		
		masa = res1/res2;
		
		System.out.println("Masa = " + res1/res2);
		
		System.out.println(res1 + " = " +  res2 * masa);
	}

}


