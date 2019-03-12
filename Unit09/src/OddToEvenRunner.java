//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		List<Integer> ray = new ArrayList<Integer>();
		
		ray.add(7);
		ray.add(1);
		ray.add(5);
		ray.add(3);
		ray.add(11);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(12345);
		ray.add(11);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(11);
		ray.add(9);
		ray.add(8);
		ray.add(7);
		ray.add(6);
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(1);
		ray.add(-99);
		ray.add(7);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(2);
		ray.add(4);
		ray.add(6);
		ray.add(8);
		ray.add(8);
		System.out.println(test.go(ray));
		ray.clear();
	}
}