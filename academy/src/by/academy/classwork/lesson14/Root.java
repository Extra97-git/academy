package by.academy.classwork.lesson14;


public class Root {
	public static void main(String[] args) throws Exception {
		HelloThread thread1 = new HelloThread();
		HelloRunnable thread = new HelloRunnable();
		Thread thread2 = new Thread(thread);
		thread2.start();
		thread1.start();
		thread1.doesStuff();
	}
}
