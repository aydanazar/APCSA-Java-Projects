//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
	
	private double lengthA, lengthB, average;
	
   public double go( String a, String b )
	{
	   lengthA = a.length();
	   lengthB = b.length();
	   average = (lengthA + lengthB) / 2;
	   return average;
	}
}