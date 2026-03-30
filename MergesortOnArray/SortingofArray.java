package MergesortOnArray;

import java.util.Arrays;

public class SortingofArray {
	
	public static void main(String args[])
	{
		int arr1[] = {3,5,4,7,8,2,1,9,12,45,78,10};
		int ans[] = mergeArray(arr1);
		System.out.println(Arrays.toString(ans));
		
 	}
	static int[] mergeArray(int arr[])
	{
		if(arr.length == 1)
		{
			return arr;
		}
		int mid = arr.length/2;
		int left[] = mergeArray(Arrays.copyOfRange(arr, 0, mid));
		int right[] = mergeArray(Arrays.copyOfRange(arr, mid, arr.length));	
		
		return merge(left,right);
				}
	private static int[] merge(int first[],int second[])
	{
		int mix[] = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i< first.length && j < second.length)
		{
			if(first[i] < second[j])
			{
				mix[k] = first[i];
				i++;
				
			}
			else	
			{
				mix[k] = second[j];
				j++;
			}
			k++;
			
		}
		//It may be possible that one array is not complete
		while(i < first.length)
		{
			mix[k] = first[i];
			i++;
			k++;
		}
		while(j < second.length)
		{
			mix[k] = second[j];
			j++;
			k++;
		}
		
		return mix;
		
		
	}

}
