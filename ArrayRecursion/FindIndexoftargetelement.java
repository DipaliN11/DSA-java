package ArrayRecursion;

import java.util.ArrayList;

public class FindIndexoftargetelement {
	
	public static void main(String args[])
	{
		int arr[] = {3,2,1,8,2,9,6};
		int target = 2;
		System.out.println(fun(arr,target,0));
		ArrayList<Integer> list1 = new ArrayList<>();
		funAllindex(arr,target,0,list1);
		System.out.println(list1);
	}
	static int fun(int arr[],int target,int index)
	{
		if(index == arr.length-1)
		{
			return -1;
		}
		if(arr[index] == target)
		{
			return index;
		}
		return fun(arr,target,index+1);
	}
	static ArrayList funAllindex(int arr[],int target,int index,ArrayList<Integer> list)
	{
		if(index == arr.length)
		{
			return list;
		}
		if(arr[index] == target)
		{
			list.add(index);
		}
		return funAllindex(arr,target,index+1, list);
	}
	
		
}
