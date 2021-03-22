package by.academy.classwork.lesson14;

public class HelloRunnable implements Runnable {
	public void run() {
		for(int i = 0; i < 11; i++) {
			System.out.println("+");
			try {
			Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("I dont care");
			}
		}
	}
}
