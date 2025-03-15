import javax.swing.*;
import java.awt.event.*;

public class SwingPop implements ActionListener{
    JFrame f;
    JPanel panel;
    JPopupMenu jp;
    JMenuItem cut, copy, paste;

    SwingPop() {
        f = new JFrame("Popup Component");
        panel = new JPanel();
        jp = new JPopupMenu();

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
	
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);

        jp.add(cut);
        jp.add(copy);
        jp.add(paste);

        panel.setComponentPopupMenu(jp);
        panel.setSize(200, 200);
        
        f.add(panel);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jp.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jp.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e){

	if(e.getSource()==cut){
		System.out.println("You click on cut");
	}
	else if(e.getSource()==copy){

		System.out.println("You click on copy");
	}
	else if(e.getSource()==paste){
		System.out.println("You click on paste");
	}
    }

    public static void main(String[] args) {
        new SwingPop();
    }
}
