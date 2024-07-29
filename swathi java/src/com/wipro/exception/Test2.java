package com.wipro.exception;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test2 {
			public static  void divideNumbers(int x,int y) {				
					try {
						int z = x/y;
						System.out.println("division is ;" + z);
					}
					catch (ArithmeticException ae) {
						System.out.println("for division by zero");
					}
				catch (InputMismatchException ne) {
					System.out.println("for invalid input gracefully");
				}
				//System.out.println("rest statements excecuted")	;
			}
			public static void main(String[] args) {

				divideNumbers(6,3);
				divideNumbers(6,0);
			}
}
