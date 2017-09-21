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
        this.initEvents();
        this.jpanel.setBackground(Color.BLUE);
        this.setVisible(true);
    }

    private void initEvents() {
        MeinInnererActionListener mial = new MeinInnererActionListener();
        this.jbtnBlue.addActionListener(mial);
        this.jbtnGreen.addActionListener(mial);
        this.jbtnYellow.addActionListener(mial);
    }

    private void initComponents() {
        this.jpanel = new JPanel();
        this.jbtnBlue = new JButton("Blau");
        this.jbtnGreen= new JButton("Grün");
        this.jbtnYellow= new JButton("Gelb");

        this.jpanel.add(jbtnBlue);
        this.jpanel.add(jbtnGreen);
        this.jpanel.add(jbtnYellow);

        this.add(jpanel);
    }


    public class MeinInnererActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand().toLowerCase())
            {
                case "blau":
                    jpanel.setBackground(Color.BLACK);
                    break;
                case "grün":
                    jpanel.setBackground(Color.GREEN);
                    break;
                case "gelb":
                    jpanel.setBackground(Color.YELLOW);
                    break;
            }
        }
    }


}
