//Program to insert string and stringbuffer object into the treeset wher the sorting order is increasing length order.
//If 2 object have the same length then the consider they are alphabetically order.
package list;
import java.util.*;

public class UsesComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);

	}

}
class MyComparator1 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return 1;
		else
		{
			return s1.compareTo(s2);
		}
	}
}
