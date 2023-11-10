package cite.gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class createFile extends Button{
    
    public void create(String fName, String lName,String mName) {
		
	try{	
        FileWriter myWriter = new FileWriter(fName + "-" + lName + ".txt");
		
		
		myWriter.write("First name: " + fName + "\n");
		myWriter.write("Last name: " + lName + "\n");
		myWriter.write("Middle name: " + mName + "\n");

		myWriter.close();
		
	}catch (IOException e){
		 System.out.println("An error occurred.");
      e.printStackTrace();
		
		
	}
}

}