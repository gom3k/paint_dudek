package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
    private int x = -1;
    private int y = -1;
    
    public Panel(){
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    public void mouseClicked(MouseEvent e){
        x = e.getX();
        y = e.getY();
        repaint();
//        JOptionPane.showMessageDialog(null,e.getPoint().toString());
    }
    
    public void paint(Graphics g){
        g.clearRect(0, 0, getSize().width, getSize().height);
        g.setColor(Color.RED);
        if(x!=-1 && y!=-1){
            g.drawOval(x-25, y-25, 50, 50);
        }
    }
}