
public class Rectangle {
      int lenth;
      int width;
        
      public int calculateArea(int L,int b)
      {
    	  lenth =L;
    	  width = b;
    	  return L*b;
      }
      public int calculatePerimeter(int L,int b)
      {
    	 return 2*(L+b); 
      }
       
      public static void main(String[] args)
      {
    	  Rectangle angle = new Rectangle();
    	  System.out.println("Area is :" + angle.calculateArea(5,7));
    	  System.out.println("Perimeter is :" + angle.calculatePerimeter(4,6));
      }
}
