
package Model;
import java.util.ArrayList;

public class Ergastirio extends Mathima {
    private ArrayList <ErgastiriakoTmima> ergTmima = new  ArrayList<>(3); 
    private Theoria theoria;
    public Ergastirio(String id, String onoma) {
        super(id, onoma);
        //3. Δημιουργία εργαστ. τμημάτων
        ergTmima.add(new ErgastiriakoTmima("T1", 25));
        ergTmima.add(new ErgastiriakoTmima("T2", 25));
        ergTmima.add(new ErgastiriakoTmima("T3", 25));
    }
    public Ergastirio(){
        
    }
    public void  setTheoria(Theoria theoria){
        this.theoria=theoria;
    }
    
    public Theoria getTheoria(){
        return theoria;
    }
    
    
    @Override
    public String toString() {
        return "Ergastirio{ " + super.toString();
    }
}
