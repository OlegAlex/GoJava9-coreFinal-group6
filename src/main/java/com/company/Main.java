package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    // размер окна программы
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();         // создаем пустую панель

        Scene scene = new Scene(root);  // создаем сцену и кладем внутрь root (пустую панельку)
        primaryStage.setScene(scene);   // привязываем окно программы к нашей сцене
        primaryStage.setWidth(WIDTH);   // прилипаем к правому краю экрана
        primaryStage.setHeight(HEIGHT);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();            // отображаем окно
    }
}
