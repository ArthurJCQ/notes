/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author ArthurJCQ
 */
public class Controller2 implements Initializable {
    
    @FXML
    private VBox pp_bas = new VBox();
    
    @FXML
    private VBox p2_haut = new VBox(), p2_milieu = new VBox();
    
    @FXML
    private ComboBox<String> listematieres, listeseances;
        
    @FXML
    private Button boutonacces = new Button();
    
    @FXML
    private Label matiere = new Label(), seance = new Label();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        pp_bas.setStyle("-fx-background-color: #cccccc;");
        pp_bas.setPrefSize(1600, 25);
        
        p2_haut.setPrefSize(1600, 200);
        p2_milieu.setPrefSize(1600, 675);
        p2_milieu.setSpacing(25);
        p2_milieu.setPadding(new Insets(190, 0, 0, 0));
        
        listematieres.setPrefSize(150, 40);
        
        listeseances.setPrefSize(150, 40);
    }    
    
}
