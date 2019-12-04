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
    static final long serialVersionUID = 10L;
    private String etos_eis;
    private int didaktikes;
    private String am;
    private ArrayList <Dhlwsh> dilwseis = new  ArrayList<Dhlwsh>();
    private ArrayList<Mathima> perasmena= new ArrayList<Mathima>();
    private ArrayList<Mathima> dilwmena= new ArrayList<Mathima>();

    
    public Foititis(){}
    
    public Foititis(String username,String password,String fname,String lname,String adress,String tel,Sxolh sxolh,String etos_eis,int didaktikes,String am){
        super(username,password,fname,lname,adress,tel,sxolh);
        this.etos_eis = etos_eis;
        this.didaktikes = didaktikes;
        this.am = am;
    }
    
     public Foititis(String arMitroou, String epwnymo, String onoma) {
        super(epwnymo,onoma);
         this.am = arMitroou;
        
    }
    
    /*public String toString(){
        String x = Foititis.super.getusername() + " " + Foititis.super.getpassword() + " " + Foititis.super.getfname() + " " + Foititis.super.getlname() + " " + Foititis.super.getadress() + " " + Foititis.super.gettel() + " " + Foititis.super.getsxolh().getname() + " " + etos_eis + " " + didaktikes + " " + am;
        return x;
    }
    */
      @Override
    public String toString() {
        return "\nFoititis{" + "arMitroou = " + am + ", epwnymo = " + super.getlname()
                + ", onoma = " + super.getfname() + '}';
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
     
     
     
     public void addDhlwsh(Mathima mathima, String hmeromDillwsis) {
        setperasmena();
        setdhlwmena();
        if(!dilwmena.contains(mathima)){
            if(mathima instanceof Theoria){
            Theoria theoria=(Theoria)mathima;
                    if(theoria.getProapaitoumena().isEmpty()){
                        Dhlwsh dhl= new Dhlwsh(hmeromDillwsis,this,mathima,"Δήλωση","Επιτυχής");    
                            dilwseis.add(dhl);
                    }   
                    else{                   
                                      
                    if(perasmena.containsAll(theoria.getProapaitoumena())){
                    Dhlwsh dhl= new Dhlwsh(hmeromDillwsis,this,mathima,"Δήλωση","Επιτυχής");    
                            dilwseis.add(dhl);                            
                        }
                    else{
                        Dhlwsh dhl= new Dhlwsh(hmeromDillwsis,this,mathima,"Δήλωση","Μη επιτυχής");
                            dilwseis.add(dhl);                         
                                            
                        }                  
                    }             
            }
            else if (mathima instanceof Ergastirio){
                Ergastirio ergastirio=(Ergastirio)mathima;
                if(dilwmena.contains(ergastirio.getTheoria())){
                    Dhlwsh dhl= new Dhlwsh(hmeromDillwsis,this,mathima,"Δήλωση","Επιτυχής");    
                    dilwseis.add(dhl);
                }
                else{
                    Dhlwsh dhl= new Dhlwsh(hmeromDillwsis,this,mathima,"Δήλωση","Μη Επιτυχής");    
                    dilwseis.add(dhl);
                }
            }
            
        }
    }
    public void addVathmos(Mathima mathima, String hmeromExetasis, double vathmos) {
        for(int i=0;i<dilwseis.size();i++){
            if(mathima.getName().equals(dilwseis.get(i).getMathima().getName())&&dilwseis.get(i).getMinima().equals("Επιτυχής")){
                Dhlwsh dhl= new Dhlwsh(hmeromExetasis,this,mathima,vathmos,"Βαθμολογια");
                dilwseis.add(dhl);
                break;
            }

        }
        
    }
    public void setperasmena(){
        int l=dilwseis.size();
        for(int i=0;i<l;i++){
            if(dilwseis.get(i).getVathmos()>5){
                perasmena.add(dilwseis.get(i).getMathima());
            }
        }
        
    }
    
    public void setdhlwmena(){
        int l=dilwseis.size();
        for(int i=0;i<l;i++){
            if(dilwseis.get(i).getMathima().equals("Επιτυχής")){
                dilwmena.add(dilwseis.get(i).getMathima());
            }
        }
        
    }
    
    
    public void show(){
        for(int i=0;i<dilwseis.size();i++){
            System.out.println(dilwseis.get(i));
        }
    }
    public String getam(){
        return am;
    }
    
    
    
}
