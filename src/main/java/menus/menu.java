package menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class menu extends Application {

    public static void main(String[] args){
        launch(args);
    }


    MenuItem separator = new SeparatorMenuItem();
    Stage w;
    BorderPane l;
    @Override
    public void start(Stage stage) throws Exception {

        w = stage;
        w.setTitle("Menu Bar");

        //----------------

        // File menu
        Menu fileMenu = new Menu("File");

        // File menu Items
        MenuItem newFile = new MenuItem("New");
        newFile.setOnAction(e -> System.out.println("New file Created..."));
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(e -> w.close());


        fileMenu.getItems().addAll(newFile, separator, exit);
        // Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        //----------------

        l = new BorderPane();
        l.setTop(menuBar);
        Scene s = new Scene(l,400,300);
        w.setScene(s);
        w.show();
    }

}
