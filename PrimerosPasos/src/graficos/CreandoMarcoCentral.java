package graficos;
import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentral {

	public static void main(String[] args) {
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanio_pantalla = mi_pantalla.getScreenSize();
		
		int altura_pantalla = tamanio_pantalla.height;
		
		int ancho_pantalla = tamanio_pantalla.width;
		
		setSize(ancho_pantalla/2 , altura_pantalla/2);
		
		setLocation(ancho_pantalla/4 , altura_pantalla/4);
		
		setTitle("Marco Centrado");
		
		Image MiIcono = mi_pantalla.getImage("icono.jpg");
		
		setIconImage(MiIcono);
	}
}
