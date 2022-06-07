package AlertBoxes;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.*;
public class Main extends Application {
    Stage w;
    Button b;

    public void start(Stage primaryStage) throws Exception {
        w = primaryStage;
        w.setTitle("alertBoxes");



        w.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        }); // Request close
//
        b = new Button("Close program");
//        b.setOnAction(e -> AlertBoxes2.display("Alert Box", "Woow, this is alert box is awesome")); // Alert Boxes
//
//        b.setOnAction(e -> {
//            boolean result = ConfirmBoxes.display("Window of confirmBox", "Are you sure you want to send naked pics?"); // Confirm Boxes
//            System.out.println(result);
//        });
//
        b.setOnAction(e -> closeProgram()); // Close Progam

        StackPane layout = new StackPane();
        layout.getChildren().addAll(b);
        Scene s = new Scene(layout,300,250);
        w.setScene(s);
        w.show();
    }


    private void closeProgram(){
        Boolean answer = ConfirmBoxes.display("Title", "Sure you want to exit?");
        if(answer)
            w.close();

    }

}
