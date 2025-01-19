import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("cool.png");

        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 50, 50);

        JPanel red = new JPanel();
        red.setBackground(Color.RED);
        red.setBounds(0, 0, 250, 250);
        red.setLayout(new BorderLayout());

        JPanel blue = new JPanel();
        blue.setBackground(Color.blue);
        blue.setBounds(250, 0, 250, 250);
        blue.setLayout(null);

        JPanel green = new JPanel();
        green.setBackground(Color.green);
        green.setBounds(0, 250, 500, 250);
        green.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(label);
        frame.add(red);
        frame.add(blue);
        frame.add(green);
        // frame.pack();
    }
}
