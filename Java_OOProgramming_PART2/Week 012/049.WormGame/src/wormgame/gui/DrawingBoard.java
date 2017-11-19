package wormgame.gui;

//inherits the class JPanel, and its constructor receives an instance
// of the class WormGame and the int variable pieceLength as parameters

import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        super.setBackground(Color.WHITE);
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        for (Piece p : wormGame.getWorm().getPieces()) {
            g.fill3DRect(p.getX() * pieceLength, p.getY() * pieceLength, pieceLength, pieceLength, true);
        }

        g.setColor(Color.RED);
        Piece apple = wormGame.getApple();
        g.fillOval(apple.getX() * pieceLength, apple.getY() * pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
}
