package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(250, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JLabel count = new JLabel("" + calc.giveValue());
        container.add(count, BorderLayout.NORTH);

        JButton button = new JButton("Click!");
        container.add(button, BorderLayout.SOUTH);

        ClickListener listener = new ClickListener(calc, count);
        button.addActionListener(listener);
    }

    public JFrame getFrame() {
        return frame;
    }
}
