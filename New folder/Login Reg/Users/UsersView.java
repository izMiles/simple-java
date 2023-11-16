package booksystem.user;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class UsersView {
    
    public void usersGui(){
        JFrame frame;
        frame = new JFrame("Book System");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel3 = new JPanel();
        panel3.setSize(400,400);
        frame.add(panel3);

        JLabel welcomeUser = new JLabel();
        welcomeUser.setText("Welcome Name!");
        welcomeUser.setFont(new Font("Tahoma",Font.BOLD, 18));
        welcomeUser.setBounds(130, 10, 150, 75);
        panel3.add(welcomeUser);

        JButton logoutBtn = new JButton("LOGOUT");
        logoutBtn.setBounds(250, 300, 100, 30);
        panel3.add(logoutBtn);
    }
}
