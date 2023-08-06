package Loginandsignup;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc_practise.User_interface;

public class Login {
	
	static Scanner sc = new Scanner(System.in);
	
	
	 
	
	
	
	
	public void User_Login() {
		
		

		System.out.println("\t\tWelcome to Login Page");
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			 
			 
			 PreparedStatement p = con.prepareStatement("Select * FROM student");
			 
			
			 
			 ResultSet result =p.executeQuery();
			 System.out.println("Enter your User_name");
				String user_name = sc.next();
				System.out.println("Enter your Password");
				String Password= sc.next();
				
				while(result.next()) {
					
					
					 if(result.getString("NAME").equals(user_name) && result.getString("PASSWORD").equals(Password) ) {
//						 
						 System.out.println("\t\t***********Login Sucessfully*************");
						 
						 User_interface u = new User_interface();
						 u.ui();
						 
						 
						
						
					 }else {
						 System.err.println("\t\t**************8Login Failed");
					 }
				}
//				
//			 if(result.getString("NAME").equals(user_name)  ) {
//				 
//				 System.out.println("\t\t***********Login Sucessfully*************");
//			 }else {
//				 System.out.println("Login Failed");
//			 }
			 
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		
		
		
		
		
	}
	
	
	
	public void Forgot_password() {
		
		
		System.out.println("Enter your Contact Number");
		String Forgot_number=sc.next();
		
		
		
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			
			PreparedStatement p = con.prepareStatement("select * from student where Contact=?");
			p.setString(1, Forgot_number);
			
			ResultSet rs = p.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(4).equals(Forgot_number)) {
					
					
					
					
					System.out.println("Enter your Otp");
					int otp = otp();
					System.out.println(otp);
					if(otp==sc.nextInt()) {
					
					
						System.out.println("Enter your New Password");
						String New_password = sc.next();
						PreparedStatement p2 = con.prepareStatement("update student set Password=? where Contact=?");
						p2.setString(1, New_password);
						p2.setString(2, Forgot_number);
						p2.executeUpdate();
						System.out.println("Password Updated");
						
					}	
					
					
					
					
					
				}
				else {
					System.err.println("Contact number is Incorrt");
				}
			}
			
			
			
			
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
public static int otp() {
		
		return (int)(Math.random()*9999+99);
	}
	
	
		
		
		
	}

