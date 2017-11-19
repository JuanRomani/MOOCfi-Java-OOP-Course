package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.fillRect(100, 50, 50, 50); //ojo1
        graphics.fillRect(250, 50, 50, 50); //ojo2
        graphics.fillRect(50, 200, 50, 50); //boca1
        graphics.fillRect(100, 250, 200, 50); //boca2
        graphics.fillRect(300, 200, 50, 50); //boca3
    }
}
