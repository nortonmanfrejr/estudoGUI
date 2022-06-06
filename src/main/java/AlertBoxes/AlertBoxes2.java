package AlertBoxes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBoxes2 {




    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label l = new Label();
        l.setText(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> {
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(l, closeButton);
        layout.setAlignment(Pos.CENTER);


        Scene s = new Scene(layout);
        window.setScene(s);
        window.showAndWait();
    }
}
