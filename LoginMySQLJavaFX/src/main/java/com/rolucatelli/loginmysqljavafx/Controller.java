package com.rolucatelli.loginmysqljavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class Controller {

    @FXML
    public Label successLabel;
    public Label errorLabel;
    public TextField userField;
    public TextField passwordField;

    public void getConnection() throws SQLException {

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelapp_db", userField.getText(), passwordField.getText())) {
            System.out.println("Successfully connected to MySQL!");
            successLabel.setVisible(true);
            errorLabel.setVisible(false);
        } catch (SQLException e) {
            System.err.println(e);
            errorLabel.setVisible(true);
            successLabel.setVisible(false);
        }

    }



}
