package com.wipro.cfw;


import java.util.Comparator;
public class EmployeeIDComparator implements Comparator{

	
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Employee emp1 = (Employee)o1;
		Employee emp2 = (Employee)o2;
		
		/*
		 * if(emp1.getempid()>emp2.getempid()) { return -4; } else
		 * if(emp1.getempid()<emp2.getempid()) { return +4; } else { return 0; }
		 */
		
		return emp2.getEmpid().compareTo(emp1.getEmpid());
		
	}

}
