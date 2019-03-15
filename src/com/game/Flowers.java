package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Flowers extends MovingFigure {

    private static double DIAMETER = 25;

    private GraphicsContext gc;
    Color myColorFill;
    Color myColorStroke;

    public Flowers(List<Shape> shapes, GraphicsContext gc, double x, double y, Color myColorFill, Color myColorStroke) {
        super(shapes,gc, x, y);
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.myColorFill = myColorFill;
        this.myColorStroke = myColorStroke;
    }

    @Override
    public void draw() {
    // верхний лепесток
        gc.setFill(myColorFill);
        gc.setStroke(myColorStroke);
        gc.setLineWidth(1);
        gc.fillOval(x, y - 15, DIAMETER, DIAMETER);
        gc.strokeOval(x, y - 15, DIAMETER, DIAMETER);

    //  правый лепесток
        gc.setFill(myColorFill);
        gc.setStroke(myColorStroke);
        gc.setLineWidth(1);
        gc.fillOval(x + 10, y, DIAMETER, DIAMETER);
        gc.strokeOval(x + 10, y, DIAMETER, DIAMETER);

    // нижний правый лепесток
        gc.setFill(myColorFill);
        gc.setStroke(myColorStroke);
        gc.setLineWidth(1);
        gc.fillOval(x - 5, y + 5, DIAMETER, DIAMETER);
        gc.strokeOval(x - 5, y + 5, DIAMETER, DIAMETER);

    // нижний левый лепесток
        gc.setFill(myColorFill);
        gc.setStroke(myColorStroke);
        gc.setLineWidth(1);
        gc.fillOval(x - 15, y - 10, DIAMETER, DIAMETER);
        gc.strokeOval(x - 15, y - 10, DIAMETER, DIAMETER);

        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.GOLD);
        gc.setLineWidth(1);
        gc.fillOval(x + 2, y, DIAMETER - 10, DIAMETER - 10);
        gc.strokeOval(x + 2, y, DIAMETER - 10, DIAMETER - 10);

    }
}

