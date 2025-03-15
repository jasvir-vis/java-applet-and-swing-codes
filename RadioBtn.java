//<applet code="RadioBtn.class" height="400" width="400">
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RadioBtn extends Applet implements ItemListener {
    String msg = "Select gender";
    Checkbox male, female;
    CheckboxGroup cg;

    public void init() {
	cg = new CheckboxGroup();
        male = new Checkbox("Male",cg,false);
        female = new Checkbox("Female",cg,false);

        add(male);
        add(female);

        male.addItemListener(this);
        female.addItemListener(this);    
	}

    public void itemStateChanged(ItemEvent ae) {
        if (male.getState()) {
            msg = "Male selected";
        }
        else if(female.getState()){
            msg = "Female selected";
	}
        repaint(); 
    }

    public void paint(Graphics g) {
	g.drawString(msg,100,200);
    }
}