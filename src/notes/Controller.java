/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author ArthurJCQ
 */
public class Controller implements Initializable {

    @FXML
    private VBox pp_haut = new VBox();
    
    @FXML
    private VBox pp_milieu = new VBox();
    
    @FXML
    private VBox pp_bas = new VBox();
    
    @FXML
    private VBox pp_connexion = new VBox();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pp_haut.setStyle("-fx-background-color: #ffcc66;");
        pp_haut.setPrefHeight(200);
        pp_haut.setPrefWidth(1600);
        pp_milieu.setPrefHeight(675);
        pp_milieu.setPrefWidth(1600);
        pp_bas.setStyle("-fx-background-color: #cccccc;");
        pp_bas.setPrefHeight(25);
        pp_bas.setPrefWidth(1600);
        pp_connexion.setStyle("-fx-border-color: black;-fx-border-insets: 5;-fx-border-width: 2;-fx-border-radius: 15;");
        pp_connexion.setMaxSize(300.0, 300.0);
        pp_connexion.setMinSize(300.0, 300.0);
        
    }    
    
}
