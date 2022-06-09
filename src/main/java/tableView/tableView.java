package tableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tableView extends Application {


    public static void main(String[] args){
        launch(args);
    }

    Stage w;
    Scene s;
    TableView<Product> table;
    TextField nameInput, priceInput, qntdInput;

    @Override
    public void start(Stage stage) throws Exception {
        w = stage;
        w.setTitle("Table View");

        // -----------------------------------

        // ID Column

        TableColumn<Product, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setMinWidth(50);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        // Name Column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name ");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Price Column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Quantity Column
        TableColumn<Product, Integer> qntdColumn = new TableColumn<>("Quantity");
        qntdColumn.setMinWidth(100);
        qntdColumn.setCellValueFactory(new PropertyValueFactory<>("qntd"));
        // -----------------------------------

        table = new TableView<>();
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        table.setItems(getProduct());
        table.getColumns().addAll(idColumn, nameColumn, priceColumn, qntdColumn);

        //------------------------------------

        // Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        // Price Input
        priceInput = new TextField();
        priceInput.setPromptText("Price");

        // Qntd Input
        qntdInput = new TextField();
        qntdInput.setPromptText("Quantity");

        //------------------------------------

        Button addButton = new Button("Add");
        Button delButton = new Button("Delete");

        addButton.setOnAction(e -> addButtonClick());
        delButton.setOnAction(e -> delButtonClick());

        //------------------------------------

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, qntdInput, addButton, delButton);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);
        s = new Scene(vBox);
        w.setScene(s);
        w.show();
    }

    public void addButtonClick(){
        Product product = new Product();

        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQntd(Integer.parseInt(qntdInput.getText()));

        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        qntdInput.clear();
    }

    public void delButtonClick(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 859.00,20));
        products.add(new Product("Bouncy Ball", 2.49,198));
        products.add(new Product("Toilet", 99.00,74));
        products.add(new Product("The Notebook DVD", 19.99,124));
        products.add(new Product("PopCorn", 1.49,865));
        return products;
    }
}
