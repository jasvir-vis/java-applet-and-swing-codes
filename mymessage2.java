//Option Dialog

import javax.swing.*;
import java.awt.*;
public class mymessage2 extends JFrame
{
  mymessage2()
  {
    int str;
    String response[]={"Male","Female","Others"};
    str =JOptionPane.showOptionDialog(null,"choose Gender","Gender",0,JOptionPane.PLAIN_MESSAGE,null,response,response[0]);
 if(str==0)
 {
     System.out.println("You select Male");
 }
 else if(str==1)
 {
     System.out.println("You select Female");
 }
 else
 {
     System.out.println("You selected Others");
}
}
    public static void main(String args[])
{
  new mymessage2();
}
}
