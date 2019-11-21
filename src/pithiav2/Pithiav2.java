/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pithiav2;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author jimmy
 */
public class Pithiav2 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<User> accounts = new ArrayList<User>();
    public static User user;
    private static ArrayList<Mathima> mathimata = new ArrayList<Mathima>();
    private static ArrayList<Dhlwsh> dhlwseis = new ArrayList<Dhlwsh>();
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       Idryma ihu = new Idryma("IHU");
        
        //ihu.create();
        //ihu.savexrhstes();
        //ihu.saveMathimata();
        ihu.loadxrhstes();
        ihu.loadMathimata();
        //ihu.savedhlwseis();
        ihu.loaddhlwseis();
        dhlwseis=ihu.getDhlwseis();
        mathimata=ihu.getMathimata();
        
        accounts=ihu.getUsers();
        for (int i =0;i<accounts.size();i++){
             System.out.println(accounts.get(i));
         }
         System.out.println(accounts.get(7) instanceof Foititis);
         
         for (int i =0;i<mathimata.size();i++){
             System.out.println(mathimata.get(i).getName());
         }
         for (int i =0;i<dhlwseis.size();i++){
             System.out.println(dhlwseis.get(i).getvathmos());
         }
         
         
         
        
      
        
    }
    
}
