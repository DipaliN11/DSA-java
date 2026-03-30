package Recursionproblem;

public class DigitSum {
	public static void main(String args[])
	{
		int ans = digitsumm(1345);
		System.out.println(ans);
		
	}
	
	static int digitsumm(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		
		return n%10 + digitsumm(n/10);
		
	}
	

}
