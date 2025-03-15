//<applet code="Images.class" Height=400 width=400 ></applet>
import java.applet.Applet;
import java.awt.*;

public class Images extends Applet { 
   Image img;
   MediaTracker tr;
   public void paint(Graphics g) {
      tr = new MediaTracker(this);
      img = getImage(getCodeBase(), "cccc.jpg");
      tr.addImage(img,0);
      g.drawImage(img, 0, 0,200,200,this);
   } 
}