//<applet code="Mousee.class" height="400" width="400">
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Mousee extends Applet implements MouseListener,MouseMotionListener{
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me){
	System.out.println("Mouse entered"+getX()+" "+getY());
	}
	public void mouseClicked(MouseEvent me){
	System.out.println("Mouse clicked"+getX()+" "+getY());
	}
	public void mousePressed(MouseEvent me){
	System.out.println("Mouse pressed"+getX()+" "+getY());
	}
	public void mouseReleased(MouseEvent me){
	System.out.println("Mouse released"+getX()+" "+getY());
	}
	public void mouseExited(MouseEvent me){
	System.out.println("Mouse exist"+getX()+" "+getY());
	}
	public void mouseDragged(MouseEvent me){
	System.out.println("Mouse dragged"+getX()+" "+getY());
	}
	public void mouseMoved(MouseEvent me){
	System.out.println("Mouse moving"+getX()+" "+getY());
	}

}