
package Controllers;

import View.*;
import Model.*;
import java.util.*;

public class LoginCΟΝ {
    private LoginUI uiLogin;
    private Idryma ihu = new Idryma("IHU");    
    private ArrayList <User> accounts ;
    private User user;
    
    public LoginCΟΝ() {    
               
        ihu.loadxrhstes();        
        accounts =ihu.getUsers();
        uiLogin = new LoginUI(this);
        uiLogin.setVisible(true);
    }          
    
    public User Login(String username, String password) {
        user = null;
        for (int i=0;i<accounts.size();i++) {
            if (accounts.get(i).validate(username,password)){                
                user=accounts.get(i);
                return user;
            }
        }         
        return null;
    }           
        
    
    public User getUser() { 
       return user;
       
    }
}
