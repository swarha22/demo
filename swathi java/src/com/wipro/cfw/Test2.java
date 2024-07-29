package com.wipro.cfw;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args){
		
		//creating object for set interface
		
		//Set s = new LinkedHashSet();
		Set s1 = new LinkedHashSet();
		
		//s.add(68);
		//s.add(42);
		//s.add("Sarika");
		//s.add(null);
		//s.add(42);
		
		s1.add(68);
		s1.add(42);
		s1.add("Sarika");
		s1.add(null);
		s1.add(42);
		
		//System.out.println(s);
		//System.out.println(s1);
		
		//System.out.println(s1.size());
		

		
		for(Object o : s1) {
			System.out.println(o);
		}
		
		
	}
	
	
}
