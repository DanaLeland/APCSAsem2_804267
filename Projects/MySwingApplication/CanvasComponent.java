import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener {
    public int rectWidth = 100;
    public int rectHeight = 200;
    public int rectX;
    public int rectY;
    Timer animationTimer;
    public CanvasComponent(int width, int height){
        setSize(width, height);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
        
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
    }

    //Mouse Methods
    public void mouseDragged(MouseEvent e){
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        int rectX = mouseToX - e.getX();
        int rectY = mouseToY - e.getY();
    }
    public void mousePressed(MouseEvent e){
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        boolean shapeSelected;
        //if the y (mouseFromX) is less than the bottom of rect 
        //and lower than height of rect (rectHeight)
        //if the x is less than the right of the rect and higher than the left
        if((mouseFromX >= rectX) && mouseFromX <= (rectX + rectWidth)){
            if((mouseFromY >= rectY) && mouseFromY <=(rectY + rectHeight)){
                shapeSelected = true;
            }
        }
    }
    
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    //ActionListener methods
    public int animationDeltaX = 1;
    public int animationDeltaY = 0;
    public int gutterX = 10;
    public int gutterY = 10;
    public void actionPerformed(ActionEvent e){
        Dimension componentSizeDimension = getSize();
        if((rectX + rectWidth) + gutterX > rectWidth){
            animationDeltaY-=10;
        }
        else if(rectY + gutterY > rectHeight){
            animationDeltaX-=10;
        }
        else if(rectX > gutterX){
            animationDeltaY+=10;
        }
        else if((rectY + rectHeight) > gutterY){
            animationDeltaX+=10;
        }
        else{
            rectX += animationDeltaX;
            rectY += animationDeltaY;
        }
        repaint();
    }
    
    //KeyListener methods
    int motionSpeed = 1;
    public void keyTyped(KeyEvent e){
        e.getKeyChar();
        
    }
    public void actionPerformed(){}
}
