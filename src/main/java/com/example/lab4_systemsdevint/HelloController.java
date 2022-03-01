package com.example.lab4_systemsdevint;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField Username;

    @FXML
    private PasswordField Password;

    @FXML
    private TextField full_name;

    @FXML
    private TextField email;

    @FXML
    private TextField phonenumber;

    @FXML
    private DatePicker dob;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("\n\nUsername: " + Username.getText() + "\nPassword: " + Password.getText() + "\nFull Name: "
                + full_name.getText() + "\nEmail: " + email.getText() + "\nPhone Number: " + phonenumber.getText() + "\nDate of Birth: " + dob.getValue());
    }
}