/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ArthurJCQ
 */
public class ControllerListeNotes implements Initializable {

    @FXML
    private CheckBox writeMod;

    @FXML
    private Alert alert;

    @FXML
    private Pane comm1, comm2;

    @FXML
    private VBox pp_haut3 = new VBox(), pp_bas3 = new VBox();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pp_haut3.setPrefSize(1600, 875);
        pp_bas3.setStyle("-fx-background-color: #cccccc;");
        pp_bas3.setPrefSize(1600, 25);
    }

    @FXML
    public void goToNote(ActionEvent actionevent) throws Exception {
        if (writeMod.isSelected()) {
            changeScene(actionevent, "ViewPriseNotes.fxml");
        } else{
            changeScene(actionevent, "ViewLireNotes.fxml");
        }
    }

    @FXML
    private void changeScene(Event event, String page) throws Exception {

        Parent blah = FXMLLoader.load(getClass().getResource(page));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

}
