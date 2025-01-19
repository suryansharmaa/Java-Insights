import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class myFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField field;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(500,500);
        this.setLayout(new FlowLayout());
        button = new JButton("Submit");
        button.addActionListener(this);
        field = new JTextField();
        field.setPreferredSize(new Dimension(250, 40));
        field.setFont(new Font("Consolas", Font.PLAIN, 25));
        field.setForeground(Color.GREEN);
        field.setBackground(Color.BLACK);
        field.setCaretColor(Color.WHITE);
        // field.setText("username");

        this.add(button);
        this.add(field);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + field.getText());
            button.setEnabled(false);
            field.setEditable(false);
        }
    }
}

public class Textfield {
    public static void main(String[] args) {
        new myFrame();
    }
}
