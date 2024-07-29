package com.wipro.cfw;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Test1 {
	public static void main(String[] args) {
		List al = new ArrayList();
		//List ll = new LinkedList();
		
		//l.add(Integer.valueOf(45));
		//l.add(new String("Siri"));
		//l.add(Boolean.valueOf(true));
		//l.add(Character.valueOf('s')); 
		//l.add(null);
		//l.add(null);
		//l.add(Integer.valueOf(42));
		 
		
		al.add(45);
		al.add("Siri");
		al.add(null);
		al.add(true);
		
		//ll.add(45);
		//ll.add("Siri");
		//ll.add(null);
		//ll.add(true);
		
		//System.out.println(ll);
		//System.out.println(ll.size());
		//System.out.println(ll.contains("Swathi"));
		//System.out.println(ll.get(3));
		
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Swathi"));
		System.out.println(al.get(3));
		//System.out.println(al.get(6));
		
		
		
		for (Object o : al) {
			System.out.println(o);
		}
	}
}
