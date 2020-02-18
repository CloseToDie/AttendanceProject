/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author andreasvillumsen
 */
public class AttendanceProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui/view/Template.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/StudentSelect.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/Profile.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/Template.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/EditProfile.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
