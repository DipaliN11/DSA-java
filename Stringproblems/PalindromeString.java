package Stringproblems;

public class PalindromeString {
	
	public static void main(String args[])
	{
		String str = "abcdcba";
		System.out.println(palindrome(str));
		
	}
	
	static boolean palindrome(String str)
	{
		for(int i = 0;i< str.length() /2;i++)
		{
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			if(start == end)
			{
				return true;
			}
			
				
			
		}
		return false;
	}

	

}
