/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author andreasvillumsen
 */
public class TemplateController implements Initializable {

    @FXML
    private BorderPane BorderPane;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try
        {
            BorderPane.setLeft(buildProfile());
        } catch (IOException ex)
        {
            Logger.getLogger(TemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public Parent buildProfile() throws IOException
    {
        /**FXMLLoader fxmlLoader = new FXMLLoader();

        Parent root = (Parent) fxmlLoader.load(getClass().getResource("/attendanceproject/gui/view/Profile.fxml").openStream());
        ProfileController cont = (ProfileController) fxmlLoader.getController();
        cont.setTemplateController(this);*/
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/Profile.fxml"));
        return root;
    }
    
    public Parent buildEditProfile() throws IOException
    {
        /*FXMLLoader fxmlLoader = new FXMLLoader();

        Parent root = (Parent) fxmlLoader.load(getClass().getResource("/attendanceproject/gui/view/EditProfile.fxml").openStream());
        EditProfileController cont = (EditProfileController) fxmlLoader.getController();
        cont.setTemplateController(this);*/
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/EditProfile.fxml"));
        
        return root;
    }
    
    public void setEditProfile() throws IOException
    {
        BorderPane.setLeft(buildEditProfile());
    }
    
    public void setProfile() throws IOException
    {
        BorderPane.setLeft(buildProfile());
    }

    public BorderPane getBorderPane()
    {
        return BorderPane;
    }

    public void setBorderPane(BorderPane BorderPane)
    {
        this.BorderPane = BorderPane;
    }
    
    
    
}
        