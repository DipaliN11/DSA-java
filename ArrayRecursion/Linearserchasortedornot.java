package ArrayRecursion;

public class Linearserchasortedornot {
	public static void main(String args[])
	{
		int arr[] = {1,2,4,14,9,12};
		System.out.println(fun(arr,0));
	}
	
	static boolean fun(int arr[],int index)
	{
		if(index == arr.length-1)
		{
			return true;
		}
		if(arr[index] > arr[index+1])
				{
					return false;
				}
		return fun(arr,index+1);
	}
	
}
