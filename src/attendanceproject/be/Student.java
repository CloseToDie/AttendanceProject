/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.be;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Aluminuminum
 */
public class Student extends Person
{
    private final SimpleStringProperty absence;
    
    
    public Student(int id, String userName, String fullName, String absence, String addres, String postCode, String city, String email)
    {
        super(id, userName, fullName, addres, postCode, city, email);
        this.absence = new SimpleStringProperty(absence);
    }
    
    public String getAbsence() {
        return absence.get();
    }
    
      /**
       * 
       * @param email 
       */
    public void setAbsence(String absence) {
        this.absence.set(absence);
    }
    
}
