package linkedList.AC;

public class LinkedList1<T> {
	public Node<T> head;
	public Node<T> tail;
	public static int size;

	public T removeFirst() {
		if (size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (size == 1) {
			T tempData = head.obj;
			head = tail = null;
			size--;
			return tempData;
		} else {
			T tempData = head.obj;
			head = head.next;
			size--;
			return tempData;
		}
	}

	public T removeLast() {
		if (size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (size == 1) {
			T tempData = head.obj;
			head = tail = null;
			size--;
			return tempData;
		} else {
			Node<T> temp = head;
			int len = 1;
			while (len < size - 1 && temp != null) {
				len++;
				temp = temp.next;
			}
			T tempData = tail.obj;
			tail = temp;
			tail.next = null;
			size--;
			return tempData;
		}
	}

	public void addAtIndex(int index, T data) {
		if (index == size) {
			System.out.println("Size of list is " + size);
			return;
		}
		Node<T> newNode = new Node<>(data);
		if (index == 0) {
			addFirst(data);
			size++;
			return;
		}
		Node<T> temp = head;
		int i = 0;
		while (temp != null && i < index - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		size++;

	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = tail = newNode;
			size++;
			return;
		}

		newNode.next = head;
		head = newNode;
		size++;

	}

	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = tail = newNode;
			size++;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		size++;

	}

	public void display(Node<T> node) {
		Node<T> temp = node;
		while (temp != null) {
			System.out.print(temp.obj + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int dataSearchIteratively(T data) {
		int i = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (temp.obj == data) {
				return i;
			}
			i++;
			temp = temp.next;
		}
		return -1;
	}

	public int dataSearchRecursively(T data) {
		return dataSearchRecursively(data, head);
	}

	private int dataSearchRecursively(T data, Node<T> node) {
		if (size == 0) {
			System.out.println("List 0 in size");
			return -1;
		}
		if (node.obj == data) {
			return 0;
		} else {
			return (1 + dataSearchRecursively(data, node.next));
		}
	}

	public void reverseLinkedList() {

		Node<T> prev = null;
		Node<T> curr = head;
		Node<T> next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}
	
	public T deleteFromIndex(int index)
	{
		if(index==0 && size==0)
		{
			System.out.println("Size of list "+size);
			size--;
			return null;
		}
		else if(index==0 && size==1)
		{
			System.out.println("Size else if "+size);
			T data=head.obj;
			head=tail=null;
			size--;
			return data;
		}
		else if(index==0)
		{
			T data=head.obj;
			head=head.next;
			return data;
		}
		else
		{
			System.out.println("size in else ");
			Node<T> temp=head;
			int i=0;
			while(i<index-1 && temp!=null)
			{
				temp=temp.next;
				i++;
			}
			size--;
			T data=temp.next.obj;
			temp.next=temp.next.next;
			return data;
		}
	}
	
	public boolean ispallindrome()
	{
		int mid=size/2,i=0;
		Node<T> temp=head;
		while(i<mid && temp!=null)
		{
			i++;
			temp=temp.next;
		}
		
		Node<T> curr=temp;
		Node<T> prev=null;
		Node<T> next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node<T> temp1=head;
		Node <T> temp2=prev;
		
		while(temp1!=null && temp2!=null)
		{
			if(temp1.obj!=temp2.obj)
			{
				return false;
			}
		}
		return true;
	}
	
	
	

	public static void main(String[] args) {
		LinkedList1<Integer> list = new LinkedList1<>();
		list.addFirst(56);
		list.addFirst(66);
		list.addFirst(76);
		list.addFirst(86);
		list.display(list.head);
		System.out.println("Size of list" + size);
		list.addLast(89);
		list.addLast(45);
		list.display(list.head);
		list.addAtIndex(6, 459);
		list.display(list.head);
		System.out.println("Size of list" + size);
		System.out.println(list.tail.obj);
		System.out.println("Remove first " + list.removeFirst() + " size " + size);
		System.out.println("Remove Last " + list.removeLast() + " size " + size);
		list.display(list.head);
		System.out.println(list.dataSearchIteratively(76));
		System.out.println(list.dataSearchRecursively(89));
		list.reverseLinkedList();
		list.display(list.head);
		System.out.println(list.head.obj);
		System.out.println("Delete at index "+list.deleteFromIndex(0));

	}

}
