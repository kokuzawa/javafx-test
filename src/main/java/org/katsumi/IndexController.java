package org.katsumi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IndexController
{
    @FXML
    private Label greeting;

    public void say(ActionEvent e)
    {
        greeting.setText("Hello World!");
    }
}
