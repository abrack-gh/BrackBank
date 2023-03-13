module com.example.brackbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.brackbank to javafx.fxml;
    exports com.example.brackbank;
    exports com.example.brackbank.Controllers;
    exports com.example.brackbank.Controllers.Admin;
    exports com.example.brackbank.Controllers.Client;
    exports com.example.brackbank.Models;
    exports com.example.brackbank.Views;
}