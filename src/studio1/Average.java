package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for n1: ");
		int n1 = in.nextInt();
		System.out.println("Enter value for n2: ");
		int n2 = in.nextInt();
		int sum = n1 + n2;
		double average = sum / 2.0;
		System.out.print("The average is " + average);
	}

}
