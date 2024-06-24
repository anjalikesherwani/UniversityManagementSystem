import javax.swing.*;
import java.awt.*;


public class Project extends JFrame {
	
	

	public Project() {
		setSize(1540, 850);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
        //new information
        JMenuBar mb = new JMenuBar();
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(facultyInfo);
        		
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(studentInfo);	
        
        
        //Detail
        JMenu details = new JMenu("View Details");
        newInformation.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        details.add(facultydetails);
        		
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        facultydetails.setBackground(Color.white);
        details.add(studentdetails);
        setJMenuBar(mb);
		
		setVisible(true);
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		new Project();

	}

}
