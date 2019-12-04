/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import java.io.*;
/**
 *
 * @author jimmy
 */
public class Idryma {
    private String name;
    private ArrayList<Sxolh> sxoles = new ArrayList<Sxolh>();
    private ArrayList<User> xrhstes = new ArrayList<User>();
    private ArrayList<Mathima> mathimata = new ArrayList<Mathima>();
    private ArrayList<Dhlwsh> dhlwseis = new ArrayList<Dhlwsh>(); 
 
    public Idryma(String name){
    this.name=name;}
    
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    
      Sxolh IT = new Sxolh(1,"Pliroforiki","it@ihu.gr","2310123456");
      Sxolh GEO = new Sxolh(2,"Geoponia","geo@ihu.gr","2310123467");
      Sxolh FOOD = new Sxolh(1,"Texnologia trofimwn","food@ihu.gr","2310123479");
      
        Kathigitis K1 = new Kathigitis("it004586","0000","Makis","Condatos","Thessaloniki","2310201201",IT,"2001","004586");
        Kathigitis K2 = new Kathigitis("it004487","0000","Diogenis","Anthellis","Thessaloniki","2310201202",IT,"2001","004487");
        Kathigitis K3 = new Kathigitis("it004388","0000","Vissarion","Antoniotis","Thessaloniki","2310201203",IT,"2001","004388");
        Kathigitis K4 = new Kathigitis("it004289","0000","Yanni","Terzas","Thessaloniki","2310201204",IT,"2001","004289");
        Kathigitis K5 = new Kathigitis("it004580","0000","Mathaios ","Sperou","Thessaloniki","2310201205",IT,"2001","004580");
        Foititis F1= new Foititis("it174886","0000","Jim","Carrey","Thessaloniki","2310123456",IT,"2017",0,"174886");
        Grammateia G1 = new Grammateia("IT","0000","Michael","Jordan","Thessaloniki","2310123456",IT,"2017");
        Mathima M1 =new Mathima("1","mixaniki logismikou",K1,5);
        Dhlwsh D1 = new Dhlwsh(F1,M1,2017,7);
        public  void create(){
        
        
        xrhstes.add(K1);
        xrhstes.add(K2);
        xrhstes.add(K3);
        xrhstes.add(K4);
        xrhstes.add(K5);
        xrhstes.add(F1);
        xrhstes.add(G1);
        
        mathimata.add(M1);
        dhlwseis.add(D1);
        
        
               
    }
    public void savexrhstes(){
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("xrhstes.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(xrhstes);  
              fos.close();  
              oos.close();                 
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    public void loadxrhstes(){
          try  
          {               
              //Deserialization 
              FileInputStream fis=new FileInputStream("xrhstes.txt");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
              xrhstes=(ArrayList)ois.readObject();  
                
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    public ArrayList<User> getUsers(){
        return xrhstes;
    }
    public void saveMathimata(){
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("mathimata.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(mathimata);  
              fos.close();  
              oos.close();                 
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    
    public void loadMathimata(){
          try  
          {               
              //Deserialization 
              FileInputStream fis=new FileInputStream("mathimata.txt");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
              mathimata=(ArrayList)ois.readObject();  
                
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    
    public ArrayList<Mathima> getMathimata(){
        return mathimata;
    }
    
    public void savedhlwseis(){
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("dhlwseis.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(dhlwseis);  
              fos.close();  
              oos.close();                 
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    
    public void loaddhlwseis(){
          try  
          {               
              //Deserialization 
              FileInputStream fis=new FileInputStream("dhlwseis.txt");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
              dhlwseis=(ArrayList)ois.readObject();  
                
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
    }
    public ArrayList<Dhlwsh> getDhlwseis(){
        return dhlwseis;
    }
    public void showusers(){
        for (int i=0;i<xrhstes.size();i++){
            System.out.println(xrhstes.get(i));
        }
    }
    public void addUser(User user){
        xrhstes.add(user);
    }
    public void addMathima(Mathima mathima){
        mathimata.add(mathima);
    }
    public void addDhlwsh(Dhlwsh dhlwsh){
        dhlwseis.add(dhlwsh);
    }
    public void setdhlwseis(ArrayList<Dhlwsh> dhl){
        dhlwseis=dhl;
    }
    public void setxrhstes(ArrayList<User> acc){
        xrhstes=acc;
    }
    
}

