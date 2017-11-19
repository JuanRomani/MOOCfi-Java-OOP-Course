package wormgame.domain;

import wormgame.Direction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Worm {

    private List<Piece> pieces;
    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private boolean hasToGrow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;

        this.pieces = new ArrayList<>();
        this.pieces.add(new Piece(originalX, originalY));

        this.hasToGrow = false;
        this.originalDirection = originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public Piece getHead() {
        return getPieces().get(getLength() - 1);
    }

    public int getLength() {
        return getPieces().size();
    }

    public void grow() {
        hasToGrow = true;
    }

    public void move() {
        Piece p = getPieces().get(getLength() - 1);

        if (getDirection().equals(Direction.RIGHT)) {
            pieces.add(new Piece(p.getX() + 1, p.getY()));
        }
        else if (getDirection().equals(Direction.LEFT)) {
            pieces.add(new Piece(p.getX() - 1, p.getY()));
        }
        else if (getDirection().equals(Direction.DOWN)) {
            pieces.add(new Piece(p.getX(), p.getY() + 1));
        }
        else if (getDirection().equals(Direction.UP)) {
            pieces.add(new Piece(p.getX(), p.getY() - 1));
        }

        if (getLength() > 3) {
            if (hasToGrow == false) {
                getPieces().remove(0);
            } else {
                // tiene que crecer, no remueve. Vuelve a poner el "switch" hasToGrow en false
                hasToGrow = false;
            }
        } else {
            hasToGrow = false;
        }
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : getPieces()) {
            if (p.runsInto(piece)) {
                return true;
            }
        }

        return false;
    }

    public boolean runsIntoItself() {
        List<Piece> piecesMinusHead = getPieces().subList(0, getLength() - 1);
        Piece head = getHead();

        for (Piece p : piecesMinusHead) {
            if(head.runsInto(p)) {
                return true;
            }
        }

        return false;
    }

}
