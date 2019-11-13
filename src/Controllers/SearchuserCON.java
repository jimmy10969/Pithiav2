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

public class SearchuserCON {
    
    private SearchuserUI uiSUser;
    private Idryma ihu = new Idryma("IHU");    
    private ArrayList <User> accounts ;
    private User user;
    
    public SearchuserCON() {    
               
        ihu.loadxrhstes();        
        accounts =ihu.getUsers();
        uiSUser = new SearchuserUI(this);
        uiSUser.setVisible(true);
    }
    
    public void search(String username){
        for (int i=0;i<accounts.size();i++){
            if (username==accounts.get(i).getusername()){
                user=accounts.get(i);
            }
        }
        
    }
    public User search1(String username) {
        user = null;
        for (int i=0;i<accounts.size();i++) {
            if (accounts.get(i).getusername().equals(username)){                
                user=accounts.get(i);
                return user;
            }
        }         
        return null;
    }
    public User getUser(){
        return user;
    }
}
