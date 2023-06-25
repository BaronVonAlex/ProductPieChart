module com.example.javafinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;
    requires mysql.connector.j;

    opens com.example.javafinal to javafx.fxml;
    exports com.example.javafinal;
}