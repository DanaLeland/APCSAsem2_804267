import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent {
    public int rectWidth = 100;
    public int rectHeight = 200;
    public CanvasComponent(int width, int height){
        setSize(width, height);
    }
    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
        int xRect = 0;
        int yRect = 0;
        g.fillRect(xRect, yRect, rectWidth, rectHeight);
        
    }
    
    //Mouse methods
    void mouseClicked(MouseEvent e){
    }
    void mousePressed(MouseEvent e){
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        boolean shapeSelected;
        //if the y i less than the bottom of rect and lower than height of rect
        //if the x is less than the right of the rect and higher than the left
        if(mouseFromX < rectWidth && mouseFromY < 200){
            shapeSelected = true;
        }
        
    }
    void mouseReleased(MouseEvent e){
    }
    void mouseEntered(MouseEvent e){
    }
}
