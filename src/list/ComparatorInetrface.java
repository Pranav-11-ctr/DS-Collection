package list;
import java.util.*;

public class ComparatorInetrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator());
		/*t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);*/
		t.add("Roja");
		t.add("shobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Pranav");
		t.add("Prabhat");
		t.add("Murari");
		t.add("Kshan");
		System.out.println(t);

	}

}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		/*Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -100;
		else
			 return 0;*/
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
		}
}
