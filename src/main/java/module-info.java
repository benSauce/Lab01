module com.saucedo.lab01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.saucedo.lab01 to javafx.fxml;
    exports com.saucedo.lab01;
}