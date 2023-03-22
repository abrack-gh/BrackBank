package com.example.brackbank.Controllers;

import com.example.brackbank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public ChoiceBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_field;
    public TextField pw_field;
    public Button login_btn;
    public Label error_lbl;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(actionEvent -> Model.getInstance().getViewFactory().showClientWindow());
    }
}
