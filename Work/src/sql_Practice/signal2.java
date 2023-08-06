package sql_Practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class MetroStation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, String> green_line = new HashMap();
		Map<String, String> red_line = new HashMap();

		green_line.put("p1", "A");
		green_line.put("p2", "B");
		green_line.put("J1", "C");
		green_line.put("p4", "D");
		green_line.put("J2", "E");
		green_line.put("p5", "F");
		green_line.put("J3", "G");
		green_line.put("p6", "H");

		red_line.put("p1", "I");
		red_line.put("p2", "J");
		red_line.put("J1", "C");
		red_line.put("p4", "L");
		red_line.put("J2", "E");
		red_line.put("p5", "N");
		red_line.put("J3", "G");
		red_line.put("p6", "P");

		boolean res = true;
		do {
			System.out.println("1.Display Common Junc\n2.Find Varun\n3.Exit");
			int user = sc.nextInt();
			switch (user) {
			case 1: {// Finding Common Junc
				// We know that 3 Junction name is J1 and J2 And J3
				if (red_line.containsKey("J1") && green_line.containsKey("J1") && red_line.containsKey("J2")
						&& green_line.containsKey("J2") && red_line.containsKey("J3") && green_line.containsKey("J3")) {

					for (Map.Entry entry : green_line.entrySet()) {
						if (entry.getKey().equals("J1")) {
							System.out.println(entry.getValue());
						}

						if (entry.getKey().equals("J2")) {
							System.out.println(entry.getValue());
						}

						if (entry.getKey().equals("J3")) {
							System.out.println(entry.getValue());
						}
					}
				}

				break;
			}
			case 2: {//Varun is Standing in J3
				green_line.remove("J3");
				red_line.remove("J3");
				
				green_line.put("varun","G");
				red_line.put("varun","G");
				
				if(green_line.containsKey("varun")&& red_line.containsKey("varun"))
					System.out.println("Varun is Present in J3");
				
				break;
			}
			case 3: {
				res=false;
				break;
			}
			}
		
			
			green_line.put("J3", "G");
			red_line.put("J3","G");
		} while (res);
		System.out.println("\t\t\tThank You");
	}
}