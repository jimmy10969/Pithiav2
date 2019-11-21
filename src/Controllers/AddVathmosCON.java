/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import View.*;
import java.util.ArrayList;

/**
 *
 * @author jimmy
 */
public class AddVathmosCON {
    private AddVathmosUI uiVathmos;
    private Kathigitis user;
    private Idryma ihu = new Idryma("IHU");
    private ArrayList <Mathima> mathimata;
    private ArrayList<Mathima> mathkat = new ArrayList<Mathima>();    
    private ArrayList <Dhlwsh> dhlwseis;
    private ArrayList<String> foitites= new ArrayList<String>();  
    
    
    public AddVathmosCON(Kathigitis kath) {    
        this.user=kath;       
        ihu.loadMathimata();
        ihu.loaddhlwseis();
        mathimata=ihu.getMathimata();
        dhlwseis=ihu.getDhlwseis();        
        user.setmath(mathimata);
        mathkat=user.getmath();
        
        
        
        uiVathmos = new AddVathmosUI(this);
        uiVathmos.setVisible(true);
    
    }
    
        public ArrayList<Mathima> getMathimata(){
        return mathkat;
    }
    public ArrayList<String> getFoitites(){
        return foitites;
    }
    public void setmathites(String mathima){
        for (int i=0;i<dhlwseis.size();i++){
            if(mathima.equals(dhlwseis.get(i).getMathima().getName())&&dhlwseis.get(i).getvathmos()==-1){
                foitites.add(dhlwseis.get(i).getFoititis().getusername());
            }
        }
    }
    
    public void setvathmos(String mathima,String foititis,double vathmos){
        for(int i=0;i<dhlwseis.size();i++){
            if(mathima.equals(dhlwseis.get(i).getMathima().getName())){
                if (foititis.equals(dhlwseis.get(i).getFoititis().getusername())) {
                    dhlwseis.get(i).setvathmos(vathmos);
                    
                }
                
            }
            ihu.setdhlwseis(dhlwseis);
            ihu.savedhlwseis();
        }
    }
}
