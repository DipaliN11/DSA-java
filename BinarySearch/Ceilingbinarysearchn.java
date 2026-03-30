package BinarySearch;

public class Ceilingbinarysearchn {
	
	public static void main(String args[])
	{
		int arr[] = {20,40,66,77,88,99,100};
		int target = 89;
		
		int ans = cieling(arr,target);
		System.out.println(ans);
		
	}
	
	static int cieling(int arr[],int target)
	{
		int start = 0;
		int end=arr.length-1;
		
		
		
		while(start <= end)
		{
			
			int mid = start+(end-1)/2;
			if(target > arr[mid])
			{
				start = mid+1;
			}
			else if(target < arr[mid])
			{
				end = mid-1;
			}
			else
			{
				return mid;
			}
		}
		return start;
	}

}
