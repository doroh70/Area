module com.example.volume {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.volume to javafx.fxml;
    exports com.example.volume;
}