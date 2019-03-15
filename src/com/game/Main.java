package com.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application{

    private static final int BOARD_WIDTH = 800;
    private static final int BOARD_HEIGHT = 500;
    public static Timer timer = new Timer();
    private boolean isStoped = false;
    private Board board;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("SimpleGame");
        Canvas canvas = new Canvas();
        canvas.setWidth(BOARD_WIDTH);
        canvas.setHeight(BOARD_HEIGHT);
        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();

        GraphicsContext gc = canvas.getGraphicsContext2D();

        board = new Board(gc);
        board.draw();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                board.move();
                board.draw();
            }
        };

        timer.schedule(task, 20, 20);

    }


}
