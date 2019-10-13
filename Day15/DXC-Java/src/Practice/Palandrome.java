package Practice;

import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any String: ");
		
		String Palin = sc.nextLine();
		
		String PalinRev = "";
		
		for(int i = Palin.length()-1 ;i >=0; i--) {
			
			 PalinRev = PalinRev + Palin.charAt(i);
		}
		
		if (Palin.equals(PalinRev)) {
			System.out.println("The entered String " + Palin + " is a palindrome");
		}
		else
			System.out.println("The entered String " + Palin + " is not a palindrome");

	}

}
