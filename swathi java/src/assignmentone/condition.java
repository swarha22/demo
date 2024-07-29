
/**1. Write a program which accepts an integer number as input from the user and
perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30 
b. Print Jerry, if number is even and exists between 20 and 30  *******/ 

package assignmentone;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
    	Scanner s1 = new Scanner(System.in);
    	System.out.println("enter a number");
    	int a = s1.nextInt();
    	
    		if(a>=20 && a<=30) {
    			if(a%2!=0) {
    				System.out.println("Tom");
    				
    			}
    			else {
    				System.out.println("Jerry");
    				
    			}
    		}
    }
}
