package poo;

public class Camioneta extends Coche {
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Camioneta(int plazas_extra,int capacidad_carga) {
		
		super();
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
		
	}
	
	public String decime_datos_camioneta() {
		
		return "Las plazas son " + plazas_extra + " y la capacidad de carga es de: " + capacidad_carga; 
	}

}
