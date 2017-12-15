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


public class Note {
    
    private IntegerProperty note_id;
    private IntegerProperty etudiant_id;
    private IntegerProperty cours_id;
    private StringProperty date;

    public Note() {
        this.note_id = new SimpleIntegerProperty();
        this.etudiant_id = new SimpleIntegerProperty();
        this.cours_id = new SimpleIntegerProperty();
        this.date = new SimpleStringProperty();
    }

    //employee_id
    public int getEmployeeId() {
        return etudiant_id.get();
    }

    public void setEmployeeId(int etudiantId){
        this.etudiant_id.set(etudiantId);
    }

    public IntegerProperty employeeIdProperty(){
        return etudiant_id;
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

    public String getDate(){
        return date.get();
    }
    
    public void setDate(String date){
        this.date.set(date);
    }
    
    public StringProperty dateProperty(){
        return date;
    }

}
