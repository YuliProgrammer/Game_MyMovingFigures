package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class TreeLeafs extends MovingFigure {

    private static double DIAMETER = 25;

    private GraphicsContext gc;

    Color myColorFill;

    public TreeLeafs(List<Shape> shapes, GraphicsContext gc, double x, double y, Color myColorFill) {
        super(shapes,gc, x, y);
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.myColorFill = myColorFill;
    }

    @Override
    public void draw() {
        double[] xPoints = {x, x - 20, x - 5};
        double[] yPoints = {y, y + 10, y + 27};

        gc.setFill(myColorFill);
        gc.fillPolygon(xPoints, yPoints, 3);

        gc.setFill(myColorFill);
        gc.fillOval(x - 30, y + 10, DIAMETER, DIAMETER);

        double[] xPoints2 = {x - 10, x - 30, x - 35};
        double[] yPoints2 = {y + 10, y + 45, y + 48};
        gc.setFill(myColorFill);
        gc.fillPolygon(xPoints2, yPoints2, 3);
    }

}
