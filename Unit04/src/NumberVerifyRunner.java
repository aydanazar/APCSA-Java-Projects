//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		NumberVerify test = new NumberVerify();
		
		System.out.print("Enter a whole number :: ");
		int number = keyboard.nextInt();
		System.out.println( number + " is odd :: " + test.isOdd(number));
		System.out.println( number + " is even :: " + test.isEven(number) + "\n");
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println( number + " is odd :: " + test.isOdd(number));
		System.out.println( number + " is even :: " + test.isEven(number) + "\n");
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println( number + " is odd :: " + test.isOdd(number));
		System.out.println( number + " is even :: " + test.isEven(number) + "\n");
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println( number + " is odd :: " + test.isOdd(number));
		System.out.println( number + " is even :: " + test.isEven(number) + "\n");
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println( number + " is odd :: " + test.isOdd(number));
		System.out.println( number + " is even :: " + test.isEven(number) + "\n");
	}
}