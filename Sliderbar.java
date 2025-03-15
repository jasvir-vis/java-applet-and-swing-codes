import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sliderbar extends JFrame implements ChangeListener {

    Container c;
    JPanel p;
    JSlider s;
    JLabel l;

    Sliderbar() {
        c = getContentPane();
        l = new JLabel();
        c.setLayout(null);
        s = new JSlider(JSlider.HORIZONTAL);
        p = new JPanel();

        p.add(s);
        p.add(l);
        s.setValue(0);
        s.setPaintTicks(true);
        s.setPaintTrack(true);
        s.setMinorTickSpacing(5);
        s.setMajorTickSpacing(10);

        c.add(p);
        p.setBounds(50, 50, 300, 300);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        s.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        int value = s.getValue();
        l.setText(Integer.toString(value));
    }

    public static void main(String[] args) {
        new Sliderbar();
    }
}
