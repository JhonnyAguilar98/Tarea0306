/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

/**
 *
 * @author HP OME
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author UPS
 */
public class PanelPrincipal1 extends JPanel implements MouseListener{
    
    private Color color1;
    private Color color2;
    private Color color3;
    private Color color4;
    //private Point punto=new Point(-100,-100);
    private Point punto1=new Point(-10,-10);
    private Point punto2=new Point(-10,-10);
    private int numClicks =0;
    
    public PanelPrincipal1(Color color1, Color color2, Color color3, Color color4) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
        this.addMouseListener(this);
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);     
        g.setColor(this.color1);
        g.drawLine(0, 0, 600, 600);
        g.setColor(this.color2);
        g.fillOval(0, 0, 300, 300);
        g.setColor(this.color3);
        g.fillRect(300, 300, 200, 250);
        g.setColor(Color.BLACK);
        //g.fillOval(this.punto.x-20, this.punto.y-20, 40, 40);
        g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
        g.setColor(this.color4);
        int[] X1={300,250,150,230,200,300,400,370,450,350};
        int[] Y1={100,200,200,280,400,340,400,280,200,200};
        g.fillPolygon(X1, Y1, 10);
        g.drawPolygon(X1,Y1,10);
       
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }
    
    public Color getColor4(){
        return color4;
    }
    public void setColor4(Color color4){
        this.color4 = color4;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
        this.numClicks++;
        e.getButton();
        
        System.out.println(e.getClickCount());
        if(this.numClicks==1){
            punto1 = e.getPoint();
        }
        if(this.numClicks==2){
            punto2=e.getPoint();
            numClicks=0;
            this.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println(e.getX());
        //System.out.println(e.getY());
        //System.out.println(e.getPoint());
        //this.punto=e.getPoint();
        //this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.toString());
    }
    
    
    
}