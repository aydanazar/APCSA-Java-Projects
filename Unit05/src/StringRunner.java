//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
		
		System.out.print("Enter a word :: ");
		String word = keyboard.nextLine();
		test.setString(word);
		System.out.print(test);
		
		System.out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		System.out.print(test);
		
		System.out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		System.out.print(test);
		
		System.out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		System.out.print(test);
	}
}