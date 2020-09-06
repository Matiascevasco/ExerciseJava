package graficos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {

		MarcoRaton mimarco = new MarcoRaton();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame {

	public MarcoRaton() {

		setVisible(true);

		setBounds(700, 300, 600, 450);

		EventosDeRaton eventoraton = new EventosDeRaton();

		addMouseMotionListener(eventoraton);
	}
}

class EventosDeRaton implements MouseMotionListener {

	public void mouseDragged(MouseEvent arg0) {

		System.out.println("Estas arrastrando ");

	}

	public void mouseMoved(MouseEvent arg0) {

		System.out.println("Estas moviendo");

	}

	/*
	 * class EventosDeRaton extends MouseAdapter {
	 * 
	 * public void mouseClicked(MouseEvent e) {
	 * 
	 * System.out.println("Cordenada X: " + e.getX() + " Cordenada Y: " + e.getY());
	 * 
	 * System.out.println(e.getClickCount());
	 * 
	 * public void mousePressed(MouseEvent e) {
	 * 
	 * if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
	 * 
	 * System.out.println("Has pulsado el boton izquierdo");
	 * 
	 * } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
	 * 
	 * System.out.println("Has pulsado el boton derecho"); }
	 * 
	 * }
	 */

	/*
	 * class EventosDeRaton implements MouseListener{
	 * 
	 * public void mouseClicked(MouseEvent e) {
	 * 
	 * System.out.println("Has hecho click "); }
	 * 
	 * public void mousePressed(MouseEvent e) {
	 * 
	 * System.out.println("Acabas de presionar"); }
	 * 
	 * public void mouseReleased(MouseEvent e) {
	 * 
	 * System.out.println("Acabas de levantar"); }
	 * 
	 * public void mouseEntered(MouseEvent e) {
	 * 
	 * System.out.println("Acabas de entrar "); }
	 * 
	 * public void mouseExited(MouseEvent e) {
	 * 
	 * System.out.println("Acabas de salir "); }
	 */

}
