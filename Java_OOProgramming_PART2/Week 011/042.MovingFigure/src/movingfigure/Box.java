package movingfigure;

import java.awt.*;

public class Box extends Figure {

    private int width;
    private int height;

    public Box(int x, int y, int width, int heigth) {
        super(x, y);
        this.width = width;
        this.height = heigth;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), this.width, this.height);
    }
}
