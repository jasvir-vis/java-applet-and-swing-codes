//<applet code="MyApplet.class" Height=400 width=400>
//</applet>

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;
    String currentOperation = "";

    public void init() {
        setLayout(new BorderLayout());

        Label l1 = new Label("Enter first num: ");
        num1 = new TextField(10);

        Label l2 = new Label("Enter second num: ");
        num2 = new TextField(10);

        Label l3 = new Label("Result: ");
        result = new TextField(10);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");

        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 2));
        p.add(l1);
        p.add(num1);
        p.add(l2);
        p.add(num2);
        p.add(l3);
        p.add(result);
        p.add(add);
        p.add(subtract);
        p.add(multiply);
        p.add(divide);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        add(p, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            currentOperation = "Addition";
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int sum = a + b;
            result.setText(String.valueOf(sum));
        } else if (e.getSource() == subtract) {
            currentOperation = "Subtraction";
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int sub = a - b;
            result.setText(String.valueOf(sub));
        } else if (e.getSource() == multiply) {
            currentOperation = "Multiplication";
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int mul = a * b;
            result.setText(String.valueOf(mul));
        } else if (e.getSource() == divide) {
            currentOperation = "Division";
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int div = a / b;
            result.setText(String.valueOf(div));
        }
        repaint(); // Update the applet after each operation
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK); // Set the color for text
        g.drawString("Operation: " + currentOperation, 50, 350); // Display the current operation
    }
}
