package Practice;

import java.util.Scanner;

public class leapDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  year;
		
		System.out.println("Enter any year:");
		
		year = sc.nextInt();
		
		if (year % 4 ==0) {
			
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
					
					System.out.println("The given year " + year + " is a leap year");
				}
				
				else
					System.out.println("The given year " + year + "is not a leap year");
			}
			
			else
				System.out.println("The given year " + year + " is a leap year");
		}
		else
			System.out.println("The given year " + year + "is not a leap year");
			

	}

}
