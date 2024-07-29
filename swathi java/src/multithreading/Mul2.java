package multithreading;

public class Mul2 implements Runnable {
			public void run() {
				System.out.println("implimenting runnable");
			}
			public static void main(String[] args) {
				Mul2 m2 = new Mul2();
				m2.run();
			}
}
