import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingLoader extends JFrame{

    Container c;
    JPanel p;
    JProgressBar s;
    JLabel l;
    
    SwingLoader(){

	c = getContentPane();
	p = new JPanel();
	c.setLayout(new FlowLayout());
	s = new JProgressBar();
	l = new JLabel();
	p.add(l);
	p.add(s);
	c.add(p);
	
	s.setValue(0);
	s.setMaximum(100);
	s.setMinimum(5);
	s.setStringPainted(true);

	setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void fill(){
	try{
		int i=0;
		while(i<=100){
			s.setValue(i+10);
			Thread.sleep(60);
			i++;
		}
	}
	catch(Exception e){
		System.out.println(e);
	}

    }

    public static void main(String[] args){
	SwingLoader s=new SwingLoader();
	s.fill();
    }

}