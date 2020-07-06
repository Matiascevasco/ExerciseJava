package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
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
		
		/*Empleado director_comercial = new Jefatura("Juan Monzón", 55000, 2006 , 5, 29);
		
		Comparable ejemplo = new Empleado("Elizabeth Grimes", 60000, 2007, 6, 21);
		
		if( director_comercial instanceof Empleado) {   //instanceof se puede usar en fases
			
			System.out.println("Es de tipo Jefatura");
		}
		
		if( ejemplo instanceof Comparable) {   //instanceof se puede usar en interfases
			
			System.out.println("Implementa la insterfas Comparable");
		}*/
		
		System.out.println(jefa_finanzas.tomar_desiciones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_finanzas.decime_nombre() + " tiene un bonus de: " +
		jefa_finanzas.establece_bonus(500));
		
		System.out.println(mis_empleados[3].decime_nombre() + " tiene un bonus de: " +
		mis_empleados[3].establece_bonus(200));
		
		for(Empleado e : mis_empleados) {
			
			e.sube_sueldo(5);
		}
		
		Arrays.sort(mis_empleados);
		
		for(Empleado e : mis_empleados) {
			
			System.out.println("Nombre " + e.decime_nombre()
					+ " Sueldo " + e.decime_sueldo()
					+ " Fecha de alta " + e.decime_fecha_contrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		alta_contrato = calendario.getTime();
		
		++id_siguiente;
		
		id=id_siguiente;
		
	}
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date alta_contrato;
	
	private static int id_siguiente;
	
	private int id;
}
class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom, sue, anio, mes, dia);

	}
	
	public String tomar_desiciones(String desicion) {
		
		return "Un miembro de la direccion a tomado la desision de: " + desicion;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
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



