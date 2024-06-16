package prabhaproject;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class createclass {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/prabhakaran","root","");
		
		 java.sql.Statement smt=conn.createStatement();
		 smt.executeUpdate("insert into firsttable (name , age) values ('peter' , '25')");
		 
		System.out.print("Connected");
		conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}


}