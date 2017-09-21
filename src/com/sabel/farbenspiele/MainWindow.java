package com.sabel.farbenspiele;

import javax.swing.*;
import java.awt.*;


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
        this.initEvents();
        this.jpanel.setBackground(Color.BLUE);
        this.setVisible(true);
    }

    private void initEvents() {
        MeinActionListener mal = new MeinActionListener(this.jpanel);
        this.jbtnBlue.addActionListener(mal);
        this.jbtnGreen.addActionListener(mal);
        this.jbtnYellow.addActionListener(mal);
    }


    private void initComponents() {
        this.jpanel = new JPanel();
        this.jbtnBlue = new JButton("Blau");
        this.jbtnGreen = new JButton("Grün");
        this.jbtnYellow = new JButton("Gelb");
        this.jpanel.add(jbtnBlue);
        this.jpanel.add(jbtnGreen);
        this.jpanel.add(jbtnYellow);
        this.add(jpanel);
    }
}
