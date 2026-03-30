package Numbers;

import java.util.Scanner;

public class Fibbonacciseries {
	
	public static void main(String args[])
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("enter any random number");
	
	int limit = scan.nextInt();
	
	int a=0,b=1;
	
	for(int i=1;i<=limit;i++)
	{
		System.out.println(a+"\t");
		int c = a+b;
		a=b;
		b=c;
		
	}
	
	
	}
	
	
}
