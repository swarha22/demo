
public class Test6 {
			public void sum(int x, int y) {
				System.out.println("sum is :" + (x+y ));
			}
			public static void main(String[] args) {
				Test6 obj = new Test6 ();
				obj.sum(8, 9);
				
				System.out.println(obj.hashCode());
				System.out.println(obj.getClass().getName());
				System.out.println(obj.toString());
				
			}
}
