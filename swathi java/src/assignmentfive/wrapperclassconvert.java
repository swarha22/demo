package assignmentfive;


import java.util.Scanner;

public class wrapperclassconvert {
	
 public Object convertToWrapper(Object input) {
	 
	 if (input == null) {
	 return "Give proper primitive type as input";
	 }
	 if (input instanceof Integer) {
	 return Integer.valueOf((int) input);
	 } 
	 else if (input instanceof Double) {
	 return Double.valueOf((double) input);
	 } 
	 else if (input instanceof Float) {
	 return Float.valueOf((float) input);
	 } 
	 else if (input instanceof Long) {
	 return Long.valueOf((long) input);
	 } 
	 else if (input instanceof Short) {
	 return Short.valueOf((short) input);
	 } 
	 else if (input instanceof Byte) {
	 return Byte.valueOf((byte) input);
	 } 
	 else if (input instanceof Boolean) {
	 return Boolean.valueOf((boolean) input);
	 } 
	 else if (input instanceof Character) {
	 return Character.valueOf((char) input);
	 }
	 else {
	 return "Give proper primitive type as input";
	 }
 }
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a value:");
	 if (scanner.hasNextInt()) {
	 int input = scanner.nextInt();
	 System.out.println(new wrapperclassconvert().convertToWrapper(input));
	 }
	 else if (scanner.hasNextDouble()) {
	 double input = scanner.nextDouble();
	 System.out.println(new wrapperclassconvert().convertToWrapper(input));
	 } 
	 else if (scanner.hasNextBoolean()) {
	 boolean input = scanner.nextBoolean();
	 System.out.println(new wrapperclassconvert().convertToWrapper(input));
	 } 
	 else {
	 String input = scanner.next();
	 
	 if (input.length() == 1) {
	 char charInput = input.charAt(0);
	 System.out.println(new wrapperclassconvert().convertToWrapper(charInput));
	 } else {
	 System.out.println("Give proper primitive type as input");
	 }
	 }
	 }
}
