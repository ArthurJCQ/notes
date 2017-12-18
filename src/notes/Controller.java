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
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ArthurJCQ
 */
public class Controller implements Initializable {

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

    public void goToMenu(ActionEvent actionevent) throws Exception {
        changeScene(actionevent);
    }

    @FXML
    private void changeScene(Event event) throws Exception {

        Parent blah = FXMLLoader.load(getClass().getResource("Vue2.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

}
