/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import attendanceproject.be.Student;
import attendanceproject.gui.controller.calendar.CalendarController;
import attendanceproject.gui.controller.calendar.FullCalendarView;
import attendanceproject.gui.model.AppModel;
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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Aluminuminum
 */
public class TeacherViewEditProfileController implements Initializable {
    
    
    private AppModel appmodel;

    @FXML
    private BorderPane BorderPane;
    @FXML
    private ImageView ProfileImageDisplay;
    @FXML
    private TextField usernameTxtField1;
    @FXML
    private TextField usernameTxtField11;
    @FXML
    private TextField usernameTxtField111;
    @FXML
    private TextField usernameTxtField112;
    @FXML
    private TextField usernameTxtField1121;
    @FXML
    private TextField usernameTxtField113;
    @FXML
    private Button saveButton;
    @FXML
    private Label logoutButton;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> userNameCol;
    @FXML
    private TableColumn<Student, String> fullNameCol;
    @FXML
    private TableColumn<Student, String> absenceCol;
    @FXML
    private Label headerUserNameLabel;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       userNameCol.setCellValueFactory(
            new PropertyValueFactory<Student, String>("userName")
        );
        
        fullNameCol.setCellValueFactory(
            new PropertyValueFactory<Student, String>("fullName")
        );
        
        absenceCol.setCellValueFactory(
            new PropertyValueFactory<Student, String>("absence")
        );
        
        try
        {
            appmodel = new AppModel();
            studentTable.setItems(appmodel.getAllStudents());
            
            
        } catch (Exception ex)
        {
            Logger.getLogger(TeacherViewProfileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    

    @FXML
    private void handleSaveAction(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/TeacherViewProfile.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show(); 
        close();
    }
    
    private void close()
    {
         Stage stage = (Stage) BorderPane.getScene().getWindow();
         stage.close();
    }

    private void handleDatePicker(MouseEvent event)
    {
         try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/fullCalendar.fxml"));
           
           Stage  primaryStage = new Stage();
           
        primaryStage.setTitle("Calendar");
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/attendanceproject/gui/view/css/Calendarstyle.css").toExternalForm());
        System.out.println(scene.getStylesheets() + "stylesheets");  
        primaryStage.setScene((scene));
        // Get the controller and add the calendar view to it
        
        CalendarController controller = loader.getController();
        controller.calendarPane.getChildren().add(new FullCalendarView(YearMonth.now(),appmodel).getView());
        
        primaryStage.setHeight(415);
        primaryStage.setWidth(393);
        primaryStage.setResizable(false);
        primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleLogout(MouseEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show(); 
        close();
    }
    
    
    
    
    
    
    
    
    
    
    
}
        