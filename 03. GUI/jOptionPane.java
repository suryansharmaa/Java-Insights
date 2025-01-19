import javax.swing.*;

public class jOptionPane {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Plain Text", "Message",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Useless Information", "Information",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Huh?", "Question",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Run!", "Warning",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Something wrong", "Error404",
        // JOptionPane.ERROR_MESSAGE);

        // int ans = JOptionPane.showConfirmDialog(null, "Do you even code?", "Poll",
        // JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("Your name ?");

        String[] responses = { "No, You're Awesome!", "Thanks", "*Blush*" };
        ImageIcon icon = new ImageIcon("cool.png");
        JOptionPane.showOptionDialog(null, "You're awesome", "Lol", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}
