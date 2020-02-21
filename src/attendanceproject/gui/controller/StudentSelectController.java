/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controller;

import attendanceproject.be.Klasse;
import attendanceproject.gui.model.AppModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Aluminuminum
 */
public class StudentSelectController implements Initializable
{
    private AppModel appmodel;
    private Klasse klasse;
    @FXML
    private RadioButton presentButton;
    @FXML
    private ToggleGroup toggleAbsence;
    @FXML
    private RadioButton absentButton;
    @FXML
    private Button confirmButton;
    @FXML
    private Button cancelbutton;
    @FXML
    private RadioButton notSetButton;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //TODO
    }
    
    public void setklasse(Klasse klasse){
        
        this.klasse =  klasse;

   }
    
    public void setAppModel(AppModel am){
        
        this.appmodel = am;
    
    
    }

    @FXML
    private void handleconfirm(ActionEvent event) {
        
        if(absentButton.isSelected()){
            
            appmodel.updateklasse(new Klasse(klasse.getId(), klasse.getClassName(), klasse.getTime(), "Absent"));
           Stage stage = (Stage) confirmButton.getScene().getWindow();
           stage.close();
        
       
        }
        else if(presentButton.isSelected()){
            
            appmodel.updateklasse(new Klasse(klasse.getId(), klasse.getClassName(), klasse.getTime(), "Present"));
           Stage stage = (Stage) confirmButton.getScene().getWindow();
           stage.close();
        
       
        }
        else{
            
            appmodel.updateklasse(new Klasse(klasse.getId(), klasse.getClassName(), klasse.getTime(), "notSet"));
           Stage stage = (Stage) confirmButton.getScene().getWindow();
           stage.close();
        
       
        }
    }

    @FXML
    private void handleCancel(ActionEvent event) {
        Stage stage = (Stage) cancelbutton.getScene().getWindow();
        stage.close();
    }
    
}
