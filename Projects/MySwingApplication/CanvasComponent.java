import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener {
    public int rectWidth = 100;
    public int rectHeight = 200;
    public int rectX;
    public int rectY;
    public CanvasComponent(int width, int height){
        setSize(width, height);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
        
    }
    public void mouseDragged(MouseEvent e){
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        int rectX = mouseToX - e.getX();
        int rectY = mouseToY - e.getY();
    }
    
    //Mouse methods
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        boolean shapeSelected;
        //if the y (mouseFromX) is less than the bottom of rect 
        //and lower than height of rect (rectHeight)
        //if the x is less than the right of the rect and higher than the left
        if((mouseFromX >= rectX) && mouseFromX <= (rectX + rectWidth)){
            shapeSelected = true;
        }
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    
    //ActionListener methods
    public int animationDeltaX = 1;
    public int animationDeltaY = 0;
    public int gutterX = 10;
    public int gutterY = 10;
    public void actionPerformed(){
    }
    
}
