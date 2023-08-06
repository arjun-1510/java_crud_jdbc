package jdbc_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	
	
	
	public static void Update_record() {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id for Update ");
			int id = sc.nextInt();
			
			
			///update 
			
			System.out.println("Enter your Name");
			String name = sc.next();
			System.out.println("Enter your Salary");
			double salary =sc.nextDouble();
			System.out.println("Enter phone Number");
			long phone = sc.nextLong();
			
			PreparedStatement p = con.prepareStatement("update work_out set name=?,salary=?,phone_no=? where id=?");
			
			p.setString(1, name);
			p.setDouble(2, salary);
			p.setLong(3, phone);
			p.setInt(4, id);
			
			p.executeUpdate();
			
			
			System.out.println("Record Updated");
			
					
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
