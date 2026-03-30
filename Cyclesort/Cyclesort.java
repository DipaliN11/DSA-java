package Cyclesort;
import java.util.Arrays;

public class Cyclesort {
	
	public static void main(String args[])
	{
		int arr[] = {4,5,6,3,2,1};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void cycleSort(int arr[])
	{
		int i = 0;
		while(i< arr.length)
		{
			int correct = arr[i]-1;
			if(arr[i] != arr[correct])
			{
				swap(arr,i,correct);
			}
			else
				i++;
		}
	}
	static void swap(int arr[],int firstone,int secondone)
	{
		int temp = arr[firstone];
		arr[firstone] = arr[secondone];
		arr[secondone] = temp;
		
	}
	

}

