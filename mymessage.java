//Confirm Dialog 

import javax.swing.*;
import java.awt.*;
public class mymessage extends JFrame
{
  mymessage()
  {
    int response;
    response = JOptionPane.showConfirmDialog(null,"Are you sure want to exit","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(response==JOptionPane.YES_OPTION)
    {
     System.exit(0);
    }
}
public static void main(String args[])
{
  new mymessage();
}
}
