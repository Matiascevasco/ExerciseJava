import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MarcoSliders {

	public static void main(String[] args) {

		Frame_Sliders mimarco = new Frame_Sliders();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame_Sliders extends JFrame {

	public Frame_Sliders() {

		setBounds(550, 300, 550, 400);

		setVisible(true);

		LaminaSlider milamina = new LaminaSlider();

		add(milamina);
	}
}

class LaminaSlider extends JPanel {

	public LaminaSlider() {

		JSlider control = new JSlider();

		control.setMajorTickSpacing(50);

		control.setMinorTickSpacing(25);

		control.setPaintTicks(true);

		control.setFont(new Font("Serif", Font.ITALIC, 12));

		control.setPaintLabels(true);
		
		//control.setSnapToTicks(true);

		add(control);
	}

}
