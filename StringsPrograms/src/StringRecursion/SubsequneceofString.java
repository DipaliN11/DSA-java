package StringRecursion;

import java.util.ArrayList;

public class SubsequneceofString {
	public static void main(String args[])
	{
	ArrayList<String> list = new ArrayList<String>();
	subseuqnce("","abc",list);
	System.out.println(list);
	subseuqnce1("","abc");
	subseuqnceascii("","abcd");
}
	static void subseuqnce1(String p,String up)
	{
		if(up.isEmpty())
		{
			
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseuqnce1(p+ch,up.substring(1));
		subseuqnce1(p,up.substring(1));
		
	}

	static void subseuqnce(String p,String up,ArrayList<String> list)
	{
		if(up.isEmpty())
		{
			
			list.add(p);
			return;
		}
		char ch = up.charAt(0);
		subseuqnce(p+ch,up.substring(1),list);
		subseuqnce(p,up.substring(1),list);
	}
	static void subseuqnceascii(String p,String up)
	{
		if(up.isEmpty())
		{
			
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseuqnceascii(p+ch,up.substring(1));
		subseuqnceascii(p,up.substring(1));
		subseuqnceascii(p+(ch+0),up.substring(1));
	}

	
	
}
	