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


public class Etudiant {
    
    private IntegerProperty etudiant_id;
    private StringProperty first_name;
    private StringProperty last_name;
    private StringProperty mdp;

    public Etudiant() {
        this.etudiant_id = new SimpleIntegerProperty();
        this.first_name = new SimpleStringProperty();
        this.last_name = new SimpleStringProperty();
        this.mdp = new SimpleStringProperty();
    }

    //employee_id
    public int getEtudiantId() {
        return etudiant_id.get();
    }

    public void setEtudiantId(int etudiantId){
        this.etudiant_id.set(etudiantId);
    }

    public IntegerProperty EtudiantIdProperty(){
        return etudiant_id;
    }

    //first_name
    public String getFirstName () {
        return first_name.get();
    }

    public void setFirstName(String firstName){
        this.first_name.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return first_name;
    }

    //last_name
    public String getLastName () {
        return last_name.get();
    }

    public void setLastName(String lastName){
        this.last_name.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return last_name;
    }
    
    public void setMdp(String mdp){
        this.mdp.set(mdp);
    }
    
    private String getMdp(){
        return mdp.get();
    }
    
    public StringProperty mdpProperty(){
        return mdp;
    }
}
