import java.awt.*;
import javax.swing.*;

public class SwingImage extends JFrame{
	

    	JButton b1;
	ImageIcon img;
	SwingImage(){
		setLayout(null);
	img = new ImageIcon("cccc.jpg");
	b1 = new JButton("Click me",img);
	b1.setBounds(30,100,350,100);
	add(b1);

	setVisible(true);
	setSize(400,400);
	}

	public static void main(String[] args){
	new SwingImage();
	}

}