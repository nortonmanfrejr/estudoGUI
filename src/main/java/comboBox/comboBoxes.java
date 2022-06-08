package comboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class comboBoxes extends Application {

    public static void main(String[] args){
        launch(args);
    }


    Stage w;
    Scene s;
    Button b, bDel;

    ComboBox<String> cBox;
    @Override
    public void start(Stage stage) throws Exception {
        w = stage;
        w.setTitle("Combo Boxes demo");
        b = new Button("Submit");
        bDel = new Button("Delete Movie");
        // -----------------------------
        cBox = new ComboBox<>();

//        cBox.setPromptText("What is your favorite movie?");

        b.setOnAction(e -> {
            getMovie();
//            addMovie();
        });

        bDel.setOnAction(e ->{
            getMovie();
//            delMovie();
        });


        cBox.setOnAction(e -> System.out.printf("%n"));
        cBox.setEditable(true);


        // --------------------------
        VBox l = new VBox(10);
        l.setPadding(new Insets(20,20,20,20));
        l.getChildren().addAll(cBox,bDel,b);


        s = new Scene(l,300,200);
        w.setScene(s);
        w.show();
    }

    public String getMovie(){
        return cBox.getValue();
    }




    // Aqui ja tava virando um CRUD, parei por que aqui nao estou com o intuito de montar um!!

//    public void addMovie(){
//
//        if(!cBox.getItems().contains(getMovie())){
//            cBox.getItems().add(getMovie());
//        } else{
//            System.out.println(String.format("O usuario escolheu o filme: %s ", getMovie()));
//        }
//    }
//
//    public void delMovie(){
//
//        if(cBox.getItems().contains(getMovie())){
//            cBox.getItems().remove(getMovie());
//        } else {
//            System.out.println(String.format("Sistema não tem acesso ao filme: %s", getMovie()));
//        }
//    }
}
