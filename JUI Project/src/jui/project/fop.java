/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jui.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author Ahmed Hassan
 */
public class fop extends JFrame {

     JButton b1,b2;
     JTextField t1;
     JLabel l1;
     JTable r1;
     ButtonGroup g1=new ButtonGroup();
     ButtonGroup g2=new ButtonGroup();
    public fop()
    {

    }
    public void showm()
    {
        this.setTitle("show");
        this.setVisible(true);
        this.setSize(500, 700);
        this.setLocation(200, 70);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        b1=new JButton("search");
        b2=new JButton("show");
        t1=new JTextField();
        l1=new JLabel("Meter ID");
        l1.setBounds(150, 50, 100, 25); t1.setBounds(220, 50, 150, 25);
        this.add(l1);this.add(t1);
        r1.setBounds(100, 200, 100, 100);
        this.add(r1);

 
    }
}
