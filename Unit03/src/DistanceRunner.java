//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance d = new Distance();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		d.setCoordinates(x1, x2, y1, y2);
		d.calcDistance();
		System.out.println(d);
		
		System.out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		d.setCoordinates(x1, x2, y1, y2);
		d.calcDistance();
		System.out.println(d);
		
		System.out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		d.setCoordinates(x1, x2, y1, y2);
		d.calcDistance();
		System.out.println(d);
	}
}