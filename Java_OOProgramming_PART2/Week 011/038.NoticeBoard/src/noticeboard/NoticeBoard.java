package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Something");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField fieldOrigin = new JTextField();
        JLabel labelDestination = new JLabel();
        JButton copyButton = new JButton("Copy!");

        ActionListener copier = new ActionEventListener(fieldOrigin, labelDestination);
        copyButton.addActionListener(copier);

        container.add(fieldOrigin);
        container.add(copyButton);
        container.add(labelDestination);
    }
}
