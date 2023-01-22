/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class contact {
    String Official_phone;
    String Official_email;
    String Personal_phone;
    String Personal_email;
    
          
    
    public contact(){
        this.Official_phone = "";
        this.Official_email = "";
        this.Personal_phone = "";
        this.Personal_email = "";
    }

    public String getOfficial_phone() {
        return Official_phone;
    }

    public void setOfficial_phone(String Official_phone) {
        this.Official_phone = Official_phone;
    }

    public String getOfficial_email() {
        return Official_email;
    }

    public void setOfficial_email(String Official_email) {
        this.Official_email = Official_email;
    }

    public String getPersonal_phone() {
        return Personal_phone;
    }

    public void setPersonal_phone(String Personal_phone) {
        this.Personal_phone = Personal_phone;
    }

    public String getPersonal_email() {
        return Personal_email;
    }

    public void setPersonal_email(String Personal_email) {
        this.Personal_email = Personal_email;
    }


    
}
