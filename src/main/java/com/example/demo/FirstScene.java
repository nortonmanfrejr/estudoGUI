package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FirstScene extends Application {

    Button b;

    public static void main(String[] args) {
        launch(args); // Corre a aplicação
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculadora"); // Nome da janela.
        b = new Button(); // Objeto botão
        b.setText("Ardido"); // Texto dentro do botão

        b.setOnAction(e -> {
            System.out.println("Hey man, this is an lambda expression.");
            System.out.println("Eae mano");
        });

        StackPane layout = new StackPane(); // Objeto de layout da janela
        layout.getChildren().add(b); // Adicionando o recurso botão na janela


        Scene scene = new Scene(layout, 300,250); // Da janela
        primaryStage.setScene(scene);
        primaryStage.show(); // Monstrando a janela
    }


}