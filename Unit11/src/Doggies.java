//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int[] ages;
	private String[] names;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		ages = new int[size];
		names = new String [size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		Dog d = new Dog(age, name);
		if (spot > 0 && spot < pups.length) {
			pups[spot] = d;
			ages[spot] = age;
			names[spot] = name;
		}
	}

	public String getNameOfOldest()
	{
		int oldest = ages[0];
		int index = 0;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > oldest) {
				oldest = ages[i];
				index = i;
			}
		}
		return names[index];
	}

	public String getNameOfYoungest()
	{
		int youngest = ages[0];
		int index = 0;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < youngest) {
				youngest = ages[i];
				index = i;
			}
		}
		return names[index];
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}