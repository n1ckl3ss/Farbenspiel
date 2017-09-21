package com.sabel.farbenspiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private JPanel jpanel;
    private JButton jbtnGreen;
    private JButton jbtnYellow;
    private JButton jbtnBlue;

    public MainWindow() throws HeadlessException {
        super("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.initComponents();
        this.jpanel.setBackground(Color.BLUE);
        this.setVisible(true);
    }

    private void initComponents() {
        this.jpanel = new JPanel();
        this.jbtnBlue = new JButton("Blau");

        jbtnBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.BLUE);
                }
            }
        );

        this.jbtnGreen = new JButton("Grün");
        jbtnGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.GREEN);
            }
        });
        this.jbtnYellow = new JButton("Gelb");
        jbtnYellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.YELLOW);
            }
        });
        this.jpanel.add(jbtnBlue);
        this.jpanel.add(jbtnGreen);
        this.jpanel.add(jbtnYellow);
        this.add(jpanel);
    }
}
