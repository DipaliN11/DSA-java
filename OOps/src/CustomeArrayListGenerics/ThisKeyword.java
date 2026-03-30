package CustomeArrayListGenerics;

public class ThisKeyword {
	
	int age;
	String name;
	
	public ThisKeyword(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public ThisKeyword(ThisKeyword human)
	{
		this.age = human.age;
		this.name = human.name;
	}

	@Override
	public String toString() {
	    return "Name: " + name + ", Age: " + age;
	    // or shorter: return name + " (" + age + ")";
	}

	public static void main(String args[])
	{
		ThisKeyword a = new ThisKeyword(28,"Dipali");
		ThisKeyword b = new ThisKeyword(a);
		System.out.println(b);
	}

}
