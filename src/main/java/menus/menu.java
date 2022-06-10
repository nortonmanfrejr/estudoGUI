package menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class menu extends Application {

    public static void main(String[] args){
        launch(args);
    }

    Stage w;
    BorderPane l;
    @Override
    public void start(Stage stage) throws Exception {

        w = stage;
        w.setTitle("Menu Bar");

        w.setOnCloseRequest( e -> {
            e.consume();
            closeProgram();
        });

        //----------------

        // File menu
        Menu fileMenu = new Menu("File");

        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("New file Created..."));
        MenuItem editFile = new MenuItem("Open...");
        editFile.setOnAction(e -> System.out.println("File opened..."));
        MenuItem saveFile = new MenuItem("Save...");
        saveFile.setOnAction(e -> System.out.println("File saved..."));
        MenuItem settings = new MenuItem("Settings...");
        settings.setOnAction(e -> System.out.println("Settings..."));
        MenuItem exit = new MenuItem("Exit...");
        exit.setOnAction(e -> closeProgram());

        // Edit Menu

        Menu editMenu = new Menu("Edit");

        editMenu.getItems().add(new MenuItem("CUT"));
        editMenu.getItems().add(new MenuItem("COPY"));
        MenuItem paste = new MenuItem("PASTE");
        paste.setOnAction(e -> System.out.println("paste"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        // Menu help
        Menu helpMenu = new Menu("Help");
        CheckMenuItem lineNumber = new CheckMenuItem("Show Lines");
        lineNumber.setOnAction(e -> {
            if(lineNumber.isSelected())
                System.out.println("The program have 10 lines");
            else
                System.out.println("This not have a lines");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setOnAction(e -> {
            if(autoSave.isSelected())
                System.out.println("Autosave enabled");
            else
                System.out.println("Autosave desable");
        });

        helpMenu.getItems().addAll(lineNumber,autoSave);
        // --------------------------
        fileMenu.getItems().addAll(newFile,editFile,saveFile,new SeparatorMenuItem(),settings,new SeparatorMenuItem(),exit);

        //-------------- Menu Difficulty
        Menu diffiMenu = new Menu("Difficulty");
        ToggleGroup diffiToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(diffiToggle); medium.setToggleGroup(diffiToggle); hard.setToggleGroup(diffiToggle);
        diffiMenu.getItems().addAll(easy,medium,hard);
        // Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu, diffiMenu);

        //----------------

        l = new BorderPane();
        l.setTop(menuBar);
        Scene sPrincipal = new Scene(l,400,300);
        w.setScene(sPrincipal);
        w.show();
    }







    public void closeProgram(){
        Boolean answer = Confirm.display("Finish!!","Sure you want to exit?");

        if(answer){
            w.close();
        }
    }
}
