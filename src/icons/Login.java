package icons;
import java.awt.*;
import javax.swing.*;



public class Login extends JFrame{
	
	Login() {
		getContentPane().setBackground(Color.WHITE);
		
		JLabel lblusernmae = new JLabel("username");
		lblusernmae.setBounds(40,20,100,20);
		add(lblusernmae);
		
		setSize(600,300);
		setLocation(500,250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

}
