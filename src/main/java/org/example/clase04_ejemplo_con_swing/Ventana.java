package org.example.clase04_ejemplo_con_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public Ventana(String title) throws HeadlessException {
        super(title);
        setSize(500, 500); // tamaño de la ventana
        setLocationRelativeTo(null);// para centrar la venta
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // que acción al clic en botón cerrar

        // USANDO LA FORMA TRADICIONAL
        JButton b1 = new JButton("Click!"); // creamos un botón
        b1.addActionListener(new ButtomListener());
        /*
         * Aquí viene lo interesante usaremos las interface ActionListener,
         * la cual tiene un solo método llamado actionPerformed(ActionEvent e)
         */
        // USANDO UNA CLASE ANÓNIMA
        JButton b2 = new JButton("Clase Anónima!"); // creamos un botón
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola desde una Clase Anónima!");
            }
        });
        // USANDO UNA LAMBDA
        JButton b3 = new JButton("Lambda!"); // creamos un botón
        b3.addActionListener((e) -> System.out.println("Hola desde un Lambda!"));

        add(b1); // lo agregamos al layout
        add(b2); // lo agregamos al layout
        add(b3); // lo agregamos al layout

        setVisible(true); // para que la interface sea visible
    }
}
