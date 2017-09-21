package com.sabel.farbenspiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener{

    private JPanel jPanel;

    public MeinActionListener(JPanel jPanel)
    {
        this.jPanel = jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toLowerCase()) {
            case "blau":
                jPanel.setBackground(Color.BLUE);
                break;
            case "grün":
                jPanel.setBackground(Color.GREEN);
                break;
            case "gelb":
                jPanel.setBackground(Color.YELLOW);
                break;
        }
    }
}
