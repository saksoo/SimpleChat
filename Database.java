package chatapplet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Database {
	
	java.sql.Connection connection;
	String DB_URL,username,password,T;
	
	Database() {
		try { // Connection to Database
	        DB_URL = "jdbc:mysql://db4free.net:3306/saksoo";
	        username = "saksoo";
	        password = "saksoo3377";
	        T = "1000";

	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection(DB_URL, username, password);
	        System.out.println("Database connection successful to: " + DB_URL); 
		}
		catch(ClassNotFoundException  e){
			e.printStackTrace();
			throw new IllegalArgumentException(
					"Cannot connect to database. JDBC drivers missing.");
		} 
		catch (SQLException e) {
			throw new IllegalArgumentException("Cannot connect to database: "
					+ DB_URL + ". Invalid database information: "
					+ e.getMessage());
		}
		
		System.out.println("********************** Database object has been created! ***************************");
		
	}
	
	
	public void close() {
		try {
			connection.close();
			System.out.println("Database connection closed from: " + DB_URL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletemessages(){
	    try{
	            String query = "delete from comments";
	            PreparedStatement preparedStmt;
	            preparedStmt = connection.prepareStatement(query);
	            preparedStmt.executeUpdate();
	        }  
	        catch(SQLException e){    
	        }   
	}
	
}



