
public class Dice {
	
	public static void main(String args[])
	{
		dicecobination("",4);
	}
	
	static void dicecobination(String p ,int target)
	{
		if(target == 0)
		{
			System.out.println(p);
			return;
		}
		
		for(int i = 1; i <= 6 && i <= target;i++)
		{
			dicecobination(p+i,target - i);
		}
	}

}
