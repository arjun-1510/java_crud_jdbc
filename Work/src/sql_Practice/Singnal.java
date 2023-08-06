package sql_Practice;

import java.util.ArrayList;
import java.util.Scanner;

 class Screen {

	int no_of_seats=10;
	static String []seat= {"A1","B2","C4","D6","E7","F8","G9","H10"};
	static Scanner sc=new Scanner(System.in);
	static	ArrayList screen1=new ArrayList();
	static ArrayList screen2=new ArrayList();
	static Screen scr=new Screen();
	public static void main(String[] args) {
		
		for (int i = 0; i < seat.length; i++) {
			screen1.add(seat[i]);
			screen2.add(seat[i]);
		}
	boolean res=true;
	do {
		System.out.println("\t\t\tSelect the Input\n1.Book Seats\n2.Exit");
		int n=sc.nextInt();
		if(n==1)
			scr.bookSeatsforScreen1();
		else if(n==2)
			res=false;
	} while (res);
		System.out.println("\t\t\tThank You");
	}
	public void displayScreen() {
		System.out.println("Screen-1 Seats : "+screen1);
		System.out.println("Screen-2 Seats : "+screen2);
	}
	public void bookSeatsforScreen1() {
		System.out.println("Select the Screen");
		System.out.println("1.Screen-1\n2.Screen-2");
		
		int screen_select=sc.nextInt();
		switch (screen_select) {
		case 1: {//Screen-1
			//Display seats in Screen -1
			System.out.println("Screen-1 Seats : "+screen1);
			System.out.println("Select the Seats in Series");
			sc.nextLine();
			String series=sc.nextLine();
			System.out.println("Enter the Seat No");
			String seat_no=sc.nextLine();
			String selected_seats=series+seat_no;
			if(screen1.remove(selected_seats))
				System.out.println("Booked");
			
			System.out.println("Your Seat Number is :"+selected_seats);
			System.out.println("Available Seats");
			System.out.println(screen1);
		break;
		}
		case 2:{
			//Display seats in Screen -1
			System.out.println("Screen-2 Seats : "+screen2);
			System.out.println("Select the Seats in Series");
			sc.nextLine();
			String series=sc.nextLine();
			System.out.println("Enter the Seat No");
			String seat_no=sc.nextLine();
			String selected_seats=series+seat_no;
			if(screen2.remove(selected_seats))
				System.out.println("Booked");
			
			System.out.println("Your Seat Number is :"+selected_seats);
			System.out.println("Available Seats");
			System.out.println(screen2);
			
		break;}
		}
	}
	
	
		
}