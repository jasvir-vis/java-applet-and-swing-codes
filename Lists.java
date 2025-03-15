//<applet code="Lists.class" height="400" width="400">
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Lists extends Applet implements ItemListener{
	String msg="";
	List l;
	public void init(){
		l = new List(5,true);
		l.add("MCA");	
		l.add("BCA");
		l.add("PGCA");
		l.add("PHD");
		add(l);
	
		l.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e){
		String[] str = l.getSelectedItems();
		msg = "";

		for(int i=0;i<str.length;i++){
			msg = msg + str[i];	
		}
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(" "+msg,200,100);
	}
}