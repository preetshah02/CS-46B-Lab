package bubble;

public class BubbleSorter 
{
	private int[]		a;
	private long		nVisits;
	private long		nSwaps;
	private boolean sort;
	
	public BubbleSorter(int[] a)
	{
		this.a = a; 
	}
	
	
	public void sort()
	{
		sort = false;
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - 1; j++)
			{
				// Increment number of visits by 2.
				nVisits = nVisits + 2;
				if(a[j] > a[j + 1])
				{
					// Swap the elements and increment nSwaps.
					int b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
					nSwaps++;
					sort = true;
				}
			}
		}
	}
	
	
	public String toString()
	{
		String s = nVisits + " visits, " + nSwaps + " swaps\n{";
		for (int n: a)
			s += " " + n;
		s += " }";
		return s;
	}
	
	
	public boolean isSorted()
	{
		return sort;
	}
	
	
	public long getNVisits()
	{
		return nVisits;
	}
	
	
	public long getNSwaps()
	{
		return nSwaps;
	}
	
	
	public int[] getArray()
	{
		return a;
	}
	
	
	public static void main(String[] args)
	{
		int[] a = BubbleSortTestCaseMaker.buildRandom(100, 1000);
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		System.out.println(sorter);
		System.out.println(sorter.isSorted()  ?  "SORTED"  :  "NOT SORTED");
	}
}
