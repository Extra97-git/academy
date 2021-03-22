package by.academy.classwork.lesson14;

public class HelloThread extends Thread {

	public void doesStuff() throws Exception {
		for(int i = 10; i > -1; i--) {
			System.out.println("-");
			Thread.sleep(1000);
		}
	}
}
