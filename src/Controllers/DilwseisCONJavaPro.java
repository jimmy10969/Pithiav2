
package Controllers;

import java.util.ArrayList;
import Model.*;

public class DilwseisCONJavaPro {

    public static void main(String[] args) {
        
        // User story 1: Εγγραφή φοιτητή (βλ. Πίνακα 1)
        ArrayList <Foititis> foitites = new  ArrayList<>(3);
        foitites.add(new Foititis("151234", "Αθανασίου", "Κίμων"));
        foitites.add(new Foititis("163217", "Βασιλειάδου", "Δανάη"));
        foitites.add(new Foititis("162278", "Γεωργίου", "Αλκης"));
        
        // User story 2: Εισαγωγή μαθήματος (βλ. Πίνακα 2)
        ArrayList <Mathima> mathimata = new  ArrayList<>();
        Theoria theoriaAS = new Theoria("1205-Θ", "Αντικειμενοστρεφής Προγραμματισμός (Θ)");
        Ergastirio ergastirioAS = new Ergastirio("1205-Ε", "Αντικειμενοστρεφής Προγραμματισμός (E)");
        mathimata.add(theoriaAS);
        mathimata.add(ergastirioAS);        
        
        Theoria theoriaDD = new Theoria("1305-Θ", "Δομές Δεδομένων και Ανάλυση Αλγορίθμων (Θ)");
        Theoria theoriaML = new Theoria("1742-Θ", "Μηχανική Λογισμικού (Θ)");
        
        // User story 3: Εισαγωγή προαπαιτούμενων μαθήματος (βλ. Πίνακα 2)
        theoriaDD.addProapaitoumeno(theoriaAS);
        mathimata.add(theoriaDD);
        theoriaML.addProapaitoumeno(theoriaAS);
        theoriaML.addProapaitoumeno(theoriaDD);
        mathimata.add(theoriaML);
        
        // User story 4: Δήλωση μαθήματος από φοιτητή (βλ. Πίνακα 3)
        // User story 5: Εισαγωγή βαθμολογίας (από γραμματεία)
        foitites.get(0).addDhlwsh(theoriaAS, "20/2/2019"); 
        foitites.get(0).addVathmos(theoriaAS, "15/7/2019", 8.0);
        foitites.get(0).addDhlwsh(theoriaDD, "20/2/2019");        
        foitites.get(0).addDhlwsh(theoriaML, "20/2/2019");
        foitites.get(1).addDhlwsh(ergastirioAS, "20/2/2019");
        foitites.get(1).addDhlwsh(theoriaDD, "20/2/2019");
        foitites.get(1).addDhlwsh(theoriaML, "20/2/2019");
        foitites.get(2).addDhlwsh(theoriaAS, "20/2/2019");
        foitites.get(2).addVathmos(theoriaAS, "20/2/2019", 7.0);
        foitites.get(2).addDhlwsh(theoriaDD, "20/2/2019");
        foitites.get(2).addVathmos(theoriaDD, "20/2/2019", 4.0);
        foitites.get(2).addDhlwsh(theoriaML, "20/2/2019");
        
        
        
        // User story 6: Εκτύπωση Αναλυτικής κατάστασης φοιτητή
        for (Foititis foititis : foitites) {
            System.out.println(foititis);
            foititis.show();
            // εμφανίζει τα στοιχεία του
            // εμφανίζει κάθε μάθημα που δήλωσε και έχει πάρει βαθμό (βλ. Πίνακα 4)
        }
        
    }
     
}
