module com.example.harjoitus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.harjoitus to javafx.fxml;
    exports com.example.harjoitus;
}