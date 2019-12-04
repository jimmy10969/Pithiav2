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
    private Grammateia gram;
    private User user;
    
    
    public SearchuserCON(Grammateia grammateia) {    
        gram=grammateia;       
        ihu.loadxrhstes();        
        accounts =ihu.getUsers();
        uiSUser = new SearchuserUI(this);
        uiSUser.setVisible(true);
    }
    
    public User search1(String username) {
        user = null;
        for (int i=0;i<accounts.size();i++) {
            if (accounts.get(i).getusername().equals(username)&&accounts.get(i).getsxolh().getname().equals(gram.getsxolh().getname())){                
                user=accounts.get(i);
                return user;
            }
        }         
        return null;
    }
    public User getUser(){
        return user;
    }
    public void setUser(String username,String password,String fname,String lname,String adress,String tel)
    {
        for ( int i =0;i<accounts.size();i++){
            if (user.getusername().equals(accounts.get(i).getusername())){
                accounts.get(i).setpassword(password);
                accounts.get(i).setadress(adress);
                accounts.get(i).setfname(fname);
                accounts.get(i).setlname(lname);
                accounts.get(i).settel(tel);
            }
            ihu.setxrhstes(accounts);
            ihu.savexrhstes();
            ihu.loadxrhstes();        
            accounts =ihu.getUsers();
        }
    }

    public void deleteuser(String username)
    {
        for ( int i =0;i<accounts.size();i++){
            if (user.getusername().equals(accounts.get(i).getusername())&&accounts.get(i).getsxolh().getname().equals(gram.getsxolh().getname())){
                accounts.remove(i);
            }
            ihu.setxrhstes(accounts);
            ihu.savexrhstes();
            ihu.loadxrhstes();        
            accounts =ihu.getUsers();
        }
    }
}
