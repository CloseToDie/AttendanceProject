/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.be;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Aluminuminum
 */
public class Klasse
{
    
     private int id;
    private final SimpleStringProperty className;
    private final SimpleStringProperty time;
    private final SimpleStringProperty status;
    
    
    public Klasse(int id, String className, String time, String status) 
    {
        this.id = id;
        this.className = new SimpleStringProperty(className);
        this.time = new SimpleStringProperty(time);
        this.status = new SimpleStringProperty(status);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    
    public String getClassName() {
        return className.get();
    }

    
    public void setClassname(String className) {
        this.className.set(className);
    }
    
    
    public String getTime() {
        return time.get();
    }

   
    public void setTime(String time) {
        this.time.set(time);
    }
    
    
    public String getStatus() {
        return status.get();
    }

   
    public void setStatus(String status) {
        this.status.set(status);
    }
    
    
    
    @Override
    
    public String toString() {
        return getId()+ "  " + getClassName()+ "  " + getTime()+ "  " + getStatus();
    }
    
}
