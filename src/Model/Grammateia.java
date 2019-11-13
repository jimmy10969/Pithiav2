/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gloft
 */
public class Grammateia extends User{
    private String etos_pros;
    
    Grammateia(){}
    
    public Grammateia(String username,String password,String fname,String lname,String adress,String tel,Sxolh sxolh,String etos_pros){
        super(username,password,fname,lname,adress,tel,sxolh);
        this.etos_pros = etos_pros;
    }
    
    public String toString(){
        String x = Grammateia.super.getusername() + " " + Grammateia.super.getpassword() + " " + Grammateia.super.getfname() + " " + Grammateia.super.getlname() + " " + Grammateia.super.getadress() + " " + Grammateia.super.gettel() + " " + Grammateia.super.getsxolh().getname() + " " + etos_pros;
        return x;
    }
    
     public void setetos_pros(String etos_pros){
         this.etos_pros = etos_pros;
     }
}
