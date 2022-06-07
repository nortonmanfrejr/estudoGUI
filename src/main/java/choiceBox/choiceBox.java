package choiceBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class choiceBox extends Application{

    public static void main(String[] args){
        launch(args);
    }


    Stage w;
    Scene s;
    Button b;
    @Override
    public void start(Stage stage) throws Exception {
    w = stage;
    w.setTitle("Choice demo.");

    b = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        // getItems returns the observableList object which you can add items to
        choiceBox.getItems().addAll("Apples","Bananas","Bacon","Ham","Meatballs");

        // Set a default value
        choiceBox.setValue("Apples");


        b.setOnAction(e -> getChoice(choiceBox));

    VBox l = new VBox(10);
    l.setPadding(new Insets(20,20,20,20));
    l.getChildren().addAll(choiceBox, b);


    s = new Scene(l,300,200);
    w.setScene(s);
    w.show();
    }


    // To get the value of the select item
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(String.format("%s", food));
    }
}
