
public class SearchinRange {
	public static void main(String args[])
	{
		int arr[] = {20,30,40,50,66,70,88};
		int target=50;
		System.out.println(search(arr,target,1,5));
		
		
	}
	static int search(int arr[],int target,int start,int end)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		for(int i = start;i<end;i++)
		{
			int elements = arr[i];
			if(elements == target)
			{
				return i;
			}
		}
		return -1;
	}

}
