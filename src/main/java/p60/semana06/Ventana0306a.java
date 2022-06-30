/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

/**
 *
 * @author HP OME
 */


import java.awt.BorderLayout;
import java.awt.Color;
import p60.semana06.PanelPrincipal1;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ventana0306a extends JFrame implements ActionListener{

    //private PanelPrincipal panelPrincipal;
    private PanelPrincipal1 panelPrincipal;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JButton jButton1;
    private JButton jButton2;
    
    
    public Ventana0306a(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Verde");
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Rosa");
        this.jComboBox2.addItem("Amarillo ");
        this.jComboBox2.addItem("Negro");
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("Rojo");
        this.jComboBox3.addItem("Azul");
        this.jComboBox3.addItem("Verde");
        this.jComboBox4 = new JComboBox();
        this.jComboBox4.addItem("Rojo");
        this.jComboBox4.addItem("Azul");
        this.jComboBox4.addItem("Verde");
        this.jButton1 = new JButton("Colorear");
        this.jButton1.addActionListener(this);
        this.setLayout(new BorderLayout());
        this.add(this.jComboBox1,BorderLayout.NORTH);
        this.add(this.jButton1,BorderLayout.SOUTH);
        this.panelPrincipal = new PanelPrincipal1(Color.PINK,Color.CYAN,Color.GREEN, Color.YELLOW);        
        this.add(this.panelPrincipal,BorderLayout.CENTER);
        this.jButton2 = new JButton("Pintar");
        this.jButton2.addActionListener(this);
        this.setLayout(new BorderLayout());
        this.add(this.jComboBox2,BorderLayout.NORTH);
        this.add(this.jButton2,BorderLayout.SOUTH);
        this.panelPrincipal = new PanelPrincipal1(Color.PINK,Color.CYAN,Color.GREEN, Color.YELLOW);        
        this.add(this.panelPrincipal,BorderLayout.CENTER);
        
        
      
        
        //this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.jComboBox1.getSelectedIndex()==0)
        {
            this.panelPrincipal.setColor1(Color.RED);
            this.panelPrincipal.setColor2(Color.RED);
            this.panelPrincipal.setColor3(Color.RED);
            this.panelPrincipal.setColor4(Color.RED);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==1)
        {
            this.panelPrincipal.setColor1(Color.BLUE);
            this.panelPrincipal.setColor2(Color.BLUE);
            this.panelPrincipal.setColor3(Color.BLUE);
            this.panelPrincipal.setColor4(Color.BLUE);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==2)
        {
            this.panelPrincipal.setColor1(Color.GREEN);
            this.panelPrincipal.setColor2(Color.GREEN);
            this.panelPrincipal.setColor3(Color.GREEN);
            this.panelPrincipal.setColor4(Color.GREEN);
            this.panelPrincipal.repaint();            
        }
        
         if(this.jComboBox2.getSelectedIndex()==0)
        {
            this.panelPrincipal.setColor1(Color.PINK);
            this.panelPrincipal.setColor2(Color.PINK);
            this.panelPrincipal.setColor3(Color.PINK);
            this.panelPrincipal.setColor4(Color.PINK);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==1)
        {
            this.panelPrincipal.setColor1(Color.YELLOW);
            this.panelPrincipal.setColor2(Color.YELLOW);
            this.panelPrincipal.setColor3(Color.YELLOW);
            this.panelPrincipal.setColor4(Color.YELLOW);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==2)
        {
            this.panelPrincipal.setColor1(Color.BLACK);
            this.panelPrincipal.setColor2(Color.BLACK);
            this.panelPrincipal.setColor3(Color.BLACK);
            this.panelPrincipal.setColor4(Color.BLACK);
            this.panelPrincipal.repaint();            
        }
    }
    
    
    
}