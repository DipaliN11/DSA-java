package Sosrting;
import java.util.Arrays;

public class Bubblesort {
	
	public static void main(String args[])
	{
		int arr[]= {3,1,5,4,2};
		sort(arr);
		//System.out.println(Arrays.toString(arr));
	}
	static int[] sort(int arr[])
	{
		boolean swapped;
		swapped = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j = 1; j <=arr.length-1;j++)
			{
				if(arr[j] < arr[j-1])
				{
					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("new:");
			if(swapped == false) {
				break;
			}
			
		}
		
		return arr;
	}

}
