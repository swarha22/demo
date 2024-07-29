/**2. Write a program which accepts a number as input and check whether the given

number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25. b. Print success and failure
messages for all 3 conditions
Input: 2468642
Output: 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output: 12345654321 is palindrome and sum of even numbers is less than25 **/
package assignmentone;
import java.util.Scanner;
public class polindrome {
	   public static void main(String[]args) {
	long r,temp, sum=0;
	long t1,r1,s_e=0;
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter an  Value : ");
	long n = sc.nextLong();
	temp = n;
	while(n>0)
	{
		r=n%10;
		sum = sum*10+r;
		n = n/10;
	}
		
		t1=temp;
		while(t1>0)
		{
			r1=t1%10;
			if(r1%2==0)
			{
			s_e= s_e+r1;
			}
			t1=t1/10;
		}
		if(temp == sum)
		{
			System.out.println(temp +" is palindrome..");	
			{
				if(s_e>25) {
					System.out.println("the sum of even numbers is greater than 25");
					System.out.println("success");
					}
				else{
					System.out.println("the sum of even numbers is less than25");
					System.out.println("failure");
					}}}
			
		else
			{
						System.out.println(temp +" is not palindrome");
					}}}