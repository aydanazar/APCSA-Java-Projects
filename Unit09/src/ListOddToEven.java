//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;

public class ListOddToEven
{
	public int go( List<Integer> ray )
	{
		int space = 0;
		boolean isOdd = false;
		boolean isEven = false;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 1) {
				isOdd = true;
				for (int n = i; n < ray.size(); n++) {
					if (ray.get(n) % 2 == 0) {
						isEven = true;
						space = n - i;
					}
				}
				break;
			}
		}
		if (isOdd && isEven) {
			return space;
		}
		return -1;
	}
}