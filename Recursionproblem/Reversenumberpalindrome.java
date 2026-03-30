package Recursionproblem;

public class Reversenumberpalindrome {
	public static void main(String args[])
	{
		System.out.println(reversenumber(18976));
		System.out.println(palindrome(18976));
		
		
	}
	static int sum = 0;
	static  int reversenumber(int n)
	{
		if( n == 0)
		{
			return 0;
		}
		int rem = n % 10;
		sum= sum*10+rem;
		reversenumber(n/10);
		return sum;
	}

		static boolean palindrome(int n)
		{
			return n == reversenumber(n);
			
		}
}
