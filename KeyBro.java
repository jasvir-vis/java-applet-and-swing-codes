//<applet code="KeyBro.class" Height=400 width=400></applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyBro extends Applet implements KeyListener { 

   public void init() { 
	addKeyListener(this);       
   }

   public void keyPressed(KeyEvent e) {
   } 
   public void keyTyped(KeyEvent e) {
       System.out.println("Typed key is: "+ e.getKeyChar());
   } 
   public void keyReleased(KeyEvent e) {
   } 


}