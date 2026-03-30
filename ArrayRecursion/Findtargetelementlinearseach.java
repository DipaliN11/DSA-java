package ArrayRecursion;

public class Findtargetelementlinearseach {
	public static void main(String args[])
	{
		int arr[] = {3,2,1,6,9};
		System.out.println(fun(arr,9,0));
	}
	
	static boolean fun(int arr[],int target,int index)
	{
		if(index == arr.length)
		{
			return false;
		}
		if(arr[index] == target)
		{
			return true;
		}
		return fun(arr,target,index+1);
	}
	
}