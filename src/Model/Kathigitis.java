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
public class Kathigitis extends User {
    static final long serialVersionUID = 1L;
    private String etos_pros;
    private String am;
    private ArrayList<Mathima> mathimata= new ArrayList<Mathima>();
    
    public Kathigitis(){}
    
    public Kathigitis(String username,String password,String fname,String lname,String adress,String tel,Sxolh sxolh,String etos_pros,String am){
        super(username,password,fname,lname,adress,tel,sxolh);
        this.etos_pros = etos_pros;
        this.am = am;
    }
    
    public String toString(){
        String x = Kathigitis.super.getusername() + " " + Kathigitis.super.getpassword() + " " + Kathigitis.super.getfname() + " " + Kathigitis.super.getlname() + " " + Kathigitis.super.getadress() + " " + Kathigitis.super.gettel() + " " + Kathigitis.super.getsxolh().getname() + " " + etos_pros + " " + am;
        return x;
    }
    
    public void setetos_pros(String etos_pros){
        this.etos_pros = etos_pros;
    }
    public void setam(String am){
        this.am = am;
    }
    public void setmath(ArrayList<Mathima> math){
        for(int i=0;i<math.size();i++){
            if(math.get(i).getKath().getusername().equals(this.getusername())){
                mathimata.add(math.get(i));
            }
        }
    }
    public ArrayList<Mathima> getmath(){
        return mathimata;
    }
    public String getetos(){
        return etos_pros;
    }
    public String getam(){
        return am;
    }
}