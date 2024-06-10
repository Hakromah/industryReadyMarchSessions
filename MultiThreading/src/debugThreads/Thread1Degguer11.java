package debugThreads;

public class Thread1Degguer11 extends Thread {
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		System.out.println("main Thread started");

		Thread1Degguer11 t1 = new Thread1Degguer11();
		Thread1Degguer11 t2 = new Thread1Degguer11();

		t1.start();
		t2.start();

		System.out.println("main Thread doane with its work");

	}

}
