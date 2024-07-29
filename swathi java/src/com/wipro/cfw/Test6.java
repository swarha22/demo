package com.wipro.cfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test6 {
		 public static void main(String[] args) {
			 ArrayList<Integer> al = new ArrayList<Integer>();
			 
			 
			 for(int i=1; i<=15; i++) 
			 {
				 al.add(i);
			 }
			 
			ListIterator<Integer> ltr =al.listIterator();
			System.out.println("Retriving elements of forward direction :");
			while(ltr.hasNext()) {
				System.out.println(ltr.next());
			}
			 
			 System.out.println("Retriving elements of Backward direction :");
			 
			 while(ltr.hasPrevious()) {
				 System.out.println(ltr.previous());
			 }
			 
			 
			// System.out.println(al);
		 }
}
