/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


/**
 * FXML Controller class
 *
 * @author Aluminuminum
 */
public class StudentViewProfileController implements Initializable {
    
    
    

    @FXML
    private BorderPane BorderPane;
    @FXML
    private ImageView ProfileImageDisplay;
    @FXML
    private Button editYourProfileButton;
    @FXML
    private TableView<?> classTable;
    @FXML
    private BorderPane chartsBorderPane;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
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
    
    
    
    
    
    
    
    
    
    
    
}
        