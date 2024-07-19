package assn5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(200, 50, Color.BLUE));
        boxes.add(new BouncingBox(200, 50, Color.GREEN));
        boxes.add(new BouncingBox(200, 50, Color.ORANGE));
        boxes.get(0).setMovementVector(2, -3);
        boxes.get(1).setMovementVector(-2, 3);
        boxes.get(2).setMovementVector(-2, -3);
        boxes.get(3).setMovementVector(2, 3);
    }

    /**
     * Draw the contents of the window on surface. Called 20 times per second.
     */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(10, 10, 10, 10);
        surface.drawOval(20, 20, 20, 20);
        surface.drawString("Hello, World!", 40, 20);
        for (int i = 0; i < 4; i++) {
            boxes.get(i).draw(surface);
        }
    }
} 