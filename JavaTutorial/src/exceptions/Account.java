package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {
	
	//Connection is the lib about db
	// A SQL declaration always need a try/catch or a throws
	public Connection getConn() throws SQLException
	{
		
		String url = "jdbc:mysql://localhost:3306/";
		String user = "daiane";
		String password = "";

		//Creating a variable/object conn type Connection
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public void withDraw(int amount) throws SQLException{
		getConn();
	}

}
