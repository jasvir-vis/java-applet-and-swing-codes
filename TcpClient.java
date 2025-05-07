// <applet code="TcpClient.class" Height=400 width=400></applet>

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.net.*;

public class TcpClient extends Applet implements ActionListener
{
	Label l;
	TextField t1;
	Button b1;
	String date =new String("");
	DataInputStream ds;
	Socket s;
	
public void init()
{
	l= new Label("Enter Port no.");
	t1=new TextField(20);
	b1=new Button("Submit");
	add(l);
	add(t1);
	add(b1);
	b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		try
		{
			s = new Socket("localhost", Integer.parseInt(t1.getText()));
			ds=new DataInputStream(s.getInputStream());
			date = ds.readLine();
			
		}
		catch(IOException ie){
			System.out.println(ie);
		}
		repaint();
	}
}
public void paint(Graphics g){
	g.drawString(date,400,400);
}
}