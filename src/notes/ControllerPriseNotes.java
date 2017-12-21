/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
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
    private TextArea note;
    
    @FXML
    private Button save;

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
        try {
            note.setText(Model.searchNote(Etudiant.etudiant_id));
        } catch (SQLException ex) {
            Logger.getLogger(ControllerPriseNotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerPriseNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @FXML
    public void goToConnexion(ActionEvent actionevent) throws Exception {
            changeScene(actionevent, "ViewConnexion.fxml");
    }

    @FXML
    public void goToMenu(ActionEvent actionevent) throws Exception {
            changeScene(actionevent, "ViewMenu.fxml");
    }

    @FXML
    public void goToListeNotes(ActionEvent actionevent) throws Exception {
            changeScene(actionevent, "ViewListeNotes.fxml");
    }

    @FXML
    private void changeScene(Event event, String page) throws Exception {
        Parent rootPN = FXMLLoader.load(getClass().getResource(page));

        Scene scene = new Scene(rootPN);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void enregistrerNote(ActionEvent actionevent) throws Exception {

        String text = note.getText();
        
        try{ 
            Model.updateNote(1, text);
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Enregistrement");
            alert.setHeaderText(null);
            alert.setContentText("Votre note a bien été enregistrée");
            alert.showAndWait();
        }
        catch(Exception e){
            System.out.println("Erreur : " + e);
        }
    }

}
