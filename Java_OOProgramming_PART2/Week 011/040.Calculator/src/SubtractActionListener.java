import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubtractActionListener implements ActionListener {

    private int userInput;
    private int total;
    private JTextField userInputField;
    private JTextField totalField;
    private JButton resetButton;

    public SubtractActionListener(JTextField userInputField, JTextField totalField, JButton resetButton) {
        this.userInputField = userInputField;
        this.totalField = totalField;
        this.resetButton = resetButton;
    }

    private int subtractNumbers(){
        try {
            userInput = Integer.parseInt(userInputField.getText());
            total = Integer.parseInt(totalField.getText());
        } catch (NumberFormatException ex) {
            userInputField.setText("");
        }

        return total - userInput;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        totalField.setText("" + subtractNumbers());
        userInputField.setText("");
        userInputField.requestFocus();

        if(totalField.getText().equals("0")) {
            resetButton.setEnabled(false);
        } else {
            resetButton.setEnabled(true);
        }
    }
}
