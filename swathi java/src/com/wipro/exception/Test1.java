package com.wipro.exception;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Test1 {
			public static void main(String[] args) {
				
				try {
					 
					Scanner s = new Scanner (System.in);
					
					System.out.println("Enter firsr number");
					 int fno = s.nextInt();
					System.out.println("Enter second number");
					int sno = s.nextInt();
					int z = fno*sno;
					System.out.println("Multiplication is " + z);
					}
				catch(Exception e) {
					System.out.println(e);
				}
				
				
				
			}
}
