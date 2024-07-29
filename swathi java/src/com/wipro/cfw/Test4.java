package com.wipro.cfw;

import java.util.TreeSet;

public class Test4 {
					
	public static void main(String[] args) {
		
		
		//create the object for TreeSet
		
		TreeSet sl = new TreeSet(new EmployeeNameComparator ());
		
		Employee emp1 = new Employee(98 , "Sarika");
		Employee emp2 = new Employee(99 , "Swetha");
		Employee emp3 = new Employee(100 , "Sagarika");
		
		
		
		s1.add(emp1);
		s1.add(emp2);
		s1.add(emp3);
		
		for (Object o: s1)
		{
			System.out.println(o);
		}
	}
}
