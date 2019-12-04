    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author jimmy
 */
public class Mathima implements Serializable{    
    private String id;
    private String name;
    private Kathigitis kath;
    private int examino;
    private ArrayList<Dhlwsh> dhlwseis = new ArrayList<Dhlwsh>();
    
   public Mathima(){      
   }
    public Mathima(String id,String name,Kathigitis kath,int examino)
    {
    this.id=id;
    this.name=name;
    this.kath=kath;
    this.examino=examino;
    
    }
    public Mathima(String id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public String getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public Kathigitis getKath() {
        return kath;
    }
 
    public int getExamino() {
        return examino;
    }
 
    
 
    public void setId(String id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setKath(Kathigitis kath) {
        this.kath = kath;
    }
 
    public void setExamino(int examino) {
        this.examino = examino;
    }
 
    
   
    
    
 }

