//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		ToyStore test = new ToyStore();
		
		test.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		test.sortToysByCount();
		System.out.println( test );
	}
}