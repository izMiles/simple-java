package finals.project;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Button extends Front{
	
	public void Action(){
		guiForm();

		enterUser.addActionListener(new ActionListener() {
			
			@Override

			public void actionPerformed(ActionEvent e){

				String user = userInput.getText();
				UserFile createFile = new UserFile();
				createFile.create(user);

				
				
			}
			});
	
		}

	}
	


	


