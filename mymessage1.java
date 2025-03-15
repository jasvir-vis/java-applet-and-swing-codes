//Input Dialog

import javax.swing.*;
import java.awt.*;
public class mymessage1 extends JFrame
{
  mymessage1()
  {
    String str;
    str = JOptionPane.showInputDialog(null,"enter the name of your city");
    
     System.out.println(str);
}
    public static void main(String args[])
{
  new mymessage1();
}
}