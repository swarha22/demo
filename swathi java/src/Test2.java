
public class Test2 {
		int a,b;
		
		public Test2() {
			a=50;
			b=70;
		}
		public Test2(int a,int b) {
			this.a = a;
			this.b = b;
		}
		public void sum() {
			System.out.println("sum is : " + (this.a + this.b));
		}
		public static void main(String[] args) {
			 Test2 obj1 = new Test2();
			 obj1.sum();
			 
			 Test2 obj2 = new Test2(100,200);
			 obj2.sum();
		}
}
