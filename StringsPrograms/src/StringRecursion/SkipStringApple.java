package StringRecursion;

public class SkipStringApple {
	public static void main(String args[])
	{
		String ans = skipApple("bccapplecb");
		System.out.println(ans);
		String ans1 = skipAppNotApple("bccapplecab");
		System.out.println(ans1);

}
	static String skipApple(String original)
	{
		if(original.isEmpty())
		{
			return original;
		}
		
		if(original.startsWith("apple"))
				{
					return skipApple(original.substring(5));
				}
		else
			return original.charAt(0)+skipApple(original.substring(1));
	}
	static String skipAppNotApple(String original)
	{
		if(original.isEmpty())
		{
			return "";
		}
		
		if(original.startsWith("app") && !original.startsWith("apple"))
				{
					return skipAppNotApple(original.substring(3));
				}
		else
			return original.charAt(0)+skipAppNotApple(original.substring(1));
	}
}