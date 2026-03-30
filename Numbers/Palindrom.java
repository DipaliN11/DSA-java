package Numbers;
import java.util.Scanner;

public class Palindrom {
	
	public static void main(String args[])

	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter any random number");
		int n = scan.nextInt();
		int rev =0;
		int temp=n;
		int rem;
		
		while(n!=0)
		{
			rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("the number is a palindrom number");
		}
		else
			System.out.println("not palindrom");
		
		
	}
}
