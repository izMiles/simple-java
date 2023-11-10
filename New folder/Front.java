package cite.gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Front{
	
	JFrame frame = new JFrame();
	
	
	JLabel label1,label2,labelName,labelM,labelLast;
	
	
	TextField firstName,middleName,lastName;
	
	
	JButton submit,clear; 	
	
	
	public void Gui(){
		
		frame.setTitle("CITE");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);	
		frame.setSize(400,900);
		frame.setResizable(false);
		
	//-----------------------------------------------------/	
		label1 = new JLabel("Student");
		label1.setBounds(40,0,360,100);
		frame.add(label1);
		
	//-----------------------------------------------------/	
		labelName = new JLabel("First Name");
		labelName.setBounds(40,100,100,30);
		frame.add(labelName);
		
		
		
		firstName = new TextField();
		firstName.setBounds(40,130,300,30);
		frame.add(firstName);
	//-----------------------------------------------------/	
		
		labelM = new JLabel("Middle Name");
		labelM.setBounds(40,160,300,30);
		frame.add(labelM);
		
		
		
		middleName = new TextField();
		middleName.setBounds(40,190,300,30);
		frame.add(middleName);
		
//-----------------------------------------------------/		
		
		labelLast = new JLabel("Last Name");
		labelLast.setBounds(40,220,100,30);
		frame.add(labelLast);
		
		
		lastName = new TextField();
		lastName.setBounds(40,250,300,30);
		frame.add(lastName);
		
		
//-------------------------------------------------------------------------/			

		submit = new JButton("Submit");
		submit.setBounds(240,480,100,30); 
		frame.add(submit);
			
		clear = new JButton("Clear");
		clear.setBounds(130,480,100,30); 
		frame.add(clear);

	//-----------------------------------------------------------------/		
	}
}