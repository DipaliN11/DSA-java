package StringRecursion;

public class SkipCharracters {
	public static void main(String args[])
	{
		skip("","baccad");
	}
	

	static void skip(String p,String original)
	{
		if(original.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch = original.charAt(0);
		if(ch == 'a')
		{
			skip(p,original.substring(1));
			
		}
		else
			skip(p+ch,original.substring(1));
	}
	}
