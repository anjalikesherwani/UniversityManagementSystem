import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Project extends JFrame implements ActionListener{
	
	

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
        studentleavedetails.setBackground(Color.white);
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
        updatefacultyinfo.setBackground(Color.white);
        updateInfo.add(updatefacultyinfo);
        		
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updateInfo.add(updatestudentinfo);
        
        
        
        //Fee
        JMenu fee= new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        fee.add(feestructure);
        		
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.white);
        fee.add(feeform);
        
        
        //Utility
        JMenu utility= new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);
        		
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);
        
        
        
        //Exit
        JMenu exit= new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);
        
       
        
        setJMenuBar(mb);
		
		setVisible(true);		
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
		
		if (msg.equals("Exit")) {
			setVisible(false);
		}else if (msg.equals("Calculator")) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				
			}
			
		}else if (msg.equals("Notepad")) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		
		
		new Project();

	}

}
