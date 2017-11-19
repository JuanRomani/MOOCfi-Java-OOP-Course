package wormgame.gui;

import java.awt.*;
import javax.swing.*;

import wormgame.game.WormGame;

public class UserInterface implements Runnable {

    private JFrame frame;
    private DrawingBoard drawingBoard;
    private WormGame game;
    private int sideLength;

    public UserInterface(WormGame game, int sideLength) {
        this.game = game;
        this.drawingBoard = new DrawingBoard(game, sideLength);
        this.sideLength = sideLength;

    }

    @Override
    public void run() {
        frame = new JFrame("Worm Game");
        int width = (game.getWidth() + 1) * sideLength + 10;
        int height = (game.getHeight() + 2) * sideLength + 10;

        frame.setPreferredSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void createComponents(Container container) {
        // Create drawing board first which then is added into container-object.
        // After this, create keyboard listener which is added into frame-object

        container.add(drawingBoard);
        frame.addKeyListener(new KeyboardListener(game.getWorm()));
    }

    public Updatable getUpdatable() {
        return drawingBoard;
    }


    public JFrame getFrame() {
        return frame;
    }
}
