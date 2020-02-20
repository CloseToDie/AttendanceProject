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
public abstract class Person 
{
    private int id;
    private final SimpleStringProperty userName;
    private final SimpleStringProperty fullName;
    private final SimpleStringProperty addres;
    private final SimpleStringProperty postCode;
    private final SimpleStringProperty city;
    private final SimpleStringProperty email;
    
    /**
     * 
     * @param id
     * @param userName
     * @param fullName
     * @param addres
     * @param postCode
     * @param city
     * @param email 
     */
    public Person(int id, String userName, String fullName, String addres, String postCode, String city, String email) 
    {
        this.id = id;
        this.userName = new SimpleStringProperty(userName);
        this.fullName = new SimpleStringProperty(fullName);
        this.addres = new SimpleStringProperty(addres);
        this.postCode = new SimpleStringProperty(postCode);
        this.city = new SimpleStringProperty(city);
        this.email = new SimpleStringProperty(email);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * get username
     * @return 
     */
    public String getUserName() {
        return userName.get();
    }

    /**
     * set persons username
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName.set(userName);
    }
    
    /**
     * get the persons full name
     * @return 
     */
    public String getFullName() {
        return fullName.get();
    }

    /**
     * set the persons full name
     * @param fullName 
     */
    public void setFullName(String fullName) {
        this.fullName.set(fullName);
    }
    
    /**
     * get persons addres
     * @return 
     */
    public String getAddres() {
        return addres.get();
    }

    /**
     * 
     * @param addres 
     */
    public void setaddres(String addres) {
        this.fullName.set(addres);
    }
    
    /**
     * get persons postcode
     * @return 
     */
    public String getPostCode() {
        return postCode.get();
    }

    /**
     * 
     * @param postCode 
     */
    public void setPostCode(String postCode) {
        this.postCode.set(postCode);
    }
    
    /**
     * get persons city
     * @return 
     */
    public String getCity() {
        return city.get();
    }

  
     /**
      * 
      * @param city 
      */
    public void setCity(String city) {
        this.city.set(city);
    }
    
    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email.get();
    }
    
      /**
       * 
       * @param email 
       */
    public void setEmail(String email) {
        this.email.set(email);
    }
    
    
    @Override
    
    public String toString() {
        return getUserName() + "  " + getFullName() + "  " + getAddres() + "  " + getAddres() + "  " + getPostCode() + "  " + getCity();
    }
    
    
    
    
    
    
   
    
 
  
}
