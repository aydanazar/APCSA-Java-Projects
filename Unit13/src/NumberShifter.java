//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Random;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt((10-1) + 1) + 1;
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j < array.length && array[j] != 7) j++;
			if (j != i && j < array.length) {
				int t = array[j];
				array[j] = array[i];
				array[i] = t;
			}
		}
	}
}