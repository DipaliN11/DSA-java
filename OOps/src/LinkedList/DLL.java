package LinkedList;

public class DLL {
	
	private Node head;
	
	
	public void insertFirst1(int value)
	{
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if(head != null)
		{
		head.prev = node;
		}
		head = node;
	}
	
	public void insertLast(int val)
	{
		Node node = new Node(val);
		Node last = head;
		node.next = null;
		if(head == null)
		{
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = node;
		node.prev = last;
	}
	public void insert(int after,int value)
	{
		Node p = find(after);
		
		if(p == null)
		{
			System.out.println("node after not exist");
			return;
		}
		
		Node node = new Node(value);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.next != null)
		{
			
		node.next.prev = node;
			
		}	
		
		
	}
	public Node find(int value)
	{
		Node node = head;
		while(node != null)
		{
		if(node.val == value)
		{
			return node;
		}
		node = node.next;
		}
		return null;
	}
	public void display1()
	{
		Node node = head;
		while(node != null)
		{
			System.out.print(node.val+"->");
			node = node.next;
			
		}
		System.out.println("END");
	}
	
	public void displayreversed()
	{
		
		if(head == null)
		{
			System.out.println("list is empty");
		}
		Node last = head;
		System.out.println("reversed list");
		while(last.next != null)
		{
		last = last.next;
		}
		while(last != null)
		{
			System.out.print(last.val+"<-");
			last = last.prev;
		}
		System.out.println("START");
	}
	private class Node 
	{
		int val;
		Node next;
		Node prev;
		private Node(int val) {
			super();
			this.val = val;
		}
		private Node(int val, Node next, Node prev) {
			super();
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
