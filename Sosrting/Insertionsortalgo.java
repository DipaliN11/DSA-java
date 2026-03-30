package Sosrting;

import java.util.Arrays;

public class Insertionsortalgo {
	
	public static void main(String args[])
	{
		int arr[] = {4,6,3,2,7,9};
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	static int[] insertionsort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j] < arr[j-1])
				{
				swap(arr,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		return arr;
	}
	static int[] swap(int arr[],int firstone,int secondone)

	{
		int temp = arr[firstone];
		arr[firstone] = arr[secondone];
		arr[secondone] = temp;
		return arr;
	}

}
