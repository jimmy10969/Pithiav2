/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model ;

import java.io.*;

/**
 *
 * @author jimmy
 */
public class User implements Serializable{     
    private String username;
    private String password;
    private String fname;
    private String lname;
    private String adress;
    private String tel;
    private Sxolh sxolh;
    
    public User(){}
    
    public User(String username,String password,String fname,String lname,String adress,String tel,Sxolh sxolh){
        this.username=username;
        this.password=password;
        this.fname=fname;
        this.lname=lname;
        this.adress=adress;
        this.tel=tel;
        this.sxolh=sxolh;
    }
    
    public void setusername(String username){
        this.username=username;
    }
    
    public void setpassword(String password){
        this.password=password;
    }
    
    public void setfname(String fname){
        this.fname=fname;
    }
    
    public void setlname(String lname){
        this.lname=lname;
    }
    
    public void setadress(String adress){
        this.adress=adress;
    }
    
    public void settel(String tel){
        this.tel=tel;
    }
    
    public void setsxolh(Sxolh sxolh){
        this.sxolh=sxolh;
    }
    
    public String getusername(){
        return username;
    }
    
    public String getpassword(){
        return password;
    }
    
    public String getfname(){
        return fname;
    }
    
    public String getlname(){
        return lname;
    }
    
    public String getadress(){
        return adress;
    }
    
    public String gettel(){
        return tel;
    }
    
    public Sxolh getsxolh(){
        return sxolh;
    }
    public boolean validate(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
    
    public String toString(){
        String x = getusername() + " " + getpassword() + " " + getfname() + " " + getlname() + " " + getadress() + " " + gettel() + " " + getsxolh().getname();
        return x;
    }
}
