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
        
        JMenu newInformation = new JMenu("Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("Faculty Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(facultyInfo);
        		
        JMenuItem studentInfo = new JMenuItem("Student Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(studentInfo);	
        
        
        //Detail
        JMenu details = new JMenu("Details");
        details.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("Faculty Details");
        facultydetails.setBackground(Color.white);
        details.add(facultydetails);
        		
        JMenuItem studentdetails = new JMenuItem("Student Details");
        facultydetails.setBackground(Color.white);
        details.add(studentdetails);
        
        
        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        leave.add(facultyleave);
        		
        JMenuItem studentleave = new JMenuItem("Student Leave");
        facultyleave.setBackground(Color.white);
        leave.add(studentleave);
        
        
      //Leave Detail
        JMenu leavedetails = new JMenu("Leave Details");
        leavedetails.setForeground(Color.BLUE);
        mb.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.white);
        leavedetails.add(facultyleavedetails);
        		
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        facultyleavedetails.setBackground(Color.white);
        leavedetails.add(studentleavedetails);
        
        
      //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetaits = new JMenuItem("Examination results");
        examinationdetaits.setBackground(Color.white);
        exam.add(examinationdetaits);
        		
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.white);
        exam.add(entermarks);
        
        
      //UpdateInfo
        JMenu updateInfo = new JMenu("Update Information");
        updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        examinationdetaits.setBackground(Color.white);
        updateInfo.add(updatefacultyinfo);
        		
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        entermarks.setBackground(Color.white);
        updateInfo.add(updatestudentinfo);
        
        
        setJMenuBar(mb);
		
		setVisible(true);
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		new Project();

	}

}
