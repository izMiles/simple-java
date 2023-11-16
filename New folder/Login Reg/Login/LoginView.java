package booksystem.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginView {
    
    

    public void loginGui(){
        
        JFrame frame;
        frame = new JFrame("Book System");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    
        JPanel panel1 = new JPanel();
        panel1.setSize(400,400);
        frame.add(panel1);

        JLabel title = new JLabel("LOGIN");
        title.setBounds(150, 10, 75, 75);
        title.setFont(new Font("Tahoma",Font.BOLD, 18));
        panel1.add(title);

        JLabel userName = new JLabel("USERNAME");
        userName.setBounds(30, 100, 150, 20);
        userName.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel1.add(userName);

        JTextField userInput = new JTextField();
        userInput.setBounds(30, 125, 300, 25);
        panel1.add(userInput);

        JLabel passWord = new JLabel("PASSWORD");
        passWord.setBounds(30, 159, 150, 20);
        passWord.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel1.add(passWord);

        JTextField passInput = new JTextField(null, null, 0);
        passInput.setBounds(30, 185, 300, 25);
        panel1.add(passInput);

        JButton logBtn = new JButton("LOGIN", null);
        logBtn.setBounds(135, 230, 100, 30);
        panel1.add(logBtn);

        JButton regBtn = new JButton("REGISTER", null);
        regBtn.setBounds(135, 270, 100, 30);
        panel1.add(regBtn);


         

        }

}
