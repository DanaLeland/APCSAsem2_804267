import javax.swing.*;
public class MySwingApplication implements Runnable {
    JFrame jFrame;
    CanvasComponent canvasComponent;
    public void run() {
        jFrame = new JFrame("Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasComponent = new CanvasComponent(100, 100);
        jFrame.setVisible(true);
        jFrame.add(canvasComponent);
        canvasComponent.repaint();
        
    }
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
