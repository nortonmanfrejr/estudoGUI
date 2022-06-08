package listViews;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class listViews extends Application {

    public static void main(String[] args){
        launch(args);
    }


    Stage w;
    Button b;
    Scene s;
    ListView<String> listView;
    @Override
    public void start(Stage stage) throws Exception {

        w = stage;
        w.setTitle("List View");


        b = new Button("Submit");

        //------------------------

        listView = new ListView<>();

        listView.getItems().addAll("Iron Man", "Titanic", "Avatar", "Mindsomar");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        b.setOnAction(e -> bClick());
        //------------------------
        VBox l = new VBox(10);
        l.setPadding(new Insets(20,20,20,20));
        l.getChildren().addAll(listView, b);

        s = new Scene(l,300,250);
        w.setScene(s);
        w.show();

    }

    // Print out movies

    private void bClick(){

        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m : movies){
            message += m + "\n";
        }

        System.out.println(message);
    }

}
