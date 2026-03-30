package Sosrting;
import java.util.Arrays;
public class Selectionsortalgo {
	public static void main(String args[])
	{
	int arr[] = {3,6,7,8,9};
	selection(arr);
	System.out.println(Arrays.toString(arr));

	}
	static int[] selection(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
		
		int last = arr.length- i - 1;
		int maxindex = getMaxIndex(arr,0,last);
		swap(arr,last,maxindex);
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
	static int getMaxIndex(int arr[],int start,int last)
	{
		
		int max = start;
		for(int i=0;i<=last;i++)
		{
			if(arr[max] < arr[i])
			{
				max = i;
			}
		}
		return max;
	}
	}