package Sosrting;

import java.util.Arrays;

public class QuickSortelements {
	
	
	public static void main(String args[])
	{
		
		int arr[] = {3,5,6,8,12,9,23};
		quicksortelement(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void quicksortelement(int arr[],int low,int hi)
	{
		if(low > hi)
		{
			return;
		}
		int s = low;
		int e = hi;
		int m = s + (e - s)/2;
		int pivote = arr[m]; 
		
		while(s <= e)
		{
			while(arr[s] < pivote)
			{
				s++;
			}
			while(arr[e] > pivote)
				{
					e--;
				}
		if(s <= e)
		{
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	
			quicksortelement(arr,low,e);
			quicksortelement(arr,s,hi);
	}	
}