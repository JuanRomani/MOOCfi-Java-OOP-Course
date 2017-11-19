package greeter.ui;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(new UserInterface());
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}
