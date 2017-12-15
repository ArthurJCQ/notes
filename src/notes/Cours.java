/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;
import javafx.beans.property.*;

/**
 *
 * @author ArthurJCQ
 */


public class Cours {
    
    private IntegerProperty cours_id;
    private StringProperty libelle;

    public Cours() {
        this.cours_id = new SimpleIntegerProperty();
        this.libelle = new SimpleStringProperty();
    }

    //employee_id
    public int getCoursId() {
        return cours_id.get();
    }

    public void setCoursId(int etudiantId){
        this.cours_id.set(etudiantId);
    }

    public IntegerProperty coursIdProperty(){
        return cours_id;
    }

    //libele
    public String getLibelle () {
        return libelle.get();
    }

    public void setLibelle(String libelle){
        this.libelle.set(libelle);
    }

    public StringProperty libelleProperty() {
        return libelle;
    }   
}