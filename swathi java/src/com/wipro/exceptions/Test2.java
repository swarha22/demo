package com.wipro.exceptions;

//with handling the exceptions

public class Test2 {
			 public static void main(String[] args) {
				 int x = 50, y = 0;
				 
				 try {
					 int z = x/y;
					 System.out.println("division is :" + z);
				 }
				 catch (ArithmeticException ae){
					 System.out.println("don't use zero as denominator");
				 }
				 System.out.println("remaining statements excecuted");
			 }
}
