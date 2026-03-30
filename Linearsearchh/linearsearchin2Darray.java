import java.util.Arrays;
import java.util.*;
public class linearsearchin2Darray {
	
	public static void main(String args[])
	{
		int arr[][] = {
				      {20,30,55},
				      {33,45,60,80},
				      {67,89,56},
				      {32,43,57,89}
	};
		int target = 60;
		
		int ans[] = search(arr,target);
		
		System.out.println(Arrays.toString(ans));
		
		

}
		static int[] search(int arr[][],int target)
		{
				for(int row =0;row<arr.length;row++)
					for(int col=0;col<arr[row].length;col++)
				{
						if(arr[row][col] == target)
						{
							return new int[]{row,col};
						}
				}
				
		
		return new int[] {-1,-1};
		
}
}
