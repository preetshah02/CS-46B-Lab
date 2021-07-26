package recursion;

public class FactorialGenerator {
	
	public double nthFactorial(int n)
	{
		return computeFactorialRecurse(n);
	}
	
	private double computeFactorialRecurse(int n)
	{
		assert (n >= 0): "Illegal n: " + n; 
		if (n == 0)
		{
			return 1;
		}
		return n * computeFactorialRecurse(n - 1);
	}
	
	public static void main(String[] args)
	{
		FactorialGenerator factorial = new FactorialGenerator();
		System.out.println("Max value of long: " + Float.MAX_VALUE);
		for(int i = 1; i <= 32; i++)
		{
			System.out.println(i + "'s factorial is:  " +factorial.nthFactorial(-1));
		}
	}
}
