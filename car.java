
public class car {
       String make = "Lamborghini";
       String model = "2024 Lamborghini Huracan";
       int year = 2024;
          public void displayInfo() {
        	  System.out.println("car make is :" +make +".");
        	  System.out.println("car model is :" + model +".");
        	  System.out.println("car year is :" + year + ".");
        	  
        	  }
          public static void main(String[] args) {
        	  car c = new car();
        	  c.displayInfo();
          }
}
