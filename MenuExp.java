import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuExp extends JFrame implements ActionListener{
    
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,view;
    JMenuItem undo,cut,copy,paste,delete,find,findnext,findprev,go,sel,timedate,font;
    JMenuItem newtab,newwin,fopen,fsave,fsaveas,fsaveall,fps,fprint,fclosetab,fclosewin,fexit;
    JMenuItem vzoom,vstatusbar,vwordwrap;
    JTextArea ta;
    MenuExp(){
	f = new JFrame("Menubar Example");
	f.setLayout(null);
	f.setBounds(5,30,400,400);
	
	ta = new JTextArea(367,368);
	ta.setBounds(5,5,367,368);
	
	mb = new JMenuBar();
	file = new JMenu("File");
	edit = new JMenu("Edit");
	view = new JMenu("View");

        newtab = new JMenuItem("New Tab");
        newwin = new JMenuItem("New Window");
        fopen = new JMenuItem("Open");
        fsave = new JMenuItem("Save");
        fsaveas = new JMenuItem("Save As");
        fsaveall = new JMenuItem("Save All");
        fps = new JMenuItem("Page Setup");
        fprint = new JMenuItem("Print");
        fclosetab = new JMenuItem("Close Tab");
        fclosewin = new JMenuItem("Close Window");
        fexit = new JMenuItem("Exit");

	undo = new JMenuItem("Undo");
	cut = new JMenuItem("Cut");
	copy = new JMenuItem("Copy");
	paste = new JMenuItem("Paste");
	delete = new JMenuItem("Delete");
	find = new JMenuItem("Find");
	findnext = new JMenuItem("Find next");
	findprev = new JMenuItem("Find prev");
	go = new JMenuItem("Go to");
	sel = new JMenuItem("Select all");
	timedate = new JMenuItem("Time/Date");
	font = new JMenuItem("Font");

	vzoom = new JMenuItem("Zoom");
	vstatusbar = new JMenuItem("Status bar");
	vwordwrap = new JMenuItem("Word wrap");

	edit.add(undo);
	edit.add(cut);
	edit.add(copy);
	edit.add(paste);
	edit.add(delete);
	edit.add(find);
	edit.add(findnext);
	edit.add(findprev);
	edit.add(go);
	edit.add(sel);
	edit.add(timedate);
	edit.add(font);

	file.add(newtab);
	file.add(newwin);
	file.add(fopen);
	file.add(fsave);
	file.add(fsaveas);
	file.add(fsaveall);
	file.add(fps);
	file.add(fprint);
	file.add(fclosetab);
	file.add(fclosewin);
	file.add(fexit);
	
	view.add(vzoom);
	view.add(vstatusbar);
	view.add(vwordwrap);


	mb.add(file);
	mb.add(edit);
	mb.add(view);

	f.add(mb);
	f.add(ta);
	
 	f.setJMenuBar(mb);
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	sel.addActionListener(this);
	
    }

    public void actionPerformed(ActionEvent e){

	if(e.getSource()==cut){
		ta.cut();
	}
	else if(e.getSource()==copy){
		ta.copy();
	}
	else if(e.getSource()==paste){
		ta.paste();
	}
	else if(e.getSource()==sel){
		ta.selectAll();
	}
	else{
		System.out.println("exit");
	}
    }

    public static void main(String[] args){
	MenuExp me = new MenuExp();
    }
}