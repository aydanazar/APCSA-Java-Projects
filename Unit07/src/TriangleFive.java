//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		int originalAmount = amount;
		int printLetter = letter;
		
		for (int times = 0; times < originalAmount; times++) {
			for (int i = 0; i < amount; i++) {
				for (int a = originalAmount; a > i; a--) {
					printLetter = (int)letter + i;
					if (printLetter > 90)
					{
						printLetter -= 26;
					}
					output += (char)(printLetter);
				}
				output += " ";
			}
			amount--;
			output += "\n";
		}
		
		return output;
	}
}