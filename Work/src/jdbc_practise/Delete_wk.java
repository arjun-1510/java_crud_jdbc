package jdbc_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_wk {
	
	
	
	public static void Delete() {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id For Delete");
		int id = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			
			
			PreparedStatement p = con.prepareStatement("delete from work_out where id = ?");
			
			p.setInt(1, id);
			
			p.executeUpdate();
			System.out.println("Record Deleted");
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
