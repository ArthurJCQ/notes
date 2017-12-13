/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ArthurJCQ
 */
public class DBUtil {

	// Connection
	private static Connection conn = null;

	// Connection String
	private static final String connStr = "jdbc:sqlite:data/sqlite.db";

	// Connect to DB
	public static void dbConnect() throws SQLException, ClassNotFoundException {

		// Establish the Oracle Connection using Connection String
		try {
			conn = DriverManager.getConnection(connStr);
			// requete de test
			/*Statement statement = conn.createStatement();
			 * ResultSet resultSet = statement.executeQuery(
			 * "SELECT libelle FROM cours"); while (resultSet.next()) {
			 * System.out.println("NAME:" + resultSet.getString("LAST_NAME")); }
			 */
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console" + e);
			e.printStackTrace();
			throw e;
		}
	}

	// Close Connection
	public static void dbDisconnect() throws SQLException {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	// DB Execute Query Operation
	public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException {
		// Declare statement, resultSet and CachedResultSet as null
		Statement stmt = null;
		ResultSet resultSet = null;
		CachedRowSetImpl crs = null;
		try {

			dbConnect();
			System.out.println("Select statement: " + queryStmt + "\n");

			// Create statement
			stmt = conn.createStatement();

			// Execute select (query) operation
			resultSet = stmt.executeQuery(queryStmt);

			crs = new CachedRowSetImpl();
			crs.populate(resultSet);
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		} finally {
			if (resultSet != null) {
				// Close resultSet
				resultSet.close();
			}
			if (stmt != null) {
				// Close Statement
				stmt.close();
			}
			// Close connection
			dbDisconnect();
		}
		// Return CachedRowSet
		return crs;
	}

	// DB Execute Update (For Update/Insert/Delete) Operation
	public static void dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
		// Declare statement as null
		Statement stmt = null;
		try {
			// Connect to DB
			dbConnect();
			// Create Statement
			stmt = conn.createStatement();
			// Run executeUpdate operation with given sql statement
			stmt.executeUpdate(sqlStmt);
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeUpdate operation : " + e);
			throw e;
		} finally {
			if (stmt != null) {
				// Close statement
				stmt.close();
			}
			// Close connection
			dbDisconnect();
		}
	}
}
