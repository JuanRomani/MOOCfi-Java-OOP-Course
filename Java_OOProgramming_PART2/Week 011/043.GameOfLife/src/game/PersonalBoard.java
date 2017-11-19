package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        // boolean[][] board = getBoard(); - Obtiene board del framework
        // board[x][y] = true; - Activa celula en las coordenadas [fila][col]
        if (x < getWidth() && x >= 0) {
            if (y <= getHeight() && y >= 0){
                getBoard()[x][y] = true;
            }
        }

    }

    @Override
    public void turnToDead(int x, int y) {
        if (x < getWidth() && x >= 0) {
            if (y <= getHeight() && y >= 0){
                getBoard()[x][y] = false;
            }
        }

    }

    @Override
    public boolean isAlive(int x, int y) {
        try {
            if (x < getWidth() && x >= 0 || y < getHeight() && y >= 0) {
                if (getBoard()[x][y]) {
                    return true;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            return false;
        }

        return false;

    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random rand = new Random();

        for (int i = 0; i < getWidth(); i++) {
            for (int e = 0; e < getHeight(); e++) {
                if (rand.nextDouble() < probabilityForEachCell){
                    turnToLiving(i,e);
                }
            }
        }

    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        /*if (x >= 0) {
            for (int i = x; i < getWidth(); i++) {
                for (int e = y; e < getHeight(); e++) {
                    if (isAlive(i, e)) {
                        System.out.println(i + " " + e + " is alive");
                        flag++;
                    }
                }
            }
        } Esto sirve para contar el total partiendo desde 0,0*/

        int flag = 0;

        if (x == 0 && y == 0 ) {
            for (int i = x; i <= x + 1; i++) {
                for (int e = y; e <= y + 1; e++) {
                    if (isAlive(i, e)) {
                        flag++;
                    }
                }
            }

        } else if (x > 0 && y > 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int e = y - 1; e <= y + 1; e++) {
                    if (isAlive(i, e)) {
                        flag++;
                    }
                }
            }

        } else if (x == 0 || y > 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int e = y - 1; e <= y + 1; e++) {
                    if (isAlive(i, e)) {
                        flag++;
                    }
                }
            }

        } else if (x > 0 && y == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int e = y - 1; e <= y + 1; e++) {
                    if (isAlive(i, e)) {
                        flag++;
                    }
                }
            }

        }

        if (isAlive(x, y)){
            flag--;
        } // Descontamos la celula origen en caso de que esté viva

        return flag;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (x >= 0) {
            for (int i = x; i < getWidth(); i++) {
                for (int e = y; e < getHeight(); e++) {
                    if (getNumberOfLivingNeighbours(x, y) < 2) {
                        turnToDead(x, y);
                    } else if (getNumberOfLivingNeighbours(x, y) < 2 || getNumberOfLivingNeighbours(x, y) > 3) {
                        turnToDead(x, y);
                    } else if (getNumberOfLivingNeighbours(x, y) == 3) {
                        turnToLiving(x, y);
                    }
                }
            }
        }
    }
}
