package Practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		
		int number;
		System.out.println("Enter an integer:");
		
		number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Given number " + number + " is even");
		}
			
			else {
				System.out.println("Given number  " + number + " odd" );
			}
		}
	}

