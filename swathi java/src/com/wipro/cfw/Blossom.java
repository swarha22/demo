package com.wipro.cfw;


import java.util.SortedSet;
import java.util.TreeSet;

public class Blossom {
			public static void main(String[] args) {
				Flowers f1 = new Flowers();
				f1.setName("Rose");
				f1.setRating(10);
				
				Flowers f2 = new Flowers();
				f2.setName("Jasmine");
				f2.setRating(9);
				
				Flowers f3 = new Flowers();
				f3.setName("Lily");
				f3.setRating(8);
				
				Flowers f4 = new Flowers();
				f4.setName("Lotus");
				f4.setRating(7);
				
				
				SortedSet <Flowers> s1 = new TreeSet();
				
				s1.add(f1);
				s1.add(f2);
				s1.add(f3);
				s1.add(f4);
				
				
				for(Flowers f : s1) 
				//Flowers f = new Flowers();
				{
					System.out.println(f.getName() + " " + f.getRating());
				}
				
			}
}
