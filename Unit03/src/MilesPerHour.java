//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours;
	private double mph, minutes;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		mph=00;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double time = hours + (minutes/60);
		mph = distance / time;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public double getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		return mph;
	}

	public String toString()
	{
		return getDistance() + " miles in " + getHours() + " hour(s) and " + (int)getMinutes() + 
				" minute(s) = " + Math.round(getMPH()) + " MPH.\n\n";
	}
}