import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalClient extends JFrame implements ActionListener {
    Method imp;
    JLabel enum1, enum2, sresult;
    JTextField num1, num2, result;
    JButton add, sub, mul, div;

    public CalClient() {
        try {
            imp = (Method) Naming.lookup("rmi://127.0.0.1/CalService");
        } catch (Exception e) {
	    System.exit(0);
            System.out.println("Error: " + e);
        }

        setTitle("Simple RMI GUI Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        enum1 = new JLabel("Enter First Number: ");
        enum2 = new JLabel("Enter Second Number: ");
        sresult = new JLabel("Result: ");

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        
        add(enum1);
        add(num1);
        add(enum2);
        add(num2);
        add(sresult);
        add(result);
        add(add);
        add(sub);
        add(mul);
        add(div);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double rs = 0;

            if (e.getSource() == add) {
                rs = imp.add(a, b);
            } else if (e.getSource() == sub) {
                rs = imp.sub(a, b);
            } else if (e.getSource() == mul) {
                rs = imp.mul(a, b);
            } else if (e.getSource() == div) {
                if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
                rs = imp.div(a, b);
            }

            result.setText(String.valueOf(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Calculation Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalClient();
    }
}
