package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;

    private Worm worm;

    private Apple apple;
    private Random random;
    private int appleX;
    private int appleY;

    private boolean continues;
    private Updatable updatable;

    public WormGame(int width, int height) {
        super(1000, null);
        this.width = width;
        this.height = height;

        worm = new Worm(width / 2, height / 2, Direction.DOWN);

        random = new Random();
        appleX = random.nextInt(width);
        appleY = random.nextInt(height);
        if (appleX == width / 2 && appleY == height / 2) {
            apple = new Apple(appleX + 1, appleY + 1);
        } else {
            apple = new Apple(appleX, appleY);
        }

        continues = true;

        addActionListener(this);
        setInitialDelay(1500);

    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setApple() {
        appleX = random.nextInt(width);
        appleY = random.nextInt(height);
        if (appleX == width / 2 && appleY == height / 2) {
            apple = new Apple(appleX + 1, appleY + 1);
        } else {
            apple = new Apple(appleX, appleY);
        }
    }

    public boolean pieceHitBorder() {
        for (Piece p : worm.getPieces()) {
            if (p.getX() >= getWidth() + 1 || p.getY() >= getHeight() + 1) {
                return true;
            }

            if (p.getX() == -1 || p.getY() == -1) {
                return true;
            }
        }

        return false;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();

        if (worm.runsInto(apple)) {
            setApple(null);
            setApple();
            worm.grow();
        } else if (worm.runsIntoItself()) {
            continues = false;
        }

        if (pieceHitBorder()){
            continues = false;
        }

        updatable.update();
        setDelay(2000 / this.worm.getLength());

    }

}
