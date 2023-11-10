package cite.gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Button extends Front{
	
	public void Action(){
		Gui();
		
		
		submit.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e){
				String fName = firstName.getText();
				String lName = lastName.getText();
				String mName = middleName.getText();
				
				JOptionPane.showMessageDialog(frame, "Submit Succesfully! ");
				createFile file = new createFile();
				
				
				file.create(fName,lName,mName);
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e){
				
				firstName.setText(" ");
				middleName.setText(" ");
				lastName.setText(" ");

			}
		});	
	}
}