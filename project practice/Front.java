package finals.project;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Front{

    JFrame frame;

    JLabel header1, header2;

    JButton enterUser;

    JTextField userInput;

    JPanel borderPanel1, borderPanel2;

    

    public void guiForm(){

        

        frame = new JFrame();
        frame.setTitle("Piggy");
        
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(250, 190, 110));

        borderPanel1 = new JPanel();
        borderPanel1.setBounds(0, 0, 100, 600);
        borderPanel1.setBackground(new Color(195, 145, 80));
        frame.add(borderPanel1);

        borderPanel2 = new JPanel();
        borderPanel2.setBounds(500, 0, 100, 600);
        borderPanel2.setBackground(new Color(195, 145, 80));
        frame.add(borderPanel2);

        header2 = new JLabel("Enter Username");
        header2.setBounds(250, 200, 150, 50);
        header2.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(header2);

        userInput = new JTextField("");
        userInput.setBounds(205, 250, 200, 30);
        frame.add(userInput);

        enterUser = new JButton("ENTER");
        enterUser.setBounds(250, 300, 100, 30);
        enterUser.setBackground(new Color(195, 145, 80));
        enterUser.setFont(new Font("Tahoma", Font.BOLD, 14));
        enterUser.setFocusable(false);
        
        frame.add(enterUser);

        header1 = new JLabel("VIRTUAL PIGGY BANK");
        header1.setBounds(170, 40, 300, 150);
        header1.setFont(new Font("Tahoma", Font.BOLD, 24));
        frame.add(header1);
         

        frame.setVisible(true);

        

        




    


    }


    }
