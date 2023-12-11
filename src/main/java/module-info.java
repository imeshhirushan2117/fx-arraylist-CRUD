module lk.acpt.fx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.acpt.fx1 to javafx.fxml;
    exports lk.acpt.fx1;
    exports lk.acpt.fx1.to;
    opens lk.acpt.fx1.to to javafx.fxml;
    exports lk.acpt.fx1.controller;
    opens lk.acpt.fx1.controller to javafx.fxml;
}