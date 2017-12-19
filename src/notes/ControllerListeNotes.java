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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ArthurJCQ
 */
public class ControllerListeNotes implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private PasswordField mdp;
    @FXML
    private Alert alert;

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
    public void goToMenu(ActionEvent actionevent) throws Exception {
        if (Model.tryLogin(nom.getText(), mdp.getText())) {
            changeScene(actionevent);
        } else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Mauvais paramètres de connexion");

            alert.showAndWait();
        }
    }

    @FXML
    private void changeScene(Event event) throws Exception {

        Parent blah = FXMLLoader.load(getClass().getResource("ViewMenu.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

}
