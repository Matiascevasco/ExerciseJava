import javax.swing.JOptionPane;

public class Practica_tamaño {

	private static final String BITS = "Bits";
	private static final String NIBBLE = "Cuado/Nibble";
	private static final String BYTE = "Byte";
	private static final String KB = "Kilobyte";
	private static final String MB = "Megabyte";
	private static final String GB = "Gigabyte";

	public static void main(String[] args) {
		
		String medidas = "";
		String cantidad = "";
		String medidas2 = "";
		
		do {
			
		medidas = JOptionPane.showInputDialog("Introduzca una medida: Bits, Cuado/Nibble, Byte, Kilobyte, Megabyte, Gigabyte");
		
		}while(medidas.equals(BITS) == false && medidas.equals(NIBBLE) == false &&
			   medidas.equals(BYTE) == false && medidas.equals(KB) == false &&
			   medidas.equals(MB) == false && medidas.equals(GB) == false);
		
		cantidad = JOptionPane.showInputDialog("Introduzca la cantidad deseada a convertir");
		
		System.out.println(cantidad + " " + medidas);
		
		do {
		
		medidas2 = JOptionPane.showInputDialog("Introduzca la medida de conversion: Bits, Cuado/Nibble, Byte, Kilobyte, Megabyte, Gigabyte");
		
		}while(medidas2.equals(BITS) == false && medidas2.equals(NIBBLE) == false &&
				   medidas2.equals(BYTE) == false && medidas2.equals(KB) == false &&
				   medidas2.equals(MB) == false && medidas2.equals(GB) == false);
		
		double res = calcular(medidas, medidas2, Integer.parseInt(cantidad));

		System.out.println("Es igual a " +  res + " " + medidas2);
	
	} 

	private static double calcular(String from, String to, int value){

		double res = 0;
		long totalbits = 0;
		
		if(from.equals(BITS)) {
			totalbits = fromBit(value);
		} else if(from.equals(BYTE)) {
			totalbits = fromByte(value);
		} else if(from.equals(KB)) {
			totalbits = fromKb(value);
		} else if(from.equals(MB)) {
			totalbits = fromMb(value);
		} else if(from.equals(NIBBLE)) {
			totalbits = fromNibble(value);
		} else if(from.equals(GB)) {
			totalbits = fromGb(value);
		}

		switch(to){
			case(BITS):
				res = toBit(totalbits);
			break;
			case(BYTE):
				res = toByte(totalbits);
			break;
			case(KB):
				res = toKb(totalbits);
			break;
			case(MB):
				res = toMb(totalbits);
			break;
			case(NIBBLE):
				res = toNibble(totalbits);
			break;
			case(GB):
				res = toGb(totalbits);
			break;
		}

		return res;

	}

	private static long fromBit(int value){
		return value;
	}

	private static long fromNibble(int value){
		return value*4;
	}

	private static long fromByte(int value){
		return value*8;
	}

	private static long fromKb(int value){
		return 1024 * fromByte(value);
	}

	private static long fromMb(int value){
		return 1024 * fromKb(value);
	}

	private static long fromGb(int value){
		return 1024 * fromKb(value);
	}

	private static long toBit(long value){
		return value;
	}

	private static double toNibble(long value){
		return value/4;
	}

	private static double toByte(long value){
		return value/8;
	}

	private static double toKb(long value){
		return toByte(value) / 1024;
	}

	private static double toMb(long value){
		return toKb(value) / 1024;
	}

	private static double toGb(long value){
		return toMb(value) / 1024;
	}
	
}