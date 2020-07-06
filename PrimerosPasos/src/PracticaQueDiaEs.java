import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

public class PracticaQueDiaEs {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número de dia"));
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número de mes"));
		
		int anio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un año"));
		
		
		if (mes==2 && dia>=29) {
			JOptionPane.showMessageDialog(null, "Febrero tiene 28 o 29 dias");
			return;
		}
		
		if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
			JOptionPane.showMessageDialog(null, "El máximo número de estos meses es de 30");
			return;
		}

		if (dia<=0 || dia>31 || mes<=0 || mes>12 || anio<0) {
			JOptionPane.showMessageDialog(null, "Los dias deben ir de 1 a 31, los meses de 1 a 12 y los años deben ser mayor a 0");
			return;
		}
		
		Calendar calendario1 = Calendar.getInstance();
		
		calendario1.set(anio, mes-1, dia);
		
		int DiaDelaSemana = calendario1.get(Calendar.DAY_OF_WEEK);
		
		switch (DiaDelaSemana) {
			case Calendar.MONDAY:
				System.out.println("Es lunes");
				break;
				
			case Calendar.TUESDAY:
				System.out.println("Es martes");
				break;
				
			case Calendar.WEDNESDAY:	
				System.out.println("Es miércoles");
				break;
				
			case Calendar.THURSDAY:
				System.out.println("Es jueves");
				break;
				
			case Calendar.FRIDAY:
				System.out.println("Es viernes");
				break;
				
			case Calendar.SATURDAY:
				System.out.println("Es sábado");
				break;
				
			case Calendar.SUNDAY:
				System.out.println("Es domingo");
				break;
		}
		

	}

}