
package Model;
import java.util.ArrayList;

public class Theoria extends Mathima{
    private ArrayList<Theoria> proapaitoumena = new ArrayList<Theoria>();
    public Theoria(String kwdikos, String titlos) {
        super(kwdikos, titlos);
    }
    public Theoria() {        
    }
    public void addProapaitoumeno(Theoria theoria) {
        proapaitoumena.add(theoria);
    }
    
    public ArrayList<Theoria> getProapaitoumena() {
        return proapaitoumena;
    }

    @Override
    public String toString() {
        return "Theoria{ " + super.toString();
    }
   
    
}
