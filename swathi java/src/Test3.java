
public class Test3 {
			int a,b;
			public Test3(){
				
				this(500,600);
				a = 300;
				b = 400;
				this.sum();
				
			}
			public Test3(int a, int b) {
				
				this.a = a;
				this.b = b;
				this.sum();
			}
			public void sum() {
				System.out.println("sum is :" + (this.a + this.b));
			}
			public static void main(String[] args) {
				Test3 obj = new Test3();
			}
}
