package treeView;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class treeViews extends Application {

    public static void main(String[] args){
        launch(args);
    }


    Stage w;
    Scene s;
    Button b;
    TreeView<String> treeView;
    @Override
    public void start(Stage stage) throws Exception {
        w = stage;
        w.setTitle("Tree View");
        //------------------------------------

        TreeItem<String> root, nfilho, manfr;
        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        // Nfilho
        nfilho = makeBranch("nfilho", root);
        makeBranch("nfilho", nfilho);
        makeBranch("GUIs", nfilho);
        makeBranch("Jesus Christo", nfilho);
        //Manfr

        manfr = makeBranch("manfr", root);
        makeBranch("nfilho purple", manfr);
        makeBranch("GUIs estudo", manfr);

        // Create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty()
                .addListener( (v, oldValue, newValue) ->{
                    if(newValue != null)
                        System.out.println(newValue.getValue());
                });

        //------------------------------------
        StackPane l = new StackPane();
        l.setPadding(new Insets(20,20,20,20));
        l.getChildren().add(treeView);


        s = new Scene(l,300,200);
        w.setScene(s);
        w.show();
    }

    // Create branchs

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;

    }

}
