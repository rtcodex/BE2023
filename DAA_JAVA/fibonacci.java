// Non-Recursive Method
// Java program for the above approach

class FiboIt{

	// Function to print N Fibonacci Number
	static void Fibonacci(int N)
	{
		int num1 = 0, num2 = 1;

		int counter = 0;

		// Iterate till counter is N
		while (counter < N) {

			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given Number N
		int N = 10;

		// Function Call
		Fibonacci(N);
	}
}

--------------------------------------------------------------------------------------------------
	
// Recursive implementation of
// Fibonacci Series

class fiboRec {

	// Function to print the fibonacci series
	static int fib(int n)
	{
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1)
			+ fib(n - 2);
	}

	// Driver Code
	public static void
	main(String args[])
	{
		// Given Number N
		int N = 12;

		// Print the first N numbers
		for (int i = 0; i < N; i++) {

			System.out.print(fib(i) + " ");
		}
	}
}


---------------------------------------------------------------------------------------------------
	
// Optimized Method
public class fibonacci
{
	static int fib(int n)
	{
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main (String args[])
	{
		int n = 9;
		System.out.println(fib(n));
	}
};

