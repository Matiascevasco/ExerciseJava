package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefe_RRHH = new Jefatura("Juan Monzón", 55000, 2006 , 5, 29);
		
		jefe_RRHH.establece_incentivo(2500);
		
		Empleado mis_empleados[] = new Empleado[6];
		
		mis_empleados[0] = new Empleado("Matías cevasco", 45000, 1996, 12, 22);
		
		mis_empleados[1] = new Empleado("Roberto Sánchez", 85000, 2004, 6, 15);
		
		mis_empleados[2] = new Empleado("Paula Gómez", 60000, 2010, 7, 10);
		
		mis_empleados[3] = new Empleado("Nicolas Fernández");
		
		mis_empleados[4]=jefe_RRHH;   //POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION.
		
		mis_empleados[5]=new Jefatura("María Lorenzoni", 40000, 1998, 4, 30);
		
		Jefatura jefa_finanzas=(Jefatura)mis_empleados[5];
		
		jefa_finanzas.establece_incentivo(5000);
		
		
		
		for(Empleado e : mis_empleados) {
			
			e.sube_sueldo(5);
		}
		
		for(Empleado e : mis_empleados) {
			
			System.out.println("Nombre " + e.decime_nombre()
					+ " Sueldo " + e.decime_sueldo()
					+ " Fecha de alta " + e.decime_fecha_contrato());
		}
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		alta_contrato = calendario.getTime();
		
		++id_siguiente;
		
		id=id_siguiente;
		
	}
	
	public Empleado(String nom) {
		
		this(nom,30000,2020,01,01);
		
	}
	
	public String decime_nombre() {  //GETTER
		
		return nombre + " ID " + id;
	}
	
	public double decime_sueldo() {   //GETTER
		
		return sueldo;
	}
	
	public Date decime_fecha_contrato() {   //GETTER
		
		return alta_contrato;
	}
	
	public void sube_sueldo(double porcentaje) {   //SETTER
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date alta_contrato;
	
	private static int id_siguiente;
	
	private int id;
}
class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom, sue, anio, mes, dia);

	}
	public void establece_incentivo(double b) {
		
		incentivo=b;
	}
	
	public double decime_sueldo() {
		
		double sueldo_jefe = super.decime_sueldo();
		
		return sueldo_jefe + incentivo;
	}
	
	private double incentivo;
}	



