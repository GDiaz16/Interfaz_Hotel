package Interfaz;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CustomPanel extends JPanel{    
    private URL url = getClass().getResource("/Imagenes/fondo_inicio.jpg");
    Image image = new ImageIcon(url).getImage();
 
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
         //g.set
        super.paint(g);
    }
}
