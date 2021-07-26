package bubble;

import java.util.*;


public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++)
		{
			int[] array = BubbleSortTestCaseMaker.buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			sorter.sort();
			assert (sorter.isSorted() == true);
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());
		}

		// referred from https://www.geeksforgeeks.org/find-max-min-value-array-primitives-using-java/
		System.out.println("Max Visits: " + Collections.max(visitCounts) + "\nMin Visits: " + Collections.min(visitCounts));
		long totalVisits = 0;
		for (int i = 0; i < visitCounts.size(); i++)
		{
			totalVisits = totalVisits + visitCounts.get(i);
		}
		System.out.println("Average Visits: " + totalVisits / visitCounts.size());
		
		System.out.println();
		
		System.out.println("Max Swaps: " + Collections.max(swapCounts) + "\nMin Swaps: " + Collections.min(swapCounts));
		long totalSwaps = 0;
		for (int i = 0; i < swapCounts.size(); i++)
		{
			totalSwaps = totalSwaps + swapCounts.get(i);
		}
		System.out.println("Average Swaps: " + totalSwaps / swapCounts.size());
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("500:");
		getStats(500);
		System.out.println();
		System.out.println("1500:");
		getStats(1500);
	}
}
