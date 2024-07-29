
/**4. Write a program to find whether input integer is Unique or not. A Unique number is a 
positive integer (without leading zeros) with no duplicate digits. For example, 7, 135, 214 are all 
unique numbers whereas 33, 3121, 300 are not. **/

package assignmentone;

import java.util.Scanner; 
	
	public class Unique { 
	public static boolean isSame(int number) { 
	 boolean[] digits = new boolean[9]; 
	 while (number > 0) { 
	 int dg = number % 10; 
	 if (digits[dg]) { 
	 return false; 
	 } 
	 digits[dg] = true; 
	 number =number/ 10; 
	 } 
	 return true; 
	 
	} 
	 public static void main(String[] args) { 
	 Scanner scanner = new Scanner(System.in); 
	 System.out.println("Enter an integer: "); 
	 int a = scanner.nextInt(); 
	 if (isSame(a)) { 
	 System.out.println(a + " is a unique number."); 
	 } else { 
	 System.out.println(a + " is not a unique number."); 
	 } 
	 } 
	 
	} 
	

