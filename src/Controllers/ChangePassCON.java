package Controllers;

import View.*;
import Model.*;
import java.util.*;

public class ChangePassCON {
    private ChangePassUI PassUI;    
    private User user;
    private Idryma ihu = new Idryma("IHU"); 
    private ArrayList<User> xrhstes;
    
    public ChangePassCON(User user) {       
        this.user=user;
        ihu.loadxrhstes();        
        xrhstes =ihu.getUsers();
        PassUI = new ChangePassUI(this,user);
        PassUI.setVisible(true);
    }          
    
    public void setUserPass(String Pass)
    {
        for ( int i =0;i<xrhstes.size();i++){
            if (user.getusername().equals(xrhstes.get(i).getusername())){
                xrhstes.get(i).setpassword(Pass);
            }
            ihu.setxrhstes(xrhstes);
            ihu.savexrhstes();
        }
    }
    
    public User getUser() { 
       return user;
    }
    
   
}