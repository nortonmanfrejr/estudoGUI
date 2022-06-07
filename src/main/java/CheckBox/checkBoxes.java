package CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class checkBoxes extends Application {

    public static void main(String[] args){
        launch(args);
    }


    Stage w;
    Scene s;
    Button b;

    @Override
    public void start(Stage pStage) throws Exception {
        w = pStage;
        w.setTitle("Check Box");

        // CheckBoxes

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        // Button
        b = new Button("Order now");
        b.setOnAction(e -> handleOption(box1, box2));
        // Layout
        VBox l = new VBox(10);
        l.setPadding(new Insets(20,20,20,20));
        l.getChildren().addAll(box1,box2,b);

        s = new Scene(l,300,250);
        w.setScene(s);
        w.show();
    }

    private void handleOption(CheckBox box1, CheckBox box2){
        String message = "User order:\n";

        if(box1.isSelected())
            message += box1.getText() + "\n";
        if(box2.isSelected())
            message += box2.getText() + "\n";

        System.out.println(message);
    }
}
