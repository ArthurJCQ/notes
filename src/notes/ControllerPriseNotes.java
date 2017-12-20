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
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author bluestone
 */
public class ControllerPriseNotes implements Initializable {

    @FXML
    private Alert alert;
    @FXML
    private TextField nom;

    @FXML
    private PasswordField mdp;

    @FXML
    private Pane comm1, comm2;

    @FXML
    private VBox pp_haut3 = new VBox(), pp_bas3 = new VBox();

    @FXML
    private MenuItem miAccueil;

    @FXML
    private MenuItem miListeNotes;

    @FXML
    private MenuItem miConnexion;

    @FXML
    private MenuItem miPlan;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pp_haut3.setPrefSize(1600, 875);
        pp_bas3.setStyle("-fx-background-color: #cccccc;");
        pp_bas3.setPrefSize(1600, 25);
    }

    /* @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @FXML
    public void ToConnexion(javafx.event.ActionEvent actionevent) throws Exception {
        if (actionevent.getSource() == miConnexion) {
            String pageDeconnexion = "ViewConnexion.fxml";
            changeScene(actionevent, pageDeconnexion);
        }
    }

    @FXML
    public void ToAccueil(javafx.event.ActionEvent actionevent) throws Exception {
        if (actionevent.getSource() == miAccueil) {

            String pageAccueil = "ViewMenu.fxml";
            changeScene(actionevent, pageAccueil);
        }
    }

    @FXML
    public void ToPlan(javafx.event.ActionEvent actionevent) throws Exception {
        if (actionevent.getSource() == miPlan) {

            String pagePlan = "ViewPlan.fxml";
            changeScene(actionevent, pagePlan);
        }
    }

    @FXML
    public void ToListeNotes(javafx.event.ActionEvent actionevent) throws Exception {
        if (actionevent.getSource() == miListeNotes) {

            String pageListeNotes = "ViewListeNotes.fxml";
            changeScene(actionevent, pageListeNotes);
        }
    }

    @FXML
    private void changeScene(Event event, String page) throws Exception {
        Parent rootPN = FXMLLoader.load(getClass().getResource(page));

        Scene scene = new Scene(rootPN);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    public void enregistrerNotes(ActionEvent actionevent) throws Exception {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Enregistrement");
        alert.setHeaderText(null);
        alert.setContentText("Votre document a bien été enregistré");
        alert.showAndWait();
    }

}