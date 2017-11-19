import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetActionListener implements ActionListener {

    private JTextField userInputField;
    private JTextField totalField;
    private JButton resetButton;

    public ResetActionListener(JTextField userInputField, JTextField totalField, JButton resetButton) {
        this.userInputField = userInputField;
        this.totalField = totalField;
        this.resetButton = resetButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        totalField.setText("0");
        userInputField.setText("");
        userInputField.requestFocus();

        resetButton.setEnabled(false);
    }
}
