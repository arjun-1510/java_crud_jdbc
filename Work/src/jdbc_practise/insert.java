package jdbc_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
	
	
	
	
	
	public static void Insert() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			
			
			
			
			///insert your data
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("How many data  you want to Insert?");
			int data = sc.nextInt();
			
			
			
			
			
			
			
			PreparedStatement p = con.prepareStatement("insert into work_out values(?,?,?,?)");
			
			
			
			for(int i=1;i<=data;i++) {
				
				
				System.out.println("Enter your id");
				int id = sc.nextInt();
				System.out.println("Enter your Name");
				String name = sc.next();
				System.out.println("Enter your salary");
				Double salary = sc.nextDouble();
				System.out.println("Enter your Phone Number");
				long ph = sc.nextLong();
				
				
				p.setInt(1, id);
				p.setString(2, name);
				p.setDouble(3, salary);
				p.setLong(4, ph);
				
				
				p.addBatch();
				
				
			}
			p.executeBatch();
			System.out.println("Data Insert");
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	public static void search() {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Id"); 
		int id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			
			
			
			
			
			
			
			
			PreparedStatement p = con.prepareStatement("select * from work_out");
			
			
			
			ResultSet rs=p.executeQuery();
			
			int count=0;
			
			while(rs.next()) {
				System.out.println("Id is :"+rs.getInt(1));
				System.out.println("Name is :"+rs.getString(2));
				System.out.println("Salary is :"+rs.getDouble(3));
				System.out.println("Phone Number is :"+rs.getLong(4));
				
			}
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
