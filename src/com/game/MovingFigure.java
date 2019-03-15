package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class MovingFigure implements Shape {

    private static double DIAMETER = 25;

    private GraphicsContext gc;
    private List<Shape> shapes = new ArrayList<>();

    protected double x;
    protected double y;

    private double xSpeed;
    private double ySpeed;

    public MovingFigure(List<Shape> shapes, GraphicsContext gc, double x, double y) {
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.shapes = shapes;

        Random random = new Random();
        xSpeed = 1 + random.nextInt(2);
        ySpeed = 1 + random.nextInt(2);
    }

    @Override
    public void move() {
        x += xSpeed;
        y += ySpeed;

        // отнимаю 20 и прибавляю 10 для более точной границы, т.к. некоторые фигуры
        // без этих констант немного заходят за края формы

        if ((x + DIAMETER + 10 >= gc.getCanvas().getWidth()) || (x + DIAMETER - 20 <= 0)) {
            xSpeed = -xSpeed;
        }

        if ((y + DIAMETER + 10 >= gc.getCanvas().getHeight()) || (y + DIAMETER - 20 <= 0)) {
            ySpeed = -ySpeed;
        }

        for (Shape shape : shapes) {
            if (shape == this) {
                continue;
            } else if (shape.getDistance(x, y) <= DIAMETER) {
                xSpeed = -xSpeed;
                ySpeed = -ySpeed;
            }
        }
    }

    @Override
    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    @Override
    public abstract void draw();

}
