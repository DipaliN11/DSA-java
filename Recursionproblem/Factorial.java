package Recursionproblem;

public class Factorial {
	public static void main(String args[])
	{
		System.out.println(fact(5));
		System.out.println(sumofdigits(5));

}
static int fact(int n)
{
	if(n == 1)
	{
		return 1;
		
	}
	
	return n * fact(n-1);
}

static int sumofdigits(int n)
{
	if(n == 1)
	{
		return 1;
		
	}
	
	return n + fact(n-1);
}
}