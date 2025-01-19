import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel labels;

    MyFrame() {
        ImageIcon icon1 = new ImageIcon("check.png");
        ImageIcon icon2 = new ImageIcon("cool.png");

        labels = new JLabel();
        labels.setIcon(icon2);
        labels.setBounds(150, 250, 150, 150);
        labels.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setForeground(Color.LIGHT_GRAY);
        button.setBackground(Color.DARK_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(labels);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Lol");
            button.setEnabled(false);
            button.setVisible(true);
        }
    }
}

public class Buttons {
    public static void main(String[] args) {

        new MyFrame();
    }
}
