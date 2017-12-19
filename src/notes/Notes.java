/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.DBUtil;

/**
 *
 * @author ArthurJCQ & Armand BEGUE
 */
public class Notes extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //StackPane root = new StackPane();

        //Scene scene = new Scene(root, 1000, 650);
        
        Parent root = FXMLLoader.load(getClass().getResource("ViewConnexion.fxml"));
        primaryStage.setTitle("Notes !");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
