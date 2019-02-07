//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		//test case 1
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
		//add more test cases
		
		//test case 2
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
		
		//test case 3
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
		
		//test case 4
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
	}
}