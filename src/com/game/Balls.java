package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Balls extends MovingFigure {

    private static double DIAMETER = 25;

    private GraphicsContext gc;
    Color myColorFill;
    Color myColorStroke;

    public Balls(List<Shape> shapes, GraphicsContext gc, double x, double y, Color myColorFill, Color myColorStroke) {
        super(shapes, gc, x, y);
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.myColorFill = myColorFill;
        this.myColorStroke = myColorStroke;
    }

    @Override
    public void draw() {
        gc.setFill(myColorFill);
        gc.setStroke(myColorStroke);
        gc.setLineWidth(2);

        gc.fillOval(x, y, DIAMETER, DIAMETER);
        gc.strokeOval(x, y, DIAMETER, DIAMETER);
    }

}
