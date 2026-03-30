package Singltone;

public class Singletoneclass {
	private Singletoneclass()
	{
		
	}

	public static Singletoneclass instance;
	
	public static Singletoneclass getInstance()
	{
		if(instance == null)
		{
			instance = new Singletoneclass();
		}
		return instance;
	}
	
	
}
