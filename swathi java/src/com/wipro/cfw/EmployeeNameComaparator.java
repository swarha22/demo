package com.wipro.cfw;
		
import java.util.Comparator;

public class EmployeeNameComparator implements Comparator {

	@Override
	public int compare(Object o1,Object o2) {
		
		
		Employee emp1 = (Employee) o1;
		Employee emp2 =(Employee) o2;
		
		return emp2.getEmpname().compareTo(emp1.getEmpname ());
	} 
	
	
	
	
	
}

