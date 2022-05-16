package expt1;

import java.awt.event.*;
import javax.swing.*;

public class ReportCards extends JFrame {
	JPanel jp = new JPanel() ;
	JLabel lname = new JLabel() ;
	JButton bsubmit = new JButton("Submit") ;
	JTextField tname = new JTextField(20) ;
	JLabel lMath = new JLabel() ;
	JTextField tMath = new JTextField(20) ;
	JLabel lScience = new JLabel() ;
	JTextField tScience = new JTextField(20) ;
	JLabel lEnglish = new JLabel() ;
	JTextField tEnglish = new JTextField(20) ;
	
	public ReportCards() {
		lname.setText("Enter Name: ");
		jp.add(lname);
		jp.add(tname) ;
		lMath.setText("Enter Maths Marks : ");
		jp.add(lMath) ;
		jp.add(tMath) ;
		lEnglish.setText("Enter English Marks: ");
		jp.add(lEnglish) ;
		jp.add(tEnglish) ;
		lScience.setText("Enter Science Marks: ");
		jp.add(lScience) ;
		jp.add(tScience) ;
		jp.add(bsubmit);
		add(jp) ;
		
		bsubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent argO) {
				String val = tname.getText() ;
				JLabel l1 = new JLabel("Welcome "+val) ;
				int sub1 = Integer.parseInt(tMath.getText()) ;
				int sub2 = Integer.parseInt(tScience.getText()) ;
				int sub3 = Integer.parseInt(tEnglish.getText()) ;
				int sum = sub1+sub2+sub3 ;
				float average = sum/3 ;
				JLabel l2 = new JLabel("Average= "+average) ;
				JPanel jip = new JPanel() ;
				jip.add(l1) ;
				jip.add(l2) ;
				JFrame inf = new JFrame() ;
				inf.setVisible(true);
				inf.add(jip) ;
				inf.setSize(300,80);
			}
		}) ;
	}

	public static void main(String[] args) {
		ReportCards rp = new ReportCards() ;
		rp.setSize(300,300);
		rp.setVisible(true);
	}

}
