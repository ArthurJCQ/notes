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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author begue
 */
public class ControllerViewLireNotes implements Initializable {
    
    
    @FXML
    private TextArea note;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            note.setText(Model.searchNote(Etudiant.etudiant_id));
        } catch (SQLException ex) {
            Logger.getLogger(ControllerPriseNotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerPriseNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
}
