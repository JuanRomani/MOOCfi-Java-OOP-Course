import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumActionListener implements ActionListener {

    private int userInput;
    private int total;
    private JTextField userInputField;
    private JTextField totalField;
    private JButton resetButton;

    public SumActionListener(JTextField userInputField, JTextField totalField, JButton resetButton) {
        this.userInputField = userInputField;
        this.totalField = totalField;
        this.resetButton = resetButton;
    }

    private int sumNumbers(){
        try {
            userInput = Integer.parseInt(userInputField.getText());
            total = Integer.parseInt(totalField.getText());
        } catch (NumberFormatException ex) {
            userInputField.setText("");
            totalField.setText(totalField.getText());
        }

        return total + userInput;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        totalField.setText("" + sumNumbers());
        userInputField.setText("");
        userInputField.requestFocus();

        if(totalField.getText().equals("0")) {
            resetButton.setEnabled(false);
        } else {
            resetButton.setEnabled(true);
        }
    }
}
