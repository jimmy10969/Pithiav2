/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import View.*;
import java.util.ArrayList;
import java.time.*;

/**
 *
 * @author jimmy
 */
public class DhlwshCON {
    private DhlwshUI uiDilwsh;
    private Idryma ihu = new Idryma("IHU");    
    private ArrayList <Mathima> mathimata;
    private ArrayList <String> mdmathimata= new ArrayList<String>();
    private ArrayList <String> dmathimata= new ArrayList<String>();
    private ArrayList <Dhlwsh> dhlwseis;
    private ArrayList <Dhlwsh> dhlwmena=new ArrayList<Dhlwsh>();
    private ArrayList <Dhlwsh> currentdhlwmena=new ArrayList<Dhlwsh>(); 
    private User user;
    private Mathima mathima;
    private final int year= LocalDate.now().getYear();
    
    public DhlwshCON(Foititis foititis) {    
        this.user=foititis;       
        ihu.loadMathimata();
        ihu.loaddhlwseis();
        mathimata=ihu.getMathimata();
        dhlwseis=ihu.getDhlwseis();        
        
        dhlwmena();
        midhlwmena();
        currentdhlwsh();
        
        uiDilwsh = new DhlwshUI(this,foititis);
        uiDilwsh.setVisible(true);
    
    }
    
    public ArrayList<String> getMathimata(){
        return mdmathimata;
    }
    public ArrayList<Dhlwsh> getDhlwseis(){
        
        return dhlwseis;
    }
    public ArrayList<Dhlwsh> getDhlwmena(){
        
        return dhlwmena;
    }
    
    public void adddhlwsh(String name) {
        mathima = null;
        for (int i=0;i<mathimata.size();i++) {
            if (mathimata.get(i).getName().equals(name) ){                
                Dhlwsh dhlwsh = new Dhlwsh((Foititis)user,mathimata.get(i),year,-1);                
                ihu.addDhlwsh(dhlwsh);
                ihu.savedhlwseis();
                currentdhlwmena.add(dhlwsh);
            }
        }         
        
    }
    public void dhlwmena(){
        for(int i=0;i<dhlwseis.size();i++){
            //if(foititis.getusername()==(dhlwseis.get(i).getFoititis().getusername())){
            if(dhlwseis.get(i).getFoititis().getusername().equals(user.getusername()) ){
                dhlwmena.add(dhlwseis.get(i));                
            }
        }
    }
    
    public void midhlwmena(){
        for (int j=0;j<dhlwmena.size();j++){
                if(year==dhlwmena.get(j).getetos()||dhlwmena.get(j).getvathmos()>5){
                dmathimata.add(dhlwmena.get(j).getMathima().getName());
                }
        }
        ArrayList <String> mathimat= new ArrayList<String>();
        for (int i=0;i<mathimata.size();i++){
            mathimat.add(mathimata.get(i).getName());            
        }
        mathimat.removeAll(dmathimata);
        mdmathimata=mathimat;    
    }
    
    public int getYear(){
        return year;
    }
    
    public void currentdhlwsh(){
        for(int i=0;i<dhlwmena.size();i++){            
            if(dhlwmena.get(i).getetos()==getYear() ){
                currentdhlwmena.add(dhlwmena.get(i));                
            }
        }
    }
    public ArrayList<Dhlwsh> getcurrent(){
        return currentdhlwmena;
    }
            
        }
    
    

