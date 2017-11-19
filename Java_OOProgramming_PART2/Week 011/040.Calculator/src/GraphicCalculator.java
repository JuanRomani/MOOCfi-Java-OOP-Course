
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        frame.setLayout(layout);

        JTextField totalField = new JTextField("0");
        totalField.setEnabled(false);
        JTextField inputField = new JTextField();

        JButton plusButton = new JButton("+");
        JButton lessButton = new JButton("-");
        JButton resetButton = new JButton("Z");


        container.add(totalField);
        container.add(inputField);
        container.add(createPanel(plusButton, lessButton, resetButton), BorderLayout.SOUTH);

        resetButton.setEnabled(false);

        SumActionListener sum = new SumActionListener(inputField, totalField, resetButton);
        plusButton.addActionListener(sum);
        
        SubtractActionListener subtract = new SubtractActionListener(inputField, totalField, resetButton);
        lessButton.addActionListener(subtract);

        ResetActionListener reset = new ResetActionListener(inputField, totalField, resetButton);
        resetButton.addActionListener(reset);

    }

    private JPanel createPanel(JButton buttonPlus, JButton buttonLess, JButton buttonEqual) {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        panel.add(buttonPlus);
        panel.add(buttonLess);
        panel.add(buttonEqual);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}