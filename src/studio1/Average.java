package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner Talal =new Scanner(System.in);
		
		
		System.out.println("Input numbers to be averaged");
		
		
		System.out.print("Enter first integer: ");
		int n1 = Talal.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = Talal.nextInt();
		
		double n3 = (n1 + n2)/2.0;
		System.out.println("Average of " + n1 + " and " + n2+ " is "+ n3 );
		
		
	}

}
