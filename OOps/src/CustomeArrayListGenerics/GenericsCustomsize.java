package CustomeArrayListGenerics;

import java.util.ArrayList;

public class GenericsCustomsize {
	
	private static int[] data;
	private static int Default_size = 10;
	private static int size = 0;
	
	
	GenericsCustomsize()
	{
		
		data = new int[Default_size];
		for(int i=0 ; i< Default_size;i++)
		{
			data[i] = 0;
		}
	}
	public boolean isFull()
	{
		if(size == Default_size)
		{
			return true;
		}
		else
			return false;
	}
	public void resize()
	{
		Default_size  = Default_size * 2;
		
		int[] temp = new int[Default_size]; 
		for(int i = 0; i < size;i++)
		{
			temp[i] =data[i];
		}
		size = 0;
		data = null;
		data = new int[Default_size];
		
		for(int j = 0; j < Default_size;j++)
		{
			data[j] =temp[j];
			size++;
			
		}
	}
	public void add(int num)
	{
		if(!isFull())
		{
			data[size++]= num;
		}
		else
		{
			resize();
		}
	
	}
	
	public void print()
	{
		for(int i=0 ; i< Default_size;i++)
		{
			System.out.println(data[i]);
		}
	}
	
	
	
	public static void main(String args[])
	{
		GenericsCustomsize list = new GenericsCustomsize();
		list.add(1);
		list.add(2);
		list.add(31);
		list.add(15);
		list.print();
		
		
		
	}

}
