
//Write a program to create an ArrayList of integers. Add ten random integers to the list.
//Write methods to perform the following operations:
//Find the maximum and minimum value in the list.
//Sort the list in ascending and descending order.
//Remove duplicate elements from the list

package Day9;

import java.util.ArrayList;
import java.util.Collections;

public class Arr {
			 public static void main(String[] args) {
				 
				 ArrayList <Integer> al = new ArrayList <Integer>();
				 
				 al.add(11);
				 al.add(13);
				 al.add(12);
				 al.add(15);
				 al.add(14);
				 al.add(16);
				 al.add(17);
				 al.add(18);
				 al.add(20);
				 al.add(19);
				 
				 
				 System.out.println("list = " +al);
				 
				 int max = Collections.max(al);
				 int min = Collections.min(al);
				 System.out.println("Maximum value is :" +max + "\n" + "Minimum value is :" + min);
				 
			 }
}
