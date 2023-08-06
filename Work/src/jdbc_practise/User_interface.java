package jdbc_practise;

import java.util.Scanner;

import fetching.Searching;

public  class User_interface {
	static boolean b=false;
	
	static Scanner sc = new Scanner(System.in);

	public static void ui() {
		// TODO Auto-generated method stub
		
		
		
		do {
			
			
			System.out.println("Welcome to my Programming world");
			
			
			System.out.println("1.Add Employee\n2.Searching Details\n3.Upadte\n4.Delete\n5.Exit");
			
			System.out.println("Enter your Selection");
			int user_Inpute = sc.nextInt();
			
			switch(user_Inpute) {
			
			case 1: {
				
				b=true;
				
				
				insert.Insert();
				
				
				
				break;}
			case 2: {
				
				
				b=true;
				
				insert.search();
				
				
				
				
				
				break;}
			case 3: {
				
				b=true;
				
				Update.Update_record();
				
				
				
				
				
				break;}
			case 4: {
				
				b=true;
				
				
				
				Delete_wk.Delete();
				
				
				
				
				
				
				
				
				break;}
			case 5: {
				
				b=false;
				
				break;}
			}
			
			
			
			
		}while(b);

	}

}
