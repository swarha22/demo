package com.wipro.cfw;

//Integer
import java.util.ArrayList;
import java.util.Iterator;

public class Test5 {
			 public static void main(String[] args) {
				 
				 ArrayList<Integer> al = new ArrayList<Integer>();
				 
				 for (int i=1; i<=20; i++) {
					 al.add(i);
				 }
				 
				 Iterator<Integer> itr = al.iterator();
				 while(itr.hasNext()) {
					 int x= itr.next();
					 
					 if(x%2!=0)
					 {
						 //System.out.println(x);
						 itr.remove();
					 }
				 }
				 
				 
				 System.out.println(al);
			 }
}
