//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne();
		
		System.out.println("hippo");
		test.setWord("hippo");
		test.makeTriangle();
		System.out.println(test);
		
		System.out.println("abcd");
		test.setWord("abcd");
		test.makeTriangle();
		System.out.println(test);
		
		System.out.println("it");
		test.setWord("it");
		test.makeTriangle();
		System.out.println(test);
		
		System.out.println("a");
		test.setWord("a");
		test.makeTriangle();
		System.out.println(test);
		
		System.out.println("chicken");
		test.setWord("chicken");
		test.makeTriangle();
		System.out.println(test);
	}
}