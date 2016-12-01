package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener, MouseMotionListener{
    private int x = -1;
    private int y = -1;
    private int a;
    private int b;
    
    public Panel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    // MouseListener
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
//        repaint();
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
//        x = e.getX();
//        y = e.getY();
//        repaint();
//        JOptionPane.showMessageDialog(null,e.getPoint().toString());
    }
    // MouseMotionListener
    public void mouseMoved(MouseEvent e){
//        x = e.getX();
//        y = e.getY();
//        repaint();
    }
    public void mouseDragged(MouseEvent e) {
        a = e.getX();
        b = e.getY();
        repaint();
    }
    
    public void paint(Graphics g){
        g.clearRect(0, 0, getSize().width, getSize().height);
        g.setColor(Color.RED);
        if(x!=-1 && y!=-1){
            g.drawLine(x, y, a, b);
        }
    }


}