package lk.acpt.fx1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.acpt.fx1.db.DataBase;
import lk.acpt.fx1.to.Car;

import java.io.IOException;
import java.net.URL;

import static lk.acpt.fx1.db.DataBase.carList;

/**
 * Created By Imesh Hirushan
 * Project Name : fx-1
 * Package Name : lk.acpt.fx1.controller
 * Date : Dec 10, 2023
 * Time : 10:07 AM
 */

public class VehicleDeletedController {

    @FXML
    private TextField txtId;

    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL deletedPageUrl = getClass().getResource("/lk/acpt/fx1/vehicle-save.fxml");

        loader.setLocation(deletedPageUrl);
        Parent deletedPageParent = loader.load();

        Scene deletedPageScene = new Scene(deletedPageParent);

        Stage stage = (Stage) txtId.getScene().getWindow();
        stage.setScene(deletedPageScene);
        stage.show();
    }

    @FXML
    void deleted(ActionEvent event) {
        String id = txtId.getText();
        int size = DataBase.carList.size();

        for (int i = 0 ; i < size ; i ++){
            Car car = DataBase.carList.get(i);
            if(car.getId().equals(id)){
                DataBase.carList.remove(i);

                System.out.println("ID : " + id +" Deleted SuccessFull !");
                System.out.println();
                clear();
                break;
            }else{

            }

        }
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
    }
}
