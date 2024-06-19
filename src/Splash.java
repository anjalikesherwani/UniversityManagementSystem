import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame{

	Splash() {
		// TODO Auto-generated constructor stub
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);
		
		setLocation(500,100);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Splash s = new Splash();

	}

}
