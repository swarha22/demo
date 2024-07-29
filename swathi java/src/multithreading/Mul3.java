package multithreading;

public class Mul3 extends Thread {
		public void run() {
			for(int i=1; i<=6; i++) {
				System.out.println(Thread.currentThread().getName() + "---->" + i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		public static void main(String[] args) {
			Mul3 m3 = new Mul3();
			m3.setName("Swathi");
			
			 Mul3 m4 = new Mul3();
			 m4.setName("Kalluri");
			 
			 m3.start();
			 m4.start();
		}
		
}
