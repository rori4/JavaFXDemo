import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActiveEvent event){
        System.out.println("You clicked me");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }
}
