package list;
import java.util.*;

class Employee implements Comparable
{
	String name;
	int eid;
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	
	public String toString()
	{
		return name+" "+eid;
	}
	
	public int compareTo(Object o)
	{
		int eid1=this.eid;
		int eid2=((Employee)o).eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
			return 0;
	}
}


public class ExampleOfComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("balaish",200);
		Employee e3=new Employee("chiru",50);
		Employee e4=new Employee("venki",150);
		Employee e5=new Employee("nag",100);
		TreeSet t2=new TreeSet();
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
		TreeSet t3=new TreeSet(new MyComparator5());
		t3.add(e1);
		t3.add(e2);
		t3.add(e3);
		t3.add(e4);
		t3.add(e5);
		System.out.println(t3);
	}

}

class MyComparator5 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
}