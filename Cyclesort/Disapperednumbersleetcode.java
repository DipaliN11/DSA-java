package Cyclesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disapperednumbersleetcode {
	
	public static void main(String args[])
	{
		int arr[] = {4,3,2,7,8,2,3,1};
		List<Integer> result=findDisappearedNumbers(arr);
		System.out.println(result);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	 static List<Integer> findDisappearedNumbers(int[] nums)
	 {
		 
		
		 int i = 0;
		 while(i < nums.length)
		 {
			 int correct = nums[i] -1;
			 if(nums[i] <=nums.length && nums[i] != nums[correct])
			 {
				 swap(nums,i,correct);
			 }
			 else
				 i++;
			 
		 }
		 List<Integer> ans = new ArrayList<>();
		 for(int index =0;index < nums.length;index++)
		 {
			 if(nums[index] != index+1)
			 {
				ans.add(index+1);
				 
			 }
		 }
		 return ans;
		
		 
		 
		 
	 }
	 
	 static void swap(int arr[],int firstone,int secondone)
	 {
		int temp = arr[firstone];
		arr[firstone] = arr[secondone];
		arr[secondone] = temp;
	 }
	 

}
