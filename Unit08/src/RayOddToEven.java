//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public int go(int[] ray)
	{
		int space = 0;
		boolean isOdd = false;
		boolean isEven = false;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1) {
				isOdd = true;
				for (int n = i; n < ray.length; n++) {
					if (ray[n] % 2 == 0) {
						isEven = true;
						space = n - i;
						break;
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