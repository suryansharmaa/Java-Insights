
// import java.awt.Color;
// import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
// import javax.swing.JPanel;
import javax.swing.JFrame;

public class flowLayout {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // JPanel panel = new JPanel();
        // panel.setPreferredSize(new Dimension(250, 100));
        // panel.setBackground(Color.LIGHT_GRAY);
        // panel.setLayout(new FlowLayout());

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        // frame.add(panel);
        frame.setVisible(true);
    }
}
