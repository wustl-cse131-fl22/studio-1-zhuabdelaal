package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner Andy = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = Andy.nextInt();
		
		
		boolean leap = (year%4==0 && (year%100!=0 || year%400==0));
		
		System.out.println("Is it a leap year?: " + leap);
		
	}

}
