package com.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private GraphicsContext gc;
    private List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;

        shapes.add(new Balls(shapes, gc, 10, 20, Color.DARKSEAGREEN, Color.FORESTGREEN));
        shapes.add(new Balls(shapes, gc, 100, 20, Color.DARKSEAGREEN, Color.FORESTGREEN));
        shapes.add(new Balls(shapes, gc, 400, 400, Color.DARKSEAGREEN, Color.FORESTGREEN));
        shapes.add(new Flowers(shapes,gc, 40, 400, Color.LIGHTBLUE, Color.BLUE));
        shapes.add(new Flowers(shapes,gc, 250, 400, Color.BLANCHEDALMOND , Color.BURLYWOOD));
        shapes.add(new Flowers(shapes,gc, 600, 450, Color.LIGHTBLUE, Color.BLUE));
        shapes.add(new Hearts(shapes,gc, 600, 60 , Color.INDIANRED));
        shapes.add(new TreeLeafs(shapes,gc, 270, 70, Color.FORESTGREEN));
        shapes.add(new TreeLeafs(shapes,gc, 470, 120,  Color.FORESTGREEN));

    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void move() {
        clean();
        for (Shape shape : shapes) {
            shape.move();
        }
    }

    private void clean() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

}
