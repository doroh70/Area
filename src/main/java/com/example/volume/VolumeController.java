package com.example.volume;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class VolumeController {

    @FXML
    private TextField length;

    @FXML
    private TextField height;

    @FXML
    private TextField area;

    @FXML
    void onCalculateClicked(ActionEvent event) {
        float x = Float.parseFloat(length.getText());
        float y = Float.parseFloat(height.getText());

        VolumeMain app = new VolumeMain(x, y);

        area.setText(String.valueOf(app.getResult()));
    }

    @FXML
    void onResetClicked(ActionEvent event) {
        length.clear();
        height.clear();
        area.clear();
    }

}

