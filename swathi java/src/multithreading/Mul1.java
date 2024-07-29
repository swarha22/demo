package multithreading;

public class Mul1 extends Thread{
		public void run() {
			System.out.println("extending thread");
		}
		
		public static void main(String[] args) {
			Mul1 m1 = new Mul1();
			m1.start();
		}
}
