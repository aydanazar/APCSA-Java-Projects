//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int x = 1; x < str.length(); x=x+1)
		{
			if (str.charAt(x-1) == str.charAt(x))
			{
				count = count + 1;
			}	
		}
		return count;
	}
}