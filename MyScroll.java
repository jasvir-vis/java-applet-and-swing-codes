//<applet code="MyScroll.class" Height=400 width=400></applet>
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyScroll extends Applet implements AdjustmentListener { 
   Scrollbar sb1;

   public void init() { 
       sb1 = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100); 
       sb1.addAdjustmentListener(this);
       setLayout(new BorderLayout());
       add(sb1, BorderLayout.WEST);
   }

   public void adjustmentValueChanged(AdjustmentEvent e) {
       System.out.println("Scrollbar Value is " + sb1.getValue());
   } 
}