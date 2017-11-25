
package Interfaz;

import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
        public static void main(String[] args) {
        
        // Dar apariencia de windows
        try {
        javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Crear ventana
        JFrame frame = new JFrame("Hotel Continental");
        frame.setBackground(Color.decode("#58D3F7"));
        frame.add(new Inicio());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        //findcode.controladores.Utilidades.asignarFondoAnimado(frame, new File("imagenes/fondo"));
        //findcode.controladores.Utilidades.asignarFondoFijo(frame, new File("imagenes/fondo.jpg"));
        frame.setVisible(true);
        
    
}
}
