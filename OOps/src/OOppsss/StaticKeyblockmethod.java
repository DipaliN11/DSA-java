package OOppsss;

public class StaticKeyblockmethod {
	
	int rollno;
	String name;
	float height;
	int marks;
	static int house;
	
	public StaticKeyblockmethod(int rollno,String name,float height,int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.height = height;
		this.marks = marks;
		StaticKeyblockmethod.house+=1;
	}
	
	static void fun()
	{
		System.out.println("i am static method");
	}

	
	
	public static void main(String args[])
	{
		StaticKeyblockmethod Dipali = new StaticKeyblockmethod(11,"Dipali",5.6f,87);
		StaticKeyblockmethod Komal = new StaticKeyblockmethod(12,"Komal",5.2f,88);
		
		
		StaticKeyblockmethod.fun();
		StaticKeyblockmethod.fun();
		
		System.out.println(Dipali.house);
		System.out.println(Komal.house);
	}
	
	

}

