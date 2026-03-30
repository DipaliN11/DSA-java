import java.util.Arrays;  
public class SwapArray {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,15};
		
		swap(arr,1,2);
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(max(arr));
		
		
	}
	static void reverse(int arr[])
	{
		int start=0;
		int end = arr.length-1;
		
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	static int max(int arr[])
	{
		int maxval=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxval)
			{
				maxval=arr[i];
			}
			
		}
		return maxval;
	}
	static void swap(int arr[],int index1,int index2)
	{
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		
		
	}

}



