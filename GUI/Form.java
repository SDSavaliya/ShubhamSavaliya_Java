package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Form extends WindowAdapter implements ItemListener,ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2,tf3;
	//JRadioButton rb1,rb2;
	JPasswordField P1,P2;
	JComboBox a,b,c,d;
	JButton btn;
	String courses[] = {"ME/M TECT","BE-CE","BE-CIVIL","BSC-PHY","BSC-PHY"};
	String branch[] = {"COMPUTER ENGINEERING","MECHANICAL ENGINEERING","B.S.C","B.COM","IT","CIVIL ENGINEERING"};
	String semester[] = {"1","2","3","4","5","6","7","8"};
	String college[] = {"Marwadi University","Darshan University","Atmiya University","VVP Engineering College","Nirma University"};
	String gender ="";
	
	public Form()
	{
		frame = new JFrame();
		frame.addWindowListener(this);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		l1 = new JLabel("Registration Form");
		l1.setBounds(155, 21, 150, 16);
		
		l2 = new JLabel("Firstname");
		l2.setBounds(16, 85, 90, 16);
		
		l3 = new JLabel("Lastname");
		l3.setBounds(16, 125, 90, 16);
		
		l4 = new JLabel("Email");
		l4.setBounds(16, 165, 90, 16);
		
		l5 = new JLabel("Password");
		l5.setBounds(16, 205, 90, 16);
		
		l6 = new JLabel("Re-Password");
		l6.setBounds(16, 245, 90, 16);
		
		tf1 = new JTextField();
		tf1.setBounds(129, 85, 130, 26);
		
		tf2 = new JTextField();
		tf2.setBounds(129, 125, 130, 26);
		
		tf3 = new JTextField();
		tf3.setBounds(129, 165, 130, 26);
		
		P1 = new JPasswordField();
		P1.setBounds(129, 205, 130, 26);
		
		P2 = new JPasswordField();
		P2.setBounds(129, 245, 130, 26);
		
		l7 = new JLabel("Courses");
		l7.setBounds(16, 285, 90, 16);
		
		a = new JComboBox<>(courses);
		a.setBounds(129, 285, 150, 26);
		
		l8 = new JLabel("Branches");
		l8.setBounds(16, 325, 90, 16);
		
		b = new JComboBox<>(branch);
		b.setBounds(129, 325, 150, 26);
		
		l9 = new JLabel("Semester");
		l9.setBounds(16, 365, 90, 16);
		
		c = new JComboBox<>(semester);
		c.setBounds(129, 365, 150, 26);
		
		l10 = new JLabel("College");
		l10.setBounds(16, 405, 90, 16);
		
		d = new JComboBox<>(college);
		d.setBounds(129, 405, 150, 26);
		
//		tf4 = new JTextField();
//		tf4.setBounds(129, 200, 130, 26);
		
//		rb1 = new JRadioButton("Male");
//		rb1.setBounds(51, 248, 99, 23);
		
//		rb2 = new JRadioButton("Female");
//		rb2.setBounds(178, 248, 99, 23);
		
//		l5 = new  JLabel("Password");
//		l5.setBounds(16, 298, 99, 16);
				
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1);
//		bg.add(rb2);
		
		
		
		
		
		
	
		btn = new JButton("Sign up");
		btn.setBounds(178, 479, 157, 29);
		
		
		btn.addActionListener(this);
		a.addItemListener(this);
		b.addItemListener(this);
		c.addItemListener(this);
		d.addItemListener(this);
		
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		//frame.add(l5);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
//		frame.add(tf4);
//		frame.add(rb1);
//		frame.add(rb2);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(P1);
		frame.add(P2);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);
		frame.add(btn);
		
		
		
//		
//		frame.addWindowListener(this);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//	
//		frame.setSize(500,500);
//		frame.setLayout(null);
//		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new Form();
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		
		int a= JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			
		}
	}
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
//		if(e.getSource()==rb1)
//		{
//			gender = "Male";
//		}
//		if(e.getSource()==rb2)
//		{
//			gender = "Female";
//		}
		if(e.getSource()==a)
		{
			System.out.println("\nYour cource is : "+a.getItemAt(a.getSelectedIndex()));
		}
		if(e.getSource()==b)
		{
			System.out.println("\nYour branch is : "+b.getItemAt(b.getSelectedIndex()));
		}
		if(e.getSource()==c)
		{
			System.out.println("\nYour semester is : "+c.getItemAt(c.getSelectedIndex()));
		}
		if(e.getSource()==d)
		{
			System.out.println("\nYour college is : "+d.getItemAt(d.getSelectedIndex()));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String fname = tf1.getText().toString();
		String lname = tf2.getText().toString();
		String email = tf3.getText().toString();
		String pass  = P1.getText().toString();
		String course =  a.getSelectedItem().toString();
		String branch =  b.getSelectedItem().toString();
		String sem	  =  c.getSelectedItem().toString();
		String coll	  =  d.getSelectedItem().toString();
		
		
		System.out.println(fname+" "+lname+" "+email+" "+pass+" "+course+" "+branch+" "+sem+" "+coll);
		
		try 
		{
			
			
			
			FileOutputStream fout = new FileOutputStream("E:\\JAVA\\Practice\\file.txt");
			String fname1 = "\n Your Firstname is : ";
			fout.write(fname1.getBytes());
			fout.write(fname.getBytes());
			
			String lname1 = "\n Your Lastname is : ";
			fout.write(lname1.getBytes());
			fout.write(lname.getBytes());
			
			String email1 = "\n Your Email is : "; 
			fout.write(email1.getBytes());
			fout.write(email.getBytes());
			
			String pass1 = "\n Your password is : ";
			fout.write(pass1.getBytes());
			fout.write(pass.getBytes());
			
			String course1 = "\n Your course is : ";
			fout.write(course1.getBytes());
			fout.write(course.getBytes());
			
			String branch1 = "\n Your branch is : ";
			fout.write(branch1.getBytes());
			fout.write(branch.getBytes());
			
			String sem1 = "\n Your semester is : ";
			fout.write(sem1.getBytes());
			fout.write(sem.getBytes());
			
			String coll1 = "\n Your college is : ";
			fout.write(coll1.getBytes());
			fout.write(coll.getBytes());
			
		}
		catch (Exception e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("sucess");
	}


}
