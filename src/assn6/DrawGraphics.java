package assn6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> moveSprites = new ArrayList<>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        moveSprites.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
        moveSprites.add(new Bouncer(170, 100, new Oval(20,20)));
        moveSprites.get(0).setMovementVector(3, 1);
        moveSprites.get(1).setMovementVector(-3, -1);

        moveSprites.add(new StraightMover(100, 170, new Rectangle(15, 20, Color.RED)));
        moveSprites.add(new StraightMover(170, 100, new Oval(20,20)));
        moveSprites.get(2).setMovementVector(-5, 5);
        moveSprites.get(3).setMovementVector(5, -5);
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (int i = 0; i < moveSprites.size(); i++) {
            moveSprites.get(i).draw(surface);
        }
    }
}
