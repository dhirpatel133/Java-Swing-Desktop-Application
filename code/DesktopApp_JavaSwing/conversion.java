import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.util.*;
import java.text.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.border.*;

public class conversion implements ActionListener {

    int n = 0;
    int n2 = 1;

    JTextField input1;
    JTextField input2;
    JLabel title;
    JLabel label1;
    JLabel label2;

    JTextField input3;
    JTextField input4;
    JLabel title2;
    JLabel label3;
    JLabel label4;

    public void convert() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        frame.add(panel);
        frame.setTitle("Conversion");
        frame.setVisible(true);
        frame.setSize(300, 300);

        title = new JLabel ("");
        JButton meters = new JButton ("Meters to Feet");
        meters.addActionListener(this);
        meters.setActionCommand("meter");
        JButton feet = new JButton ("Feet to Meters");
        feet.addActionListener(this);
        feet.setActionCommand("feet");
        label1 = new JLabel ("Meter");
        input1= new JTextField();
        input1.setColumns(10);
        label2 = new JLabel ("Feet");
        input2 = new JTextField();
        input2.setColumns(10);
        input2.setEditable(false);

        Panel flow1 = new Panel ();
		flow1.add(title);

        Panel flow2 = new Panel ();
		flow2.add(meters);
        flow2.add(feet);

        Panel flow3 = new Panel ();
		flow3.add(label1);
        flow3.add(input1);

        Panel flow4 = new Panel ();
		flow4.add(label2);
        flow4.add(input2);		

        panel.add(flow1);
        panel.add(flow2);
        panel.add(flow3);
        panel.add(flow4);
    }

    public void setVisible(boolean b) {
        if (b) {
            convert();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("meter")) {
            label1.setText("Meters");
            label2.setText("Feet");
            if (n2 == 0) {
                String temp = input2.getText();
                input2.setText(input1.getText());
                input1.setText(temp);
                n2 = 1;
            }
            else {
            int n1 = Integer.parseInt(input1.getText());
            input2.setText(String.valueOf(n1 * 3.28));
            n2 = 0;
            }
        }
        if (e.getActionCommand().equals("feet")) {
            label1.setText("Feet");
            label2.setText("Meters");
            if (n == 0) {
                String temp = input1.getText();
                input1.setText(input2.getText());
                input2.setText(temp);
                n = 1;
            }
            else {
            int n1 = Integer.parseInt(input1.getText());
            input2.setText(String.valueOf(n1 / 3.28));
            n = 0;
            }
        }
    }
}