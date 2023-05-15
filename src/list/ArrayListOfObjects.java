package list;

import java.util.ArrayList;
import java.util.Iterator;

class StudentInfo{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentInfo(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}

public class ArrayListOfObjects
{
	public static void main(String[] args)
	{
		ArrayList<StudentInfo> obj=new ArrayList<>();
		obj.add(new StudentInfo(1,"Pranav Kumar"));
		obj.add(new StudentInfo(2,"Prabhat Kumar"));
		System.out.println(obj);
//		Iterator<StudentInfo> it=obj.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		for(StudentInfo stud:obj)
		{
			System.out.println(stud.getName()+"\t "+stud.getClass()+"\t"+stud.getRollno());
		}
		
		
	}
}
//public class ArrayListOfObjects {
//
//	public static void main(String[] args) {
//		ArrayList<StudentInfo> obj=new ArrayList<>();
//		obj.add(new StudentInfo(1,"Samyak"));
//		obj.add(new StudentInfo(2,"Babita"));
//		System.out.println(obj);
//		for(StudentInfo stud :obj){
//			System.out.println(stud.getRollno()+"\t"+stud.getName());
//		}
//		
//
//	}
//
//}