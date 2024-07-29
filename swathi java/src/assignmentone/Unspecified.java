
//3.Write a program that reads an unspecified number of integer arguments using Scanner 
//Class and adds them together. The program should display the total of the given input 
//number and should only consider integer value.The program should display an error 
//message if there are any non-integer values 
//Input : 12 23 2 4 
// Output : 41 


package assignmentone;

import java.util.Scanner;

public class Unspecified {
	public static void main(String[] args) { 
		 System.out.println("Enter integer numbers separated by spaces :"); 
		
		 Scanner scanner = new Scanner(System.in); 
		 String input = scanner.nextLine(); 
		 
		 int result = calculateSum(input); 
		 if (result != Integer.MIN_VALUE) { 
		 System.out.println("Total value: " + result); 
		 } else { 
		 System.out.println("Error: Non-integer value detected :"); 
		
		 } 
		 
		 scanner.close(); 
		 } 
		 public static int calculateSum(String input) { 
		 Scanner stringScanner = new Scanner(input); 
		 int sum = 0; 
		 
		 while (stringScanner.hasNext()) { 
		 if (stringScanner.hasNextInt()) { 
		 sum += stringScanner.nextInt(); 
		 } else { 
		 stringScanner.close(); 
		return Integer.MIN_VALUE; 
		 } 
		 } 
		 
		 stringScanner.close(); 
		 return sum; 
		 
		 }
		 
		 }

