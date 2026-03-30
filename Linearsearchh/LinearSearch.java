import java.util.*;
public class LinearSearch {
	
	public static void main(String args[])
	{
		int nums[] = {18,19,44,55,67,88};
		int target = 44;
		int ans=linearSearch(nums,target);
		System.out.println(ans);
		
	}
	static int linearSearch(int arr[],int target)
	{
		for(int index=0;index<arr.length;index++)
		{
			int element = arr[index];
			if(element==target)
			{
				return index;
			}
		}
		return target;
	}

}
