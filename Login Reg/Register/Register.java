package booksystem.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;


class Register extends RegisterView {
    
    public void Action(){
        RegGui();

        regBtn.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e){
				String inputName = nameInput.getText();
				String inputUser = usernInput.getText();
				String inputPass = passwordInput.getText();
				
				
            
				
			}
		});


    
                

            }
        
}
