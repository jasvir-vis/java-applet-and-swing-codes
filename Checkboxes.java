//<applet code="Checkboxes.class" height="400" width="400">
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Checkboxes extends Applet implements ItemListener {
    String msg = ""; 
    Checkbox c1, c2, c3;

    public void init() {
        c1 = new Checkbox("MCA");
        c2 = new Checkbox("BCA");
        c3 = new Checkbox("PGDCA");

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ae) {
        if (ae.getSource() == c1) {
            msg = c1.getLabel();
        }
        if (ae.getSource() == c2) {
            msg = c2.getLabel();
        }
        if (ae.getSource() == c3) {
            msg = c3.getLabel();
        }

        repaint(); 
    }

    public void paint(Graphics g) {
	if(c1.getState()){
        g.drawString(msg, 100, 100);
	}
	if(c2.getState()){
        g.drawString(msg, 100, 100);
	}
	if(c3.getState()){
        g.drawString(msg, 100, 100);
	}
    }
}