import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class jFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(1, 2, 3));
    }
}