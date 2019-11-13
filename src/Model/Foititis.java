/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author Gloft
 */
public class Foititis extends User {
    private String etos_eis;
    private int didaktikes;
    private String am;
    private ArrayList<Dhlwsh> dhlwseis = new ArrayList<Dhlwsh>();

    
    Foititis(){}
    
    public Foititis(String username,String password,String fname,String lname,String adress,String tel,Sxolh sxolh,String etos_eis,int didaktikes,String am){
        super(username,password,fname,lname,adress,tel,sxolh);
        this.etos_eis = etos_eis;
        this.didaktikes = didaktikes;
        this.am = am;
    }
    
    public String toString(){
        String x = Foititis.super.getusername() + " " + Foititis.super.getpassword() + " " + Foititis.super.getfname() + " " + Foititis.super.getlname() + " " + Foititis.super.getadress() + " " + Foititis.super.gettel() + " " + Foititis.super.getsxolh().getname() + " " + etos_eis + " " + didaktikes + " " + am;
        return x;
    }
     public void setetos_pros(String etos_eis){
         this.etos_eis = etos_eis;
     }
     public void setdidaktikes(int didaktikes){
         this.didaktikes = didaktikes;
     }
     public void setam(String am){
         this.am = am;
     }
     public String getEtoss(){
         return etos_eis;
     }
     public int getects(){
         return didaktikes;
     }
     public String getAM(){
         return am;
     }
}
