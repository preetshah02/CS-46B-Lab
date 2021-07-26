package recursion;

public class FibGenerator {
	
	private int[] callCounter;
	
	public int nthFib(int n)
	{
		callCounter = new int[n + 1];
		return computeFibRecurse(n);
	}
	
	private int computeFibRecurse(int n)
	{
		callCounter[n]++;
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return computeFibRecurse(n - 2) + computeFibRecurse(n - 1);
		
	}
	
	private void printCallCounter()
	{
		for(int i = 0; i < callCounter.length; i++)
		{
			System.out.println(callCounter[i] + " call to fib(" + i + ")");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("STARTING");
		FibGenerator fib = new FibGenerator();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("fib(" + i + ") = " + fib.nthFib(i));
		}
		fib.printCallCounter();
	}
}
