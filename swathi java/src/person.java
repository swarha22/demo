
public class person {
       String name = "Sahithi";
       int age = 18;
      
       public void Greet()
       { 
    	   System.out.println("Hello, Good Morning " + name + ".");
    	   
       }
       
       public static void main(String[] args) {
       
       person s1 = new person();
       
       System.out.println(s1.name);
       System.out.println(s1.age);
       s1.Greet();
       }
}
