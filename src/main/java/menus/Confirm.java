package menus;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Confirm {

    static boolean answer;

    public static Boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label l = new Label();
        l.setText(message);

        // Buttons

        Button buttonYes = new Button("YES");
        buttonYes.setOnAction(e -> {
            answer = true;
            window.close();
        });
        Button buttonNo = new Button("NO");
        buttonNo.setOnAction(e ->{
            answer = false;
            window.close();
        });
        //---------------
        VBox layout = new VBox(10);
        layout.getChildren().addAll(l, buttonYes, buttonNo);
        layout.setAlignment(Pos.CENTER);


        Scene s = new Scene(layout);
        window.setScene(s);
        window.showAndWait();

        return answer;
    }
}
