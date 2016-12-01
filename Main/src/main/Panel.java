package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

;

public class Panel extends JPanel implements MouseListener{
    public Panel(){
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public void mouseClicked(MouseEvent e){
        JOptionPane.showMessageDialog(null,e.getPoint().toString());
    }
}