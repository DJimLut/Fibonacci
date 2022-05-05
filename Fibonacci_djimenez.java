
// David Jimenez
// CSC345 Data Structures Assignment 3

public class Fibonacci_djimenez 
{
	public static double iterativeFibonacci(int n) // Iterative method for returning the nth fibonacci number.
	{
		if (n <= 1)
			return n;
		
		int fib = 0;
		int a = 1;
		
		for (int i = 0; i < n; i++)
		{
			int temp = fib;
			fib += a;
			a = temp;
		}
		
		return fib;
		
	}
	
	public static double recursiveFibonacci(int n) // Recursive method for returning the nth fibonacci number.
	{
		if (n <= 1)
			return n;
		
		return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
	}
	
	public static void main(String[] args) 
	{
		long startTime1;
		long endTime1;
		long duration1;
		long startTime2;
		long endTime2;
		long duration2;
		
		System.out.println(" n\tIterative\tRecursive\n==\t=========\t=========\n");
		for (int i = 20; i <= 40; i++)
		{
			startTime1 = System.nanoTime();
			iterativeFibonacci(i);
			endTime1 = System.nanoTime();
			
			duration1 = ((endTime1 - startTime1)/1000000);
			
			startTime2 = System.nanoTime();
			recursiveFibonacci(i);
			endTime2 = System.nanoTime();
			
			duration2 = ((endTime2 - startTime2)/1000000);
			
			System.out.println(i + "\t\t" + duration1 + "\t\t" + duration2 + "\n");
			
		}
	}
}
