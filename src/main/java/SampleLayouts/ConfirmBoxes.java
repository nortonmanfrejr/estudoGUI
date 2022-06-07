package SampleLayouts;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBoxes {

    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label l = new Label();
        l.setText(message);

        // Two Buttons

        Button yesB = new Button("Yes");
        Button noB = new Button("No");


        yesB.setOnAction(e ->{
            answer = true;
            window.close();
        });
        noB.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(l, yesB, noB);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        window.setScene(s);
        window.showAndWait();


        return answer;
    }
}
