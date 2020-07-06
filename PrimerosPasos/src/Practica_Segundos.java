import javax.swing.JOptionPane;

public class Practica_Segundos {
	
	private static final String MN = "Minutos";
	
	private static final String HS = "Horas";
	
	private static final String DI = "Dias";
	
	private static final String SE = "Semanas";
	
	private static final String ME = "Meses";

	public static void main(String[] args) {
		
		String opciones = "";

		String cantidad = "";
				
		do {		
	 	
		opciones = (JOptionPane.showInputDialog("Ingrese una opcion: Minutos, Horas "
		    		+ ",Dias ,Semanas, Meses"));
	    
		}while(opciones.equals(MN) == false && opciones.equals(HS) == false &&
		opciones.equals(DI) == false && opciones.equals(SE) == false && opciones.equals(ME) == false);
		
		do {
			
		cantidad = JOptionPane.showInputDialog("Ingrese un numero");
			
		}while (Integer.parseInt(cantidad)<0);
		
		double res = calcular (opciones, Integer.parseInt(cantidad));
		
		System.out.println(cantidad + " " + opciones  + " es igual a " + res + " segundos ");
	
	    }
	
	private static double calcular(String unidad, int valor) {
		
		double res = 0;
		
		if(unidad.equals(MN)) {
			res= fromMN(valor);
		}else if(unidad.equals(HS)) {
			res = fromHS(valor);
		}else if(unidad.equals(DI)) {
			res = fromDI(valor);
		}else if(unidad.equals(SE)) {
			res = fromSE(valor);
		}else if(unidad.equals(ME)){
			res = fromME(valor);
		}
		
		return res;
	}	
	
	private static long fromMN(int valor){
		return valor*60;
	}
	
	private static long fromHS(int valor){
		return 60*fromMN(valor);
	}
	
	private static long fromDI(int valor){
		return 24*fromHS(valor);
	}
	
	private static long fromSE(int valor){
		return 7*fromDI(valor);
	}
	
	private static long fromME(int valor){
		return 30*fromDI(valor);
	}
}	
