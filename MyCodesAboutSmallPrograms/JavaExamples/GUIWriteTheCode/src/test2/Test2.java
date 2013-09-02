package test2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame implements ActionListener {

    JLabel enterLabel, resultLabel, infoLabel;
    JTextField enterField, resultField, infoFields;
    Test2 number;

    public static void main(String args[]) {
        Test2 app = new Test2();
        app.setSize(300, 45);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

    }

    public Test2() {
        super("Test Application");
        Test2 number = new Test2();
        setLayout(new FlowLayout());

        infoLabel = new JLabel();
        add(infoLabel);

        infoFields=new JTextField();
        add(infoFields);
        infoFields.setEditable(false);
        infoFields.setText(number.toString());
        
        enterField=new JTextField("Enter the number");
        add(enterField);
        
        resultField=new JTextField("Result is:");
        add(resultField);
        resultField.setEditable(false);
        
        resultLabel=new JLabel("Result");
        add(resultField)
       
    }
}
