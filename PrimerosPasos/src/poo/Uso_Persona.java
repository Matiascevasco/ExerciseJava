package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona[] laspersonas = new Persona[2];

		laspersonas[0] = new Empleado2("Luis Conde", 5000, 2009, 02, 25);
		laspersonas[1] = new Alumno("Ana Lopez", "biologia");

		for (Persona p : laspersonas) {

			System.out.println(p.decime_nombre() + " , " + p.decime_descripcion());
		}

	}

}

abstract class Persona {

	public Persona(String nom) {

		nombre = nom;
	}

	public String decime_nombre() {

		return nombre;
	}

	public abstract String decime_descripcion();

	private String nombre;

}

class Empleado2 extends Persona {

	public Empleado2(String nom, double sue, int anio, int mes, int dia) {

		super(nom);

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);

		alta_contrato = calendario.getTime();

		++id_siguiente;

		id = id_siguiente;

	}

	public String decime_descripcion() {

		return "Este empleado tiene un id= " + id + " con un sueldo= " + sueldo;
	}

	public double decime_sueldo() { // GETTER

		return sueldo;
	}

	public Date decime_fecha_contrato() { // GETTER

		return alta_contrato;
	}

	public void sube_sueldo(double porcentaje) { // SETTER

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	private double sueldo;

	private Date alta_contrato;

	private static int id_siguiente;

	private int id;

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {

		super(nom);

		carrera = car;

	}

	public String decime_descripcion() {

		return "Este alumno está estudiando la carrera de " + carrera;
	}

	private String carrera;
}
