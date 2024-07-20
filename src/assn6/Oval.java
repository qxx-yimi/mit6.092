package assn6;

import java.awt.Graphics;

public class Oval implements Sprite {
    private int width;
    private int height;

    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */
    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics surface, int x, int y) {
        surface.drawOval(x, y, width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
