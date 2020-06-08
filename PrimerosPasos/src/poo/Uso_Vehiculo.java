package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche mi_coche1 = new Coche();
		
		mi_coche1.establece_color("rojo");
		
		Camioneta mi_camioneta1 = new Camioneta( 7 , 850 );
		
		mi_camioneta1.establece_color("azul");
		
		mi_camioneta1.configura_asientos("si");
		
		mi_camioneta1.configura_climatizador("si");
		
		System.out.println(mi_coche1.decime_datos_generales() + ". " + mi_coche1.decime_color());
		
		System.out.println(mi_camioneta1.decime_datos_generales() + ". " 
		+ mi_camioneta1.decime_datos_camioneta() + " KG ");
		
	}

}
