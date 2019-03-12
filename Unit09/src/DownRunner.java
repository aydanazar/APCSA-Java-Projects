//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.List;
import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{
		ListDown test = new ListDown();
		List<Integer> ray = new ArrayList<Integer>();
		
		ray.add(-99);
		ray.add(1);
		ray.add(2);
		ray.add(3);
		ray.add(4);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(12345);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(10);
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
		System.out.println(test.go(ray));
		ray.clear();
	}
}