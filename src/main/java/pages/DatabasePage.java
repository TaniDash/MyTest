package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	Connection connection= null;
	Statement statement = null;
	ResultSet resultSet= null;
	String columnValue= null;
	
	public String getData(String columnName) {

		try {
			// setting the properties for mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlurl= "jdbc:mysql://localhost:3306/october2021";
			String sqlusername="root";
			String sqlpassword= "root";
			String query= "select * from users";
			
			//create connection to our local database//connection is interface
			connection = DriverManager.getConnection(sqlurl, sqlusername, sqlpassword);
			
			//empower connection reference variable to execute queries
			statement = connection.createStatement();
			
			//Deliver the query
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				columnValue= resultSet.getString(columnName);
				return columnValue;
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {		//2 things we can do-
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}		
				}
			}
		}
		return columnValue;
	}
	
	
}
