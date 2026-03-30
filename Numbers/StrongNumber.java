package Numbers;
import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the random number");
		
		int n = scan.nextInt();
		int sum = 0;
		int temp=n;
		while(n!=0)
		{
			int rem = n%10;
			int fact = 1;
			for(int i =1;i<=rem;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
		System.out.println("the number is a strong number");
		}
		
		else
			System.out.println("not strong number");
	}

}
