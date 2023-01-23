/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class personal {
    private String NUID;
    private String First_Name;
    private String Last_Name;
    private String College_Name;
    contact personal;
    contact official;
    address current ;
    address permanent;
    

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getCollege_Name() {
        return College_Name;
    }

    public void setCollege_Name(String College_Name) {
        this.College_Name = College_Name;
    }

   

    public address getCurrent() {
        return current;
    }

    public void setCurrent(address current) {
        this.current = current;
    }

    public address getPermanent() {
        return permanent;
    }

    public void setPermanent(address permanent) {
        this.permanent = permanent;
    }

    public contact getOfficial() {
        return official;
    }

    public void setOfficial(contact official) {
        this.official = official;
    }

    public contact getPersonal() {
        return personal;
    }

    public void setPersonal(contact personal) {
        this.personal = personal;
    }

   
    
    public personal(){
        this.NUID = "";
        this.First_Name = "";
        this.Last_Name = "";
        this.College_Name = "";
        this.official = new contact();
        this.personal=new contact();
        this.current = new address();
        this.permanent = new address();
        
    
}
    
    
}
