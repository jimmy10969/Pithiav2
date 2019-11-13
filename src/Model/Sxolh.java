/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.*;


/**
 *
 * @author jimmy
 */
public class Sxolh implements Serializable {
    
    private int id;
    private String name;
    private String email;
    private String tel;
    
    
    
    Sxolh(){}
    
    public Sxolh(int id,String name,String email,String tel){
        this.id=id;
        this.name=name;
        this.email=email;
        this.tel=tel;
    }
    
    public void setid(int id){
        this.id=id;
    }
    
    public void setname(String name){
        this.name=name;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    
    public void settel(String tel){
        this.tel=tel;
    }
    
    public int getid(){
        return id;
    }
    
    public String getname(){
        return name;
    }
    
    public String getemail(){
        return email;
    }
    
    public String gettel(){
        return tel;
    }
    
    
}
