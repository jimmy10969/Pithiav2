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
public class CreateUserCON {
    private CreateUserUI uiUser;
    private Idryma ihu = new Idryma("IHU");    
    private ArrayList <User> accounts ;
    private User user;
   
    
    public CreateUserCON() {    
               
        ihu.loadxrhstes();        
        accounts =ihu.getUsers();
        uiUser = new CreateUserUI(this);
        uiUser.setVisible(true);
    } 
    
    public void adduser(User user1){
        ihu.addUser(user1);
        ihu.savexrhstes();
        ihu.loadxrhstes();
        accounts =ihu.getUsers();
        
    }
    public void addfoititi(Foititis user1){
        ihu.addUser(user1);
        ihu.savexrhstes();
        ihu.loadxrhstes();
        accounts =ihu.getUsers();
        
    }
    public void addkathigiti(Kathigitis user1){
        ihu.addUser(user1);
        ihu.savexrhstes();
        ihu.loadxrhstes();
        accounts =ihu.getUsers();
        
    }
    
    public boolean check(String username){
        for (int i=0;i<accounts.size();i++){
            if(username.equals(accounts.get(i).getusername())){
                return false;
            }
        }
        return true;
    }
}
