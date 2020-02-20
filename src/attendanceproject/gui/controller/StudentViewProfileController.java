/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import attendanceproject.be.Klasse;
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
public class StudentViewProfileController implements Initializable {
    
    
    
    private AppModel appmodel;
    @FXML
    private BorderPane BorderPane;
    @FXML
    private ImageView ProfileImageDisplay;
    @FXML
    private Button editYourProfileButton;
    @FXML
    private TableView<Klasse> classTable;
    @FXML
    private BorderPane chartsBorderPane;
    @FXML
    private Label currentDateLabel;
    @FXML
    private ImageView calendarImage;
    @FXML
    private Label logoutButton;
    @FXML
    private TableColumn<Klasse, String> classCol;
    @FXML
    private TableColumn<Klasse, String> timeCol;
    @FXML
    private TableColumn<Klasse, String> statusCol;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        classCol.setCellValueFactory(
            new PropertyValueFactory<Klasse, String>("className")
        );
        
        timeCol.setCellValueFactory(
            new PropertyValueFactory<Klasse, String>("time")
        );
        
        statusCol.setCellValueFactory(
            new PropertyValueFactory<Klasse, String>("status")
        );
        
        try
        {
            appmodel = new AppModel();
            classTable.setItems(appmodel.getAllClasses());
        } catch (Exception ex)
        {
            Logger.getLogger(TeacherViewProfileController.class.getName()).log(Level.SEVERE, null, ex);
        }
       chartsBorderPane.setCenter(buildBarCHart());
    }    
    
    private BarChart buildBarCHart()
    {
         CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Weekdays");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Absence");
        
        BarChart barChart = new BarChart(xAxis, yAxis);
        
        XYChart.Series data = new XYChart.Series();
        data.setName("Absence per weekday");
        
        //provide data 
        data.getData().add(new XYChart.Data("mondays", 10));
        data.getData().add(new XYChart.Data("tuesdays", 25));
        data.getData().add(new XYChart.Data("wednesdays", 2));
        data.getData().add(new XYChart.Data("thursdays", 8));
        data.getData().add(new XYChart.Data("fridays", 6));
        
        barChart.getData().add(data);
        barChart.setLegendVisible(false);
        
        return barChart;
        
    }

    @FXML
    private void handleEditButton(ActionEvent event) throws IOException
    {
       
         Parent root = FXMLLoader.load(getClass().getResource("/attendanceproject/gui/view/StudentViewEditProfile.fxml"));
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

    @FXML
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
        controller.calendarPane.getChildren().add(new FullCalendarView(YearMonth.now()).getView());
        
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
        