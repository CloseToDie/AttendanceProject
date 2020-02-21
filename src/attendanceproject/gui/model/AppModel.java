/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.model;

import attendanceproject.be.Klasse;
import attendanceproject.be.Student;
import attendanceproject.gui.controller.LoginController;
import attendanceproject.gui.controller.StudentSelectController;
import attendanceproject.gui.controller.StudentViewEditProfileController;
import attendanceproject.gui.controller.StudentViewProfileController;
import attendanceproject.gui.controller.TeacherViewEditProfileController;
import attendanceproject.gui.controller.TeacherViewProfileController;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author kacpe
 */
public class AppModel
{
    private ObservableList<Student> allStudents;
    private ObservableList<Klasse> allClasses;
    private TeacherViewProfileController TeachViewProfileCon;
    private TeacherViewEditProfileController TeachViewEditProfileCon;
    private StudentViewProfileController StudViewProfileCon;
    private StudentViewEditProfileController StudViewEditProfileCon;
    private LoginController LoginCon;
    private StudentSelectController StudSelectCon;
    
    
    public AppModel() throws Exception {

        allStudents = FXCollections.observableArrayList();
        allStudents.addAll(getStudentMockData());

        allClasses = FXCollections.observableArrayList();
        allClasses.addAll(getClassMockData(1));

    }
    
    private  ArrayList<Student> getStudentMockData()
    {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student(0, "kel44f", "Kelly Branson", "2%", "44 Danson street", "4678", "Seattle", "KellyBranson@gmail.com"));
        students.add(new Student(1, "jon56e", "John Bine", "23%", "66 Opera street", "5678", "Las Vegas", "JohnBine@gmail.com"));
        students.add(new Student(2, "Jep30f", "Jeppe Stragsgaard", "5%", "Debelvej 23 ", "8873", "Ribe", "JeppeStragsgaard@gmail.dk"));
        students.add(new Student(3, "Cal44m", "Cal Elmerson", "9%", "89 Forsythe road", "6758", "New York", "CalElmerson@gmail.com"));
        students.add(new Student(4, "Ur88j", "Ursula Vern", "0%","89 Caligula street", "5589", "Chicago", "UrsulaVern@gmail.com"));
        return students;
    }
    
    public  ArrayList<Klasse> getClassMockData(int ver)
    {
        int version = ver;
        ArrayList<Klasse> classes = new ArrayList<>();
        
        if (version == 1)
        {
        classes.add(new Klasse(0, "SDE", "8:00-12:00", "Absent"));
        classes.add(new Klasse(1, "ITO", "12:00-14:00", "Absent"));
        classes.add(new Klasse(2, "DBOS", "14:00-17.30", "Present"));
        classes.add(new Klasse(3, "SCO", "17:30-20:00", "notSet"));
        }
        else if (version == 2)
        {
        classes.add(new Klasse(0, "ITO", "8:00-12:00", "Absent"));
        classes.add(new Klasse(1, "SDE", "12:00-14:00", "Absent"));
        classes.add(new Klasse(2, "SCO", "14:00-17.30", "Present"));
        classes.add(new Klasse(3, "DBOS", "17:30-20:00", "notSet"));
        }
        return classes;
    }
    
    public void setClassMockData(int ver)
    {
        int version = ver;
        ArrayList<Klasse> classes = new ArrayList<>();
        
        if (version == 1)
        {
        classes.add(new Klasse(0, "SDE", "8:00-12:00", "Absent"));
        classes.add(new Klasse(1, "ITO", "12:00-14:00", "Absent"));
        classes.add(new Klasse(2, "DBOS", "14:00-17.30", "Present"));
        classes.add(new Klasse(3, "SCO", "17:30-20:00", "notSet"));
        }
        else if (version == 2)
        {
        classes.add(new Klasse(0, "ITO", "8:00-12:00", "Absent"));
        classes.add(new Klasse(1, "SDE", "12:00-14:00", "Absent"));
        classes.add(new Klasse(2, "SCO", "14:00-17.30", "Present"));
        classes.add(new Klasse(3, "DBOS", "17:30-20:00", "notSet"));
        }
        
        allClasses.clear();
        allClasses.addAll(classes);
    }

    public ObservableList<Student> getAllStudents()
    {
        return allStudents;
    }

    public void setAllStudents(ObservableList<Student> allStudents)
    {
        this.allStudents = allStudents;
    }

    public ObservableList<Klasse> getAllClasses()
    {
        return allClasses;
    }

    public void setAllClasses(ObservableList<Klasse> allClasses)
    {
        this.allClasses = allClasses;
    }

    public TeacherViewProfileController getTeachViewProfileCon()
    {
        return TeachViewProfileCon;
    }

    public void setTeachViewProfileCon(TeacherViewProfileController TeachViewProfileCon)
    {
        this.TeachViewProfileCon = TeachViewProfileCon;
    }

    public TeacherViewEditProfileController getTeachViewEditProfileCon()
    {
        return TeachViewEditProfileCon;
    }

    public void setTeachViewEditProfileCon(TeacherViewEditProfileController TeachViewEditProfileCon)
    {
        this.TeachViewEditProfileCon = TeachViewEditProfileCon;
    }

    public StudentViewProfileController getStudViewProfileCon()
    {
        return StudViewProfileCon;
    }

    public void setStudViewProfileCon(StudentViewProfileController StudViewProfileCon)
    {
        this.StudViewProfileCon = StudViewProfileCon;
    }

    public StudentViewEditProfileController getStudViewEditProfileCon()
    {
        return StudViewEditProfileCon;
    }

    public void setStudViewEditProfileCon(StudentViewEditProfileController StudViewEditProfileCon)
    {
        this.StudViewEditProfileCon = StudViewEditProfileCon;
    }

    public LoginController getLoginCon()
    {
        return LoginCon;
    }

    public void setLoginCon(LoginController LoginCon)
    {
        this.LoginCon = LoginCon;
    }

    public StudentSelectController getStudSelectCon()
    {
        return StudSelectCon;
    }

    public void setStudSelectCon(StudentSelectController StudSelectCon)
    {
        this.StudSelectCon = StudSelectCon;
    }
    
    
    
}
