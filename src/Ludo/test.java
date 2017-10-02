package Ludo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class test extends JPanel {
    public static void main(String[] args) {
     JPanel panel = new JPanel();
JButton jButton1 = new JButton("Dice");

 JFrame frame = new JFrame(); 
 //BlueGoti k = new BlueGoti(frame);

 Project pro = new Project(frame);

 //YellowGoti yel = new YellowGoti();
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.getContentPane().add(new test());
//new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png")));
//frame.add(jButton1);\
//frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\DELL\\Downloads\\ff8ce7ca004f619b451bd93be3370f6e.jpg")));
frame.getContentPane().add(new test());
frame.add(pro);


frame.setSize(1000, 1000);
frame.setBounds(0, 0, 1366, 768);
frame.setVisible(true);
}
    
    
}