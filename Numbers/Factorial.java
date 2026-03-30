package Numbers;
import java.util.Scanner;
public class Factorial {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a random number");
		
		int num = scan.nextInt();
		int fact = 1;
		
			for(int i=1;i<num;i++)
			{
				fact=fact*i;
			}
			
			System.out.println("the factorial of the given number is"+fact);
		}
	}


