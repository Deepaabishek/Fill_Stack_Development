import java.util.Scanner;

import javax.swing.JOptionPane;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        input.close();
    }
}
