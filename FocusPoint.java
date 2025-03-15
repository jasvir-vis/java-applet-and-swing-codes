//<applet code="FocusPoint.class" Height=400 width=400></applet>

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FocusPoint extends Applet implements FocusListener{
	TextField t1;
	TextArea ta;
	public void init(){
		setLayout(new BorderLayout());
		t1 = new TextField(20);
		ta = new TextArea(20,20);
		t1.addFocusListener(this);
		
		add(t1,BorderLayout.WEST);
		add(ta,BorderLayout.CENTER);
	}
	public void focusGained(FocusEvent fe){
		System.out.println("Focus gained on textfield");
	}
	public void focusLost(FocusEvent fe){
		System.out.println("TextField lost focus");
	}
}