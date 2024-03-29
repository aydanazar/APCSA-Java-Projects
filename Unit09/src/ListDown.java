//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public boolean go(List<Integer> numArray)
	{
		boolean isDecreasing = true;
		for (int i = 0; i < numArray.size()-1; i++) {
			if (numArray.get(i) <= numArray.get(i+1)) {
				isDecreasing = false;
				break;
			}
		}
		return isDecreasing;
	}	
}