import javax.swing.JOptionPane;

public class SimpleGUI {
    public static void main(String[] args) {

        String naam = JOptionPane.showInputDialog("Name ?");
        JOptionPane.showMessageDialog(null, "Yo "+naam);

        int umar = Integer.parseInt(JOptionPane.showInputDialog("Age ?"));
        JOptionPane.showMessageDialog(null, "You are "+umar);

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Height ?"));
        JOptionPane.showMessageDialog(null, "You are "+height+"foot tall");
    }
}
