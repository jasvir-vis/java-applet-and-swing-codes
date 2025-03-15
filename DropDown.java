//<applet code="DropDown.class" height="400" width="400">
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DropDown extends Applet implements ItemListener {
	Choice c;
	String msg="";
      	public void init(){
		c = new Choice();
		c.add("India");
		c.add("Canada");
		c.add("USA");
	
		add(c);
		c.addItemListener(this);
      	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==c){
			msg= c.getSelectedItem();
		}
		repaint();
	}
    	public void paint(Graphics g){
	g.drawString(msg,200,100);
	}
	
}