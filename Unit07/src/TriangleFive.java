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
		char originalLetter = letter;
		
		
		//prints [amount] lines of letters
		for (int n = 1; n <= originalAmount; n++) {
			int varyingAmount = amount;
			char varyingLetter = letter;
			
			//prints one line of letters
			while (varyingAmount > 0) {
				for (int i = varyingAmount; i > 0; i--) {
					output += varyingLetter;
				}
				output += " ";
				varyingLetter += 1;
				varyingAmount -= 1;
			}
		output += "\n";
		}
		
		return output;
	}
}