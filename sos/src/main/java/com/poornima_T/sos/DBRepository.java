/**
 * 
 */
package com.poornima_T.sos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

/**
 * @author poornima.tharimela
 *
 */
@Repository
abstract public class DBRepository {

	static Connection connection = null;

	public static Connection getConnection() {

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			connection.setAutoCommit(false);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
