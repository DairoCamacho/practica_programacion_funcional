package org.example.clase04_ejemplo_con_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola desde un ButtonListener!");
    }
}
