package Polymorphism;

public class Main {
	public static void main(String args[])
	{
		Compiletime c = new Leaf2("darkgreen",3,"underground","papaya");
		
		//System.out.println(c.name);
		
		System.out.println(c.getClass());
	}

}
