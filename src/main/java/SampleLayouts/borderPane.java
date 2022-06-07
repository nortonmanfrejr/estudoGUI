package SampleLayouts;

import AlertBoxes.ConfirmBoxes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class borderPane extends Application {
    Stage w;
    Button b;


    public static void main(String[] args){
        launch(args);
    }
    @Override

    public void start(Stage primaryStage) throws Exception {
        w = primaryStage;
        w.setTitle("alertBoxes");

        // Sample Layout

        HBox topMenu = new HBox();
        Button bA = new Button("File");
        Button bB = new Button("Edit");
        Button bC = new Button("View");
        topMenu.getChildren().addAll(bA,bB,bC);


        VBox leftMenu = new VBox();
        Button bD = new Button("Button D");
        Button bE = new Button("Button E");
        Button bF = new Button("Exit");
        leftMenu.getChildren().addAll(bD,bE,bF);
        bF.setOnAction(e -> closeProgram()); // Close Program



        BorderPane bPane = new BorderPane();
        bPane.setTop(topMenu);
        bPane.setLeft(leftMenu);

        // ----------------------------------------


        w.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        }); // Request close
//
//        b = new Button("Close program");
//        b.setOnAction(e -> AlertBoxes2.display("Alert Box", "Woow, this is alert box is awesome")); // Alert Boxes
//
//        b.setOnAction(e -> {
//            boolean result = ConfirmBoxes.display("Window of confirmBox", "Are you sure you want to send naked pics?"); // Confirm Boxes
//            System.out.println(result);
//        });
//
//        b.setOnAction(e -> closeProgram()); // Close Progam

        StackPane layout = new StackPane();
        layout.getChildren().addAll(bPane);
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
