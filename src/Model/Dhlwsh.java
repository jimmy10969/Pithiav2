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
    
    private String hmeromDilwsis;    
    private String hmeromExetasis;
    private String ergasia;
    private String minima;
   
    
    public Dhlwsh(Foititis foititis,Mathima mathima,int etos,double vathmos){
        this.foititis=foititis;
        this.mathima=mathima;
        this.etos=etos;
        this.vathmos=vathmos;
        
        
    }
    
    public Dhlwsh(String hmeromDilwsis,Foititis foititis,Mathima mathima,String ergasia,String minima){
        this.hmeromDilwsis=hmeromDilwsis;        
        this.foititis=foititis;
        this.mathima=mathima;
        this.ergasia=ergasia;
        this.minima=minima;
    }
    
    public Dhlwsh(String hmeromExetasis,Foititis foititis,Mathima mathima,double vathmos,String ergasia){
        this.hmeromExetasis=hmeromExetasis;        
        this.foititis=foititis;
        this.mathima=mathima;
        this.vathmos=vathmos;
        this.ergasia=ergasia;
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
    
    public String getMinima(){
        return minima;
    }
    public String getErgasia(){
        return ergasia;
    }

    public String getHmeromDilwsis() {
        return hmeromDilwsis;
    }

    public String getHmeromExetasis() {
        return hmeromExetasis;
    }
    
    public double getVathmos() {
        return vathmos;
    }

    
    public void setVathmos(double vathmos){
        this.vathmos=vathmos;
    }
    
     @Override
    public String toString() {
        return ergasia+" "+ foititis.getAM()+ " " + mathima.getName()+ " " +hmeromDilwsis+" " +minima+ " " + vathmos;
    }
}
