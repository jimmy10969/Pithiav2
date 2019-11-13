/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author jimmy
 */
public class Dhlwsh implements Serializable {
    private Foititis foititis;
    private Mathima mathima;
    private double vathmos;
    private int etos;
    
    public Dhlwsh(Foititis foititis,Mathima mathima,int etos,double vathmos){
        this.foititis=foititis;
        this.mathima=mathima;
        this.etos=etos;
        this.vathmos=vathmos;
        
        
    }
    
    public void setFoititis(Foititis foititis){
        this.foititis=foititis;        
    }
    public void setMathima(Mathima mathima){
        this.mathima=mathima;
    }
    public void setvathmos(double vathmos){
        this.vathmos=vathmos;
    }
    public void setetos(int etos){
        this.etos=etos;
    }
    public Foititis getFoititis(){
        return foititis;        
    }
    public Mathima getMathima(){
        return mathima;        
    }
    public double getvathmos(){
        return vathmos;
    }
    public int getetos(){
        return etos;
    }
    
}
