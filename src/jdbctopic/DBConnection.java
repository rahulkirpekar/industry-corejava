package jdbctopic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	// 1) Make Credential
	private static final String URLNAME    ="jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME   ="root";
	private static final String PASSWORD   ="root";
	
	// 2) create DbConnection method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) Load DriverClass
			Class.forName(DRIVERCLASS);
			// 4) pass credential into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			// 5) validate connection object
			if (conn!=null) 
			{
				System.out.println("Db connected : " + conn);
			} else 
			{
				System.out.println("Db not connected : " + conn);
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
