import java.awt.*;
import java.awt.event.*;

public class Windtest extends Frame implements WindowListener {
    public Windtest() {
        
        addWindowListener(this);

        setTitle("Window methods");
        setSize(400, 400);
        setVisible(true);
    }

    public void windowClosing(WindowEvent we) {
        System.out.println("Window is closing");
        System.exit(0);
    }

    public void windowOpened(WindowEvent we) {
        System.out.println("Window is opened");
    }

    public void windowClosed(WindowEvent we) {
        System.out.println("Window is closed");
    }

    public void windowIconified(WindowEvent we) {
        System.out.println("Window is minimized");
    }

    public void windowDeiconified(WindowEvent we) {
        System.out.println("Window is restored");
    }

    public void windowActivated(WindowEvent we) {
        System.out.println("Window is activated");
    }

    public void windowDeactivated(WindowEvent we) {
        System.out.println("Window is deactivated");
    }

    public static void main(String[] args) {
        
        new Windtest();
    }
}
