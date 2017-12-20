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
public class ControllerConnexion implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private PasswordField mdp;
    @FXML
    private Alert alert;

    @FXML
    private VBox pp_haut = new VBox(), pp_milieu = new VBox(), pp_connexion = new VBox(), pp_bas = new VBox();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pp_haut.setPrefSize(1600, 875);
        pp_milieu.setPrefSize(1600, 675);
        pp_bas.setStyle("-fx-background-color: #cccccc;");
        pp_bas.setPrefSize(1600, 25);
        pp_connexion.setStyle("-fx-border-color: black;-fx-border-width: 2;-fx-border-radius: 15;");
        pp_connexion.setMaxSize(300.0, 300.0);
        pp_connexion.setMinSize(300.0, 300.0);
    }

    @FXML
    public void goToMenu(ActionEvent actionevent) throws Exception {
        if (Model.tryLogin(nom.getText(), mdp.getText())) {
            changeScene(actionevent, "ViewMenu.fxml");
        } else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Mauvais paramètres de connexion");

            alert.showAndWait();
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
