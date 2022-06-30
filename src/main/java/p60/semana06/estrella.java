/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.Color;
import static java.awt.Color.GREEN;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP OME
 */
public class estrella extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int[] X1={300,250,150,230,200,300,400,370,450,350};
        int[] Y1={100,200,200,280,400,340,400,280,200,200};
        
        g.setColor(Color.red);
        g.fillPolygon(X1, Y1, 10);
        g.drawPolygon(X1,Y1,10);
        
    }
    
    public static void main (String[]args){
        
        JFrame ventana = new JFrame("Estrella");
        estrella objeto = new estrella ();
        ventana.add(objeto);
        ventana.setSize(700,700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
