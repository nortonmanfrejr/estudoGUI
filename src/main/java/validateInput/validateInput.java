package validateInput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class validateInput extends Application {



    public static void main(String[] args){
        launch(args);
    }

    Stage w;
    Scene s;
    Button b;

    @Override
    public void start(Stage pStage) throws Exception {

        w = pStage;
        w.setTitle("Validate Input");


        // Form

        TextField nameInput = new TextField();

        b = new Button("Validate Input");
        b.setOnAction(e -> isInt(nameInput, nameInput.getText()));


        // Layout

        VBox l = new VBox(10);
        l.setPadding(new Insets(20,20,20,20));
        l.getChildren().addAll(nameInput, b);

        s = new Scene(l,300,250);
        w.setScene(s);
        w.show();
    }

    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.printf("User us: %d%n", age);
            if(age < 18)
                System.out.printf("User is a children.%n");
             else
                 System.out.printf("User is a adult.%n");
            return true;
        } catch (NumberFormatException e){
            System.out.printf("ERROR: %s, is not a number.%n", message);
            return false;
        }
    }

}
