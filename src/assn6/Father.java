package assn6;

import java.awt.*;

public class Father implements Mover{
    public int x;
    public int y;
    public int xDirection;
    public int yDirection;
    public Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Father(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void draw(Graphics graphics) {
        return;
    }
}
