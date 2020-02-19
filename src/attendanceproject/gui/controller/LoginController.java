/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import attendanceproject.gui.controller.calendar.CalendarController;
import attendanceproject.gui.controller.calendar.FullCalendarView;
import java.io.IOException;
import java.net.URL;
import java.time.YearMonth;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.application.Application;


/**
 * FXML Controller class
 *
 * @author Aluminuminum
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameTxtField;
    @FXML
    private PasswordField passwordTxtField;
    @FXML
    private Button loginButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        
        String txt = usernameTxtField.getText();
        
        if (txt.equals("Teacher"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/TeacherViewProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show(); 
            close();
        }
        else if (txt.equals("Student"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/StudentViewProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show(); 
            close();
        }
        else if (txt.isEmpty())
        {
            System.out.println("Write something");
        }
    }
    
     private void close()
    {
         Stage stage = (Stage) usernameTxtField.getScene().getWindow();
         stage.close();
    }

    
    
}
