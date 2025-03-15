//<applet code="MyTextarea.class" Height=400 width=400></applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyTextarea extends Applet implements TextListener { 
   TextArea txt;

   public void init() { 
       txt = new TextArea(10,10); 
       txt.addTextListener(this);
       
       add(txt);
   }

   public void textValueChanged(TextEvent e) {
       System.out.println("text Value is " + txt.getText());
   } 
}