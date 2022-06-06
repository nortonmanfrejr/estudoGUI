package AlertBoxes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage w;
    Button b;


    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        w = primaryStage;
        w.setTitle("alertBoxes");

        b = new Button("Click me");
//        b.setOnAction(e -> AlertBoxes2.display("Alert Box", "Woow, this is alert box is awesome"));

        b.setOnAction(e -> {
            boolean result = ConfirmBoxes.display("Confirm Button", "Are you sure you want to send naked pics?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(b);
        Scene s = new Scene(layout,300,250);
        w.setScene(s);
        w.show();
    }
}
