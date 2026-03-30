package CustomeArrayListGenerics;

public class CustomeArrayList {
	
	private int[] data;
	private int Default_size = 10;
	private int size = 0;
	
	
	CustomeArrayList()
	{
		this.data = new int[Default_size]; 
	}
	
	public void add(int num)
	{
		if(isFull())
		{
			resize();
		}
		data[size++] = num;
	}
	private boolean isFull()
	{
		return size == data.length;
	}
	private void resize()
	{
		int[] temp = new int[data.length*2];
		
		for(int i = 0;i< data.length;i++)
		{
			temp[i] = data[i];
		}
		data = temp;
	}
	public int size()
	{
		return size;
	}
	public int get(int index)
	{
		return data[index];
	}
	public String toString()
	{
		if( size == 0)
		{
			return "[]";
		}
		String s = "[";
		for(int i =0;i<data.length;i++)
		{
			s+=data[i];
			if(i < data.length -1)
			{
				s+=", ";
			}
			
		}
		s+="]";
		return s;
		
	}
	
	public static void main(String args[])
	{
		CustomeArrayList list = new CustomeArrayList();
		list.add(1);
		list.add(2);
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
