/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HUGO-NB
 */
public class Poligonos extends JPanel{
    
    public void paint(Graphics g) {
        super.paint(g);
        
        //A=100,100
        //B=350,100
        //C=250,300
        int [] PuntosX={100,350,250};
        int [] PuntosY={100,100,300};
        
        
        g.drawPolygon(PuntosX, PuntosY, 3);
        g.setColor(Color.red);
        g.fillPolygon(PuntosX, PuntosY, 3);
 
    }
    
    public static void main(String[] args) {

        JFrame ventana = new JFrame("POLIGONOS");
        Poligonos objeto = new Poligonos();

        ventana.add(objeto);
        ventana.setSize(800, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
