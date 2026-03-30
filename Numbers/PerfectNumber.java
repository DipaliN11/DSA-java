package Numbers;
import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the random number");
		
		int num = scan.nextInt();
		int sum=0;
		for(int i =1;i<=num/2;i++)
		{
			if(num%i==0)
			{
			sum= sum+i;
			}
		if(sum==num)
			System.out.println("the number is a perfect number");
			else
 			System.out.println("the number is not perfect number");
		}
	}

}
