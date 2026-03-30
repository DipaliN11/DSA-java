package OOppsss;

public class StaticBlock {
	
	static int a = 10;
	static int b = 2;
	
	static {
		System.out.println("i am static block");
		b = b +3;
	}
	
	
	public static void main(String args[])
	{
		StaticBlock obj =  new StaticBlock();
		System.out.println(obj.a);
		
		System.out.println(obj.b);
		
		//static only run once in starting when the first object is loaded i.e when the class is loaded first time.
		//StaticBlock obj1 =  new StaticBlock();
		//System.out.println(obj1.b);
		
	}

}
