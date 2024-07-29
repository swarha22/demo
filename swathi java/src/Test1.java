
public class Test1 {
	int a,b;
	
	public Test1(int x, int y) {
		a = x;
		b = y;
	}
	public void sum() {
		System.out.println("sum is :" + (a+b));
	}
	public static void main(String[] args) {
		Test1 obj = new Test1(10,15);
		obj.sum();
	}
}
