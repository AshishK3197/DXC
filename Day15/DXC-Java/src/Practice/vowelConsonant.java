package Practice;

import java.util.Scanner;

public class vowelConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char Alphabet;
		
		System.out.println("Enter an Alphabet: ");
		
		Alphabet = sc.next().charAt(0);
		
		if (Alphabet =='a' || Alphabet =='e' || Alphabet =='i' || Alphabet == 'o' || Alphabet == 'u' || Alphabet =='A' || Alphabet == 'E' || Alphabet =='I' || Alphabet=='O' || Alphabet =='U') {
			
			System.out.println("The entered alphabet is a vowel");
		}
		else
		{
			System.out.println("The entered alphabet is a Consonant");
		}

	}

}
