/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBUtil;

/**
 *
 * @author ArthurJCQ & Armand Begue
 */
public class Model {

    public static String searchEtudiant(String etuNom) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM etudiant WHERE nom=" + etuNom;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEtu = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            String prenom = getPrenom(rsEtu);

            //Return employee object
            return prenom;
        } catch (SQLException e) {
            System.out.println("Erreur : " + e);
            //Return exception
            throw e;
        }
    }

    public static String searchNote(int etuID) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT text FROM note WHERE id_etudiant=" + etuID;

        //Execute SELECT statement  
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsNote = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            String note = getNote(rsNote);

            //Return employee object
            return note;
        } catch (SQLException e) {
            System.out.println("Erreur : " + e);
            //Return exception
            throw e;
        }
    }

    public static boolean updateNote(int etuID, String text) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "UPDATE note SET text =\""+ text +"\" WHERE id_etudiant=" + etuID;

        //Execute SELECT statement  
        try {
            //Get ResultSet from dbExecuteQuery method
            DBUtil.dbExecuteQuery(selectStmt);

            return true;
        } catch (SQLException e) {
            System.out.println("Erreur : " + e);
            //Return exception
            //throw e;
            return false;
        }
    }

    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static String getPrenom(ResultSet rs) throws SQLException {
        String prenom = "";

        if (rs.next()) {
            prenom = rs.getString("prenom");
        }
        return prenom;
    }

    public static String getNote(ResultSet rs) throws SQLException {
        String note = "";

        if (rs.next()) {
            note = rs.getString("text");
        }
        return note;
    }

    public static boolean tryLogin(String etuNom, String etuMdp) throws SQLException, ClassNotFoundException {

        String selectStmt = "SELECT * FROM etudiant WHERE nom=\"" + etuNom + "\" AND mdp=\"" + etuMdp + "\"";

        boolean login = false;

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEtu = DBUtil.dbExecuteQuery(selectStmt);

            if (rsEtu.next()) {
                return true;
            } else {
                return false;
            }
            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            //String prenom = getPrenom(rsEtu);

            //Return employee object
        } catch (SQLException e) {

            System.out.println("Erreur : " + e);

            return false;
            //Return exception
            //throw e;

        }

    }

}
