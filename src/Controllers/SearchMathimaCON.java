/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author jimmy
 */

import Model.*;

import View.*;
import java.util.ArrayList;

public class SearchMathimaCON {
    
    private SearchMathimaUI uiMath;
    private Idryma ihu = new Idryma("IHU");    
    private ArrayList <Mathima> mathimata ;
    private Mathima  mathima;
    private Grammateia grammateia;
    private ArrayList<User> kathigites=new ArrayList<User>();
    
    
    public SearchMathimaCON(Grammateia grammateia) {    
        this.grammateia=grammateia;  
        ihu.loadxrhstes();
        ArrayList<User> users;
        users=ihu.getUsers();
        for (int i=0;i<users.size();i++){
            if(users.get(i) instanceof Kathigitis){
                kathigites.add(users.get(i));
            }
        }
        ihu.loadMathimata();
        mathimata =ihu.getMathimata();
        uiMath = new SearchMathimaUI(this,grammateia);
        uiMath.setVisible(true);
    }
    
    public void search(String search){
        for (int i=0;i<mathimata.size();i++){
            if (search==mathimata.get(i).getName()){
                mathima=mathimata.get(i);
            }
        }
        
    }
    public Mathima search1(String search) {
        mathima = null;
        for (int i=0;i<mathimata.size();i++) {
            if (mathimata.get(i).getName().equals(search)){                
                mathima=mathimata.get(i);
                return mathima;
            }
        }         
        return null;
    }
    public Mathima getMathima(){
        return mathima;
    }
    public ArrayList<User> getKathigites(){
        return kathigites;
    }
    public ArrayList<Mathima> getMathimata(){
        return mathimata;
    }
    public void addmathima(Mathima math1){
        ihu.addMathima(math1);
        ihu.saveMathimata();
        ihu.loadMathimata();
        mathimata =ihu.getMathimata();
        
    }
}
