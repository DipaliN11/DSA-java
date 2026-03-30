package Patterns;

public class Diamond {
	public static void main(String args[]) {
	    int n =5;
	    pattern3Diamond(n);
	    
	}
	static void pattern3Diamond(int n)
	{
	    for(int row =1;row<= 2*n-1; row++)
	    {
	    	int totalcolinrow = row > n ? n-(row-n) : row;
	    	
	    	int totalnoofspace = n - totalcolinrow;
	    	for(int s = 0;s < totalnoofspace;s++)
	    	{
	    		System.out.print("  ");
	    	}
	        for(int col=1;col<=totalcolinrow;col++)
	        {
	            System.out.print(" *  ");
	        }
	        System.out.println();
	    }
	    
	  }
}
