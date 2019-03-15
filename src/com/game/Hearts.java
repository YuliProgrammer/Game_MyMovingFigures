package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Hearts extends MovingFigure {

    private static double DIAMETER = 25;

    private GraphicsContext gc;
    Color myColorFill;

    public Hearts(List<Shape> shapes, GraphicsContext gc, double x, double y, Color myColorFill) {
        super(shapes,gc, x, y);
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.myColorFill = myColorFill;
    }

    @Override
    public void draw() {
        double[] xPoints = {x, x + 40, x + 20};
        double[] yPoints = {y, y, y + 20};

        gc.setFill(myColorFill);
        gc.fillPolygon(xPoints, yPoints, 3);

        gc.setFill(myColorFill);
        gc.fillOval(x - 3, y - 20, DIAMETER, DIAMETER);

        gc.setFill(myColorFill);
        gc.fillOval(x + 17, y - 20, DIAMETER, DIAMETER);
    }
}
