
public class operatorprogram {
	public static void main(String args[])
	{
		int arr[] = {2,3,4,6,2,3,4};
		System.out.println(uniqueelement(arr));
	}
	static int uniqueelement(int arr[])
	{
		int unique =0;
		for(int n : arr)
		{
			unique ^= n;
		}
		return unique;
	}

}
