package linkedList;

public class LinkedList<T> {
	T data;
	LinkedList<T> next;
	
	public LinkedList(T data)
	{
		this.data=data;
		this.next=null;
	}
}
