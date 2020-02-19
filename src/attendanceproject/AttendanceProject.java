/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject;

import attendanceproject.gui.controller.calendar.CalendarController;
import attendanceproject.gui.controller.calendar.FullCalendarView;
import java.io.IOException;
import java.time.YearMonth;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluminuminum
 */
public class AttendanceProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/StudentViewProfile.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/StudentViewEditProfile.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/StudentSelect.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/Profile.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/Template.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/EditProfile.fxml"));
         Parent root = FXMLLoader.load(getClass().getResource("gui/view/Login.fxml"));
        Scene scene = new Scene(root);
        
        //System.out.println(scene.getStylesheets() + " OK");
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        
       /* FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/fullCalendar.fxml"));
           
           Stage  primaryStage = new Stage();
           
        primaryStage.setTitle("Calendar");
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/attendanceproject/gui/view/css/Calendarstyle.css").toExternalForm());
        System.out.println(scene.getStylesheets() + " stylesheet");  
        primaryStage.setScene((scene));
        // Get the controller and add the calendar view to it
        
        CalendarController controller = loader.getController();
        controller.calendarPane.getChildren().add(new FullCalendarView(YearMonth.now()).getView());
        
        primaryStage.setHeight(415);
        primaryStage.setWidth(393);
        primaryStage.setResizable(false);
        primaryStage.show();*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
