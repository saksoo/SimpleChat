package chatapplet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Database {
	
	java.sql.Connection connection;
	String DB_URL,username,password,T;
	
	// Queries 
	private final String deleteAll = "delete from comments";
	private final String insertRec = "INSERT INTO comments (name,sxolio,date) VALUES (?, ?, ?)";
	private final String selectAll = "SELECT name,sxolio,date FROM comments ";
	
	//Locks
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private final Lock read = lock.readLock();
	private final Lock write = lock.writeLock();
	
	
	Database() {
		try { // Connection to Database
	        DB_URL = "jdbc:mysql://db4free.net:3306/saksoo";
	        username = "tt";
	        password = "tt";
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
	    	write.lock();
            PreparedStatement preparedStmt;
            preparedStmt = connection.prepareStatement(deleteAll);
            preparedStmt.executeUpdate();
        }  
        catch(SQLException e){    
        } 
	    finally {
	    	write.unlock();
	    }
	}
	
	
	public void insertdb(String name,String message){
		try {
			write.lock();
            PreparedStatement s = (PreparedStatement) connection.prepareStatement(insertRec);
            s.setString(1, name);
            s.setString(2, message);
            s.setTimestamp(3, new java.sql.Timestamp(System.currentTimeMillis()));
            s.executeUpdate();    
		} 
		catch (SQLException e) {
		}               
		finally {
			write.unlock();
		}
		
	}
	
	public ResultSet selectalldb(){
		try {
			read.lock();
	        ResultSet set;
	        PreparedStatement pre = connection.prepareStatement(selectAll);
	        set = pre.executeQuery();
	        return set;
		}
		catch(SQLException e){
			return null;
		}
		
		finally {
			read.unlock();
		}
	}
	
	
}



