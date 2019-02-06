//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   //need a constructor because runner calls default constructor with empty parentheses ()
	//instance variables are the private variables in the class
	
	public static String go( String a )
	{
		String vowels = "AEIOUaeiou";
		
		//searches for index of the first letter in the given string in vowels
		int pos1 = vowels.indexOf(a.substring(0,1));
		
		int pos2 = vowels.indexOf(a.substring(a.length()-1));
		
		if (pos1 > -1)
		{
			return "yes";
		}
		if (pos2 > -1)
		{
			return "yes";
		}
		else
		{
			return "no";
		}
	}
}