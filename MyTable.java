import javax.swing.*;
import java.awt.*;

public class MyTable{

    JFrame f;
    JTable jt;

    MyTable(){

	f = new JFrame("My Table");
	String col[] = {"id","Name","City"};
	String row[][] = {{"101","Rahul","Jalandhar"},{"102","Sanju","Mukerian"}};

	jt = new JTable(row,col);
	JScrollPane js= new JScrollPane(jt);
	f.add(js);
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args){
	new MyTable();
   }    

}