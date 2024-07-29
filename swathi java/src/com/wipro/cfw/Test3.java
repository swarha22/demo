package com.wipro.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test3 {
		
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add(46);
		s.add(0);
		s.add(-1);
		s.add(100);
		s.add(265);
		
		
		//s.add(null);  null pointer exception
		
		
		//s.add("siva");
		//s.add("swathi");
		//s.add("kavya");
		//s.add("siri");
		//s.add("kumar");
		
		System.out.println(s);
		
		for (Object o : s)
		{
			System.out.println(o);
		}
		
	}
} 
