//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	//instance variables
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	//constructor 1 initializes
	public Distance()
	{
		setCoordinates(0,0,0,0);
		distance = 0.0;
	}

	//constructor 2 passes in data
	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		distance = 0.0;
	}

	//setter or modifier
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	//calculator function
	public void calcDistance()
	{
		distance = Math.sqrt((xTwo - xOne)*(xTwo - xOne) + (yTwo - yOne)*(yTwo - yOne));
	}
	
	//accessor or getter --> accesses and returns instance variable = distance
	public double getDistance()
	{
		return distance;
	}
	
	//accessor or getter --> accesses and returns instance variable = distance
	public String toString()
	{
		return "distance == " + getDistance();
	}
}