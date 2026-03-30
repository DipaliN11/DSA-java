package Cyclesort;

import java.util.ArrayList;
import java.util.List;

public class FirstMissingPositivenumber {

	public static void main(String args[])
	{
	
	int arr[] = {1,2,0};
	List<Integer> ans = MisDupelement(arr);
	System.out.println(ans);
	

}
		static List<Integer> MisDupelement(int arr[])
		{
			int i = 0;
			
			while(i < arr.length)
			{
				int correct = arr[i] -1;
				if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct])
				{
					swap(arr,i,correct);
				}
				else
					i++;
			}
			List<Integer> result = new ArrayList<>();
			for(int index=0;index < arr.length;index++)
			{
				if(arr[index] != index+1)
				{
					result.add(index+1);
				}
		}
			return result;
		}
		
		static void swap(int arr[],int firstone,int secondone)
		{
			int temp = arr[firstone];
			arr[firstone] = arr[secondone];
			arr[secondone] = temp;
		}
		}
