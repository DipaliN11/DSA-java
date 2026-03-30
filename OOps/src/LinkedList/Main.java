package LinkedList;

public class Main {
	public static void main(String args[])
	{
		
		LL list = new LL();
		list.insertFirst(12);
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertLast(7);
		list.insertAtIndex(100, 3);
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.deleteAtIndex(1));
		list.display();
	}

}
