package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: ");
		int leapYear = in.nextInt();
		int Year = leapYear % 4;
		int Year1 = Year % 400;
	    boolean Year1 = leapYear/ 100;
	    System.out.println()
		
	}

}
