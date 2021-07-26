package space;

import java.util.ArrayList;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		if(this.equals(that))
		{
			return 0;
		}
		else if(this.getCost() != that.cost)
		{
			return Float.compare(this.getCost(), that.cost);
		}
		else
		{
			return destination.compareTo(that.destination);
		}
	}
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		if(this == x)
		{
			return true;
		}
		else if(!(x instanceof Mission))
		{
			return false;
		}
		else
		{
			Mission m = (Mission) x;
			return this.getCost() == m.cost && this.destination.equals(m.destination);
		}
	}
	
	
	// As you saw in lecture, create an ArrayList<Object>. Add destination and
	// cost to the list. Return the list's hash code.
	public int hashCode()
	{
		return destination.hashCode();
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
}
