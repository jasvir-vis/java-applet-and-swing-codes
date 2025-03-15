import javax.swing.*;

public class SwingTabbed {

    JFrame f;
    JTabbedPane tp;
    JPanel first, second, third;
    JLabel l1, l2, l3;

    SwingTabbed() {
        f = new JFrame();
        tp = new JTabbedPane();
        first = new JPanel();
        second = new JPanel();
        third = new JPanel();

        l1 = new JLabel("First Panel");
        l2 = new JLabel("Second Panel");
        l3 = new JLabel("Third Panel");

        first.add(l1);
        second.add(l2);
        third.add(l3);

        tp.add("First", first);
        tp.add("Second", second);
        tp.add("Third", third);

        f.add(tp);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingTabbed();
    }
}
