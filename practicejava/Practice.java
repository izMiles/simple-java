import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Practice {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
       
        
        JLabel Header1;
        Header1=new JLabel("Welcome to ");
        Header1.setBounds(25,25,300,30);
        frame.add(Header1);

        JLabel Header2;
        Header2=new JLabel("CITE Online Submission Portal.");
        Header2.setBounds(97, 25, 300, 30);
        Header2.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(Header2);

        JLabel Header3;
        Header3=new JLabel("Please specify the required fields.");
        Header3.setBounds(25,45,200,30);
        frame.add(Header3);
        
        JLabel fName;
        fName = new JLabel("First Name");
        fName.setBounds(25, 85, 200, 30);
        fName.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(fName);
        JTextField firstName;
        firstName = new JTextField("First Name");
        firstName.setBounds(25, 110, 290, 30);
        frame.add(firstName);
        
        JLabel mName;
        mName = new JLabel("Middle Name");
        mName.setBounds(25,140,200,30);
        mName.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(mName);
        JTextField middleName;
        middleName = new JTextField("Middle Name");
        middleName.setBounds(25,165,290,30);
        frame.add(middleName);

        JLabel lName;
        lName = new JLabel("Last Name");
        lName.setBounds(25,195,200,30);
        lName.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(lName);
        JTextField lastName;
        lastName = new JTextField("Last Name");
        lastName.setBounds(25,220,290,30);
        frame.add(lastName);

        JLabel sName;
        sName = new JLabel("Suffix (leave empty, if not applicable)");
        sName.setBounds(25,250,290,30);
        sName.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(sName);
        JTextField suffix;
        suffix =  new JTextField("Jr, II, III, Sr");
        suffix.setBounds(25, 275, 290, 30);
        frame.add(suffix);

        JLabel mNum;
        mNum = new JLabel("Mobile Number");
        mNum.setBounds(25, 305,290,30);
        mNum.setFont(new Font("Tahoma", Font.BOLD,14));
        frame.add(mNum);
        JTextField mobileNum;
        mobileNum = new JTextField("09XXXXXXXXX");
        mobileNum.setBounds(25,330,290,30);
        frame.add(mobileNum);

        JLabel eMail;
        eMail = new JLabel("Email Address");
        eMail.setBounds(25, 360, 290, 30);
        eMail.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.add(eMail);
        JTextField emailAdd;
        emailAdd = new JTextField("XXXXXX@gmail.com");
        emailAdd.setBounds(25,385,290,30);
        frame.add(emailAdd);

        JLabel Note1;
        Note1 = new JLabel("Your personal information will help us in placing your files, and");
        Note1.setBounds(25, 415, 290, 30);
        Note1.setFont(new Font("Tahoma", Font.ITALIC, 10));
        frame.add(Note1);
        
        JLabel Note11;
        Note11 = new JLabel("in reaching you, if some problems were found.");
        Note11.setBounds(25, 430, 290, 30);
        Note11.setFont(new Font("Tahoma", Font.ITALIC, 10));
        frame.add(Note11);

        JButton b1 = new JButton("Cancel ");
        b1.setBounds(25, 500, 80, 30);
        frame.add(b1);

        JButton b2 = new JButton("Next");
        b2.setBounds(235, 500, 75, 30);
        frame.add(b2);

         




        frame.setSize(400, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
