package CustomeArrayListGenerics;

import java.util.Arrays;

public class CustomArraylistGeneric<T> {
	
	private Object[] a1;
	private int size;
	private int DEFAULT_SIZE = 10;
	
	public CustomArraylistGeneric()
	{
		a1 = new Object[DEFAULT_SIZE];
	}
	
	public void add(T num)
	{
		if(isFull())
		{
			resize();
		}
		a1[size++]=num;
	}
	public boolean isFull()
	{
		return size == a1.length;
	}
	
	public void resize()
	{
		Object temp[] = new Object[a1.length * 2];
		
		for(int i=0;i<a1.length;i++)
		{
			temp[i] = a1[i];
		}
		
		a1 = temp;
		
	}
	public T getIndex(int index)
	{
		return (T)a1[index];
		
	}
	public int size()
	{
		return size;
	}
	
	
	@Override
	public String toString() {
		return "CustomArraylist"+Arrays.toString(a1)+" size="+size;
	}

	public static void main(String args[])
	{
		//CustomArraylist list = new CustomArraylist();
		//list.add(2);
		//list.add(10);
		CustomArraylistGeneric<Integer> list = new CustomArraylistGeneric<>();
		list.add(23);
		list.add(3);
		list.add(5);
		System.out.println(list);
	}

}
