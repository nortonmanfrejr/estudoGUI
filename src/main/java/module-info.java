module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;

    opens AlertBoxes to javafx.fxml;
    exports AlertBoxes;

    exports SwitchingScenes;
    opens SwitchingScenes to javafx.fxml;

    exports  SampleLayouts;
    opens SampleLayouts to javafx.fxml;

    exports loginScene;
    opens loginScene to javafx.fxml;

    exports validateInput;
    opens validateInput to javafx.fxml;

    exports CheckBox;
    opens CheckBox to javafx.fxml;

    exports choiceBox;
    opens choiceBox to javafx.fxml;

    exports comboBox;
    opens comboBox to javafx.fxml;

    exports listViews;
    opens listViews to javafx.fxml;

    exports treeView;
    opens treeView to javafx.fxml;
}


