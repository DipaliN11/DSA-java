package BinarySearch;

public class BinarysearchAscendingorder {
	
	public static void main(String args[])
	{

		int arr[] = {-7,-6,-4,-2,0,23,56,77,89,90,100,101,203,304};
		int target = -0;
		int ans=search(arr,target);
		System.out.println(ans);
	}
	
	static int search(int arr[],int target)
	{
		int start=0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = start+(end-start)/2;
			
			if(target < arr[mid])
			{
				end = mid-1;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
				return mid;
		}
		return -1;
	}
	

}
