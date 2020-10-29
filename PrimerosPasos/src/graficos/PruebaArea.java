package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {

		MarcoPruebaArea mimarco = new MarcoPruebaArea();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame {

	public MarcoPruebaArea() {

		setTitle("Probando areas de texto");

		setBounds(500, 300, 500, 350);

		setLayout(new BorderLayout());
		
		laminabotones = new JPanel();
		
		botoninsertar = new JButton("Insertar");
		
		botoninsertar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				AreaTexto.append("Lucha siempre por lo difícil que lo fácil lo va a tener cualquiera.....");
			}			
		});
		
		laminabotones.add(botoninsertar);
		
		botonsaltolinea = new JButton("Salto linea");
		
		botonsaltolinea.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar =! AreaTexto.getLineWrap();
				
				AreaTexto.setLineWrap(saltar);
				
				/*if(saltar) {
					
					botonsaltolinea.setText("Quitar salto");
				}else {
					botonsaltolinea.setText("Salto linea");
				}*/
				
				botonsaltolinea.setText(saltar ? "Quitar salto" : "Salto linea");
			}
		});
		
		laminabotones.add(botonsaltolinea);
		
		add(laminabotones, BorderLayout.SOUTH);
		
		AreaTexto = new JTextArea(8, 20);
		
		laminaconbarras = new JScrollPane(AreaTexto);
		
		add(laminaconbarras, BorderLayout.CENTER);
		
	}

	private JPanel laminabotones;

	private JButton botoninsertar, botonsaltolinea;

	private JTextArea AreaTexto;
	
	private JScrollPane laminaconbarras;
}
