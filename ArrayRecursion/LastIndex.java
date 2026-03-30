package ArrayRecursion;

import java.util.ArrayList;

public class LastIndex {
	public static void main(String args[])
	{
		int arr[] = {3,2,1,8,2,9,6};
		int target = 2;
		System.out.println(fun(arr,target,arr.length-1));

}
	static int fun(int arr[],int target,int index)
	{
		if(index == -1)
		{
			return -1;
		}
		if(arr[index] == target)
		{
			return index;
		}
		return fun(arr,target,index-1);
	}
}
