
public class Practica9 {

	public static void main(String[] args) {
		
		String[] lista = {"nicolas","matias","matias","agustin","natalia","andres"};
		
		lista = darvuelta(lista);
		
		personalPrint(toSet(lista));
		
	}
 
	public static String[] darvuelta(String[]lista) {
		
		String[]aux = new String[lista.length];
		
		for(int i = 0; i < lista.length; i++) {
			
			aux[i] = lista[lista.length - 1 - i];
		}
		return aux;
		
	}
	public static void personalPrint(String[]lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	
	}
	public static String[] toSet(String[]lista) {
		
		String[]aux = new String [ lista.length];
		
		int cont = 0;
		
		for(int i = 0; i < lista.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < aux.length; j++) {
				
				if(lista[i].equals(aux[j])) {
					flag = false;
				}
			}
			if(flag) {
				aux[cont] = lista[i];
				cont++;
			}
		}
		String[]res = new String[cont];
		
		for(int i = 0; i < cont; i++) {
			
			res[i] = aux[i];
		}
		return res;
	}

}
