package Permutationproblem;

import java.util.ArrayList;

public class PermutationString {
	public static void main(String args[])
	{
		
		permute("","abc");
		ArrayList<String> ans1 = permute1("","abcd");
		System.out.println(ans1);
	}
	static void permute(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		for(int i =0;i <= p.length();i++)
		{
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			
			permute(first + ch + second,up.substring(1));
			
		}
	}
	static ArrayList<String> permute1(String p,String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		ArrayList<String> ans = new ArrayList<>();
		for(int i =0;i <= p.length();i++)
		{
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			
			ans.addAll(permute1(first + ch + second,up.substring(1)));
			
		}
		return ans;
	}
}