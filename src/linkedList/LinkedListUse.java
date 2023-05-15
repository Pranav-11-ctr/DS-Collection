package linkedList;
import java.util.Scanner;
public class LinkedListUse {
	
	public static LinkedList<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> head=null,tail=null;
		int data=sc.nextInt();
		
		while(data!=-1)
		{
		LinkedList<Integer> newNode=new LinkedList<>(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			
		}
		data=sc.nextInt();
		}
		return head;
		
	}
	
	public static void printIthNode(LinkedList<Integer> head, int i){
		//Your code goes here
        if(i==0)
        {
           if(head==null)
            return;
            else
                System.out.println(head.data);
        }
        else
        {
        int count=0;
        while(head!=null && count<i)
        {
            head=head.next;
            count++;
        }
            if(head==null)
                return;
            else
                System.out.println(head.data);
        }
	}
	
	public static void print(LinkedList<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static int length(LinkedList<Integer> head){
		//Your code goes here
        LinkedList<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> head=takeInput();
		print(head);
		
		System.out.println(length(head));
		printIthNode(head,3);

	}

}
