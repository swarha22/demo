

package assignmenttwo;

import java.util.Scanner;

public class Calculator 
{ 
 private static Scanner scan; 
 int firstValue; 
 int secondValue; 
 int operator; 
 public static void main(String[] args) { 
 scan = new Scanner(System.in); 
 new Calculator().getValues(scan); 
 } 
 public void getValues(Scanner scan)
 { 
 char repeat; 
 do { 
 System.out.println("Enter the first number :"); 
 firstValue =scan.nextInt(); 
 System.out.println("Enter the second number :"); 
 secondValue =scan.nextInt(); 
 System.out.println("Enter the number beside the operation toperform : \n" 
 +"1.Add \n" 
 +"2.subtract \n" 
 +"3.Multiply \n" 
 +"4.Divide"); 
 operator =scan.nextInt(); 
 String result=new 
Calculator().calculate(firstValue,secondValue,operator); 
 System.out.println(result); 
 System.out.println("Do u want to try again(y/n)"); 
 repeat =scan.next().charAt(0); 
 if (repeat == 'n') 
 System.exit(0); 
 }while(repeat == 'y'); 
 } 
 public String calculate(int firstValue, int secondValue,int operator)
 { 
 int result=0; 
 String output=""; 
 switch(operator) { 
 case 1 : 
 result=firstValue+secondValue; 
 output=firstValue+" "+"+"+" "+secondValue+" "+"="+" "+result; 
 break; 
 case 2 : 
 result=firstValue-secondValue; 
 output=firstValue+" "+"-"+" "+secondValue+" "+"="+""+result; 
break; 
 case 3 : 
 result=firstValue*secondValue; 
 output=firstValue+" "+"*"+" "+secondValue+" "+"="+""+result; 
 break; 
 case 4 : 
 if(secondValue!=0) 
 { 
 result=firstValue/secondValue; 
 output=firstValue+" "+"/"+" "+secondValue+" "+"="+""+result; 
 } 
 else { 
 output="The divider (secondValue) cannot be zero"; 
 } 
 break; 
 default: 
 output="Entered wrong option"+" "+Integer.toString(operator); 
 } 
 return output; 
 } 
} 
