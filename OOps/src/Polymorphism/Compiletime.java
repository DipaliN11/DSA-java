package Polymorphism;

public class Compiletime {
	
	String leafcolor;
	int leafs;
	
	public Compiletime()
	{
		this.leafcolor = "green";
		this.leafs = 2;
	}
	
	public Compiletime(String leafcolor,int leafs)
	{
		this.leafcolor = leafcolor;
		this.leafs = leafs;
	}
	
	public Compiletime(int leafs)
	{
		this.leafs = leafs;
	}

}
