//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;

public class ListSumFirst
{
	public int go(List<Integer> ray)
	{
		int count = 0;
		boolean isCount = false;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) > ray.get(0)) {
				count += ray.get(i);
				isCount = true;
			}
		}
		if (isCount) {
			return count;
		}
		else return -1;
	}
}