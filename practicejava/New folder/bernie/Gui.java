import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;



public class Gui {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
       
        JLabel Header2;
        Header2=new JLabel("Student");
        Header2.setBounds(25, 25, 300, 30);
        Header2.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(Header2);

        
        
        JLabel fName;
        fName = new JLabel("First Name");
        fName.setBounds(25, 85, 200, 30);
        fName.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(fName);
        JTextField firstName;
        firstName = new JTextField(" ");
        firstName.setBounds(25, 110, 290, 30);
        frame.add(firstName);
        
        JLabel mName;
        mName = new JLabel("Middle Name");
        mName.setBounds(25,140,200,30);
        mName.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(mName);
        JTextField middleName;
        middleName = new JTextField(" ");
        middleName.setBounds(25,165,290,30);
        frame.add(middleName);

        JLabel lName;
        lName = new JLabel("Last Name");
        lName.setBounds(25,195,200,30);
        lName.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(lName);
        JTextField lastName;
        lastName = new JTextField(" ");
        lastName.setBounds(25,220,290,30);
        frame.add(lastName);

        JButton clearButton = new JButton("Clear ");
        clearButton.setBounds(150, 350, 80, 30);
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lastName.setText(null);
                firstName.setText(null);
                middleName.setText(null);

            }
        });
        frame.add(clearButton);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(235, 350, 75, 30);
        Submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Submit Successfully");  

            }
        });
        frame.add(Submit);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
