package loginScene;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class loginScene extends Application {
    Stage w;
    Button b;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        w = primaryStage;
        w.setTitle("Log in");

        // -----------------------------------------------------

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8); // Adicionando espaço na vertical
        grid.setHgap(10); // Adicionando espaço na horizontal

        // -----------------------------------------------------

        // Name label and Name input

        Label nameLabel = new Label("Username: "); // Name label
        GridPane.setConstraints(nameLabel,0,0);

        TextField nameInput = new TextField("USERNAME"); // Name input
        GridPane.setConstraints(nameInput,1,0);

        // Password label and password input

        Label passLabel = new Label("PASSWORD: "); // Password label
        GridPane.setConstraints(passLabel,0,1);

        TextField passInput = new TextField(); // Password input
        passInput.setPromptText("*********");
        GridPane.setConstraints(passInput,1,1);

        // Login Button

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton,1,2);

        // print Button in terminal

        loginButton.setOnAction(e -> {
            System.out.printf("username: %s%npassword: %s%n", nameInput.getText(), passInput.getText());
        });

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);


        Scene logIn = new Scene(grid,300,200);
        w.setScene(logIn);
        w.show();

    }
}


