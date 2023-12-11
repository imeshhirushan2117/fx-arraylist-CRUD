package lk.acpt.fx1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Created By Imesh Hirushan
 * Project Name : fx-1
 * Package Name : lk.acpt.fx1
 * Date : Dec 3, 2023
 * Time : 11:49 AM
 */

public class LoginViewController {
    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void SignIn(ActionEvent event) {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        System.out.println("Your User Name is : "+userName);
        System.out.println("Your Password is : "+password);
    }

}
