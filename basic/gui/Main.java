package basic.gui;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        int isHuman = JOptionPane.showConfirmDialog(null, "Are you human?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (isHuman == JOptionPane.YES_OPTION) {
            System.out.println("User confirmed they are human.");
        } else {
            System.out.println("User did not confirm they are human.");
        }

        Object[] options = { "OK", "CANCEL" };
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
             null, options, options[0]);
    }

}
