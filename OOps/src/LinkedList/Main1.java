package LinkedList;

public class Main1 {
	
	public static void main(String args[])
	{
		DLL list1 = new DLL();
		list1.insertFirst1(2);
		list1.insertFirst1(3);
		list1.insertFirst1(5);
		list1.insertFirst1(6);
		list1.display1();
		list1.displayreversed();
		list1.insertLast(66);
		list1.display1();
		list1.insert(3,8);
		list1.display1();
	}

}
