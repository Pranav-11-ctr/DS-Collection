package listWithUsingComparatorAsLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	int empId;
	int salary;
	String name;
	public Employee(int empId, int salary, String name) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
	
	
}
public class ListWithUsingComparatorAsLambda {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(12,4500,"Pranav78"));
		list.add(new Employee(15,45000,"Pranav4"));
		list.add(new Employee(1,450,"Pranav45"));
		list.add(new Employee(2,400,"Pranav1"));
		
		//Collections.sort(list,(Employee emp1,Employee emp2)->(return emp1.salary-emp2.salary;));
		Collections.sort(list,Comparator.comparingInt(emp->emp.salary));
		for(Employee emp1:list)
		{
			System.out.println(emp1);
		}
		System.out.println();
		
		Collections.sort(list,Comparator.comparingInt(emp->emp.empId));
		for(Employee emp1:list)
		{
			System.out.println(emp1);
		}
		
		Collections.sort(list,Comparator.comparingInt(null));
		
		
		

	}

}
