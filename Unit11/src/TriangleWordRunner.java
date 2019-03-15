//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		TriangleWord triangle = new TriangleWord();
		String choice = "";
		
		do {
			System.out.print("Enter a word:: ");
			String word = keyboard.next();
			triangle.printTriangle(word);
			
			System.out.print("\nDo you want to enter more sample input? ");
			choice = keyboard.next();
		}while(choice.equals("y") || choice.equals("Y"));

	}
}