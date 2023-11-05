import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {
    
    public static void main (String args[]){

        //  JFrame = a GUI window to add components to
         
        JFrame frame = new JFrame(); // creates a frame
        JLabel label = new JLabel(); //  create a label

        frame.setTitle("BABY BABI BOBO BIBI");  //  sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //  exit out of application
        frame.setResizable(false);  //  prevents frame from being resized
       // frame.setSize(420, 420);    //  sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //  make frame visible
      //  frame.setLayout(null);
        ImageIcon image = new ImageIcon("test.png");    //  create image icon
        frame.setIconImage(image.getImage());   //  change icon of frame
        frame.getContentPane().setBackground(new Color(123, 150, 255)); //change color of the background
        frame.add(label);
        
        Border border = BorderFactory.createLineBorder(Color.green,3);
        //  JLabel = a GUI display area for a string of text, an image, or both
  
        label.setText("Big Babies");    // set text of label
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP); //   set text TOP, CENTER, BOTTOM of imageicon
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setForeground(new Color(50, 25, 150));    //  set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20));  // set font of text
        label.setIconTextGap(5);    //  set gap of text to imageicon
        label.setBackground(Color.white);   //  set background color within label
        label.setOpaque(true);  //  display background color
        label.setVerticalAlignment(JLabel.CENTER);  // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);    // set horizontal position of icon + text within label
        label.setBorder(border);
      //  label.setBounds(0, 0, 250, 250);
      frame.pack();
    }
}
