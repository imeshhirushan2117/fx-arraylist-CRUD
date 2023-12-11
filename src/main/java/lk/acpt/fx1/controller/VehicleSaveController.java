package lk.acpt.fx1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.acpt.fx1.HelloApplication;
import lk.acpt.fx1.db.DataBase;
import lk.acpt.fx1.to.Car;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static lk.acpt.fx1.db.DataBase.carList;

/**
 * Created By Imesh Hirushan
 * Project Name : fx-1
 * Package Name : lk.acpt.fx1
 * Date : Dec 9, 2023
 * Time : 10:00 AM
 */
public class VehicleSaveController{
    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtEngNo;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtModule;

    @FXML
    private TextField txtTMode;


    @FXML
    void save(ActionEvent event) {
        String id = txtId.getText();
        String module = txtModule.getText();
        String brand = txtBrand.getText();
        int engNo = Integer.parseInt(txtEngNo.getText());
        String tMode = txtTMode.getText();

       boolean add =  carList.add(new Car(id,module,brand,engNo,tMode));
        if(add){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Save");
            alert.setContentText("Car save Success Full ! ");
            alert.show();
            clear();

        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Car save Un Success Full ! ");
            alert.show();
        }
    }

    @FXML
    void cansel(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void deleted(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL deletedPageUrl = getClass().getResource("/lk/acpt/fx1/vehicle-deleted.fxml");

        loader.setLocation(deletedPageUrl);
        Parent deletedPageParent = loader.load();

        Scene deletedPageScene = new Scene(deletedPageParent);

        Stage stage = (Stage) txtId.getScene().getWindow();
        stage.setScene(deletedPageScene);
        stage.show();
    }

    @FXML
    void update(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL deletedPageUrl = getClass().getResource("/lk/acpt/fx1/vehicle-update.fxml");

        loader.setLocation(deletedPageUrl);
        Parent deletedPageParent = loader.load();

        Scene deletedPageScene = new Scene(deletedPageParent);

        Stage stage = (Stage) txtId.getScene().getWindow();
        stage.setScene(deletedPageScene);
        stage.show();
    }

    @FXML
    void getAll(ActionEvent event) {

        int size = carList.size();
        for (int i = 0; i <size; i++) {
            System.out.println(carList.get(i));
        }
        System.out.println();
    }

    public void clear(){
        txtId.clear();
        txtModule.clear();
        txtBrand.clear();
        txtBrand.clear();
        txtEngNo.clear();
        txtTMode.clear();
    }


}
