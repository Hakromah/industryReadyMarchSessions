package eclipseDebuggers;

public class Thread1Degguer extends Thread {
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		System.out.println("main Thread started");

		Thread1Degguer t1 = new Thread1Degguer();
		Thread1Degguer t2 = new Thread1Degguer();

		t1.start();
		t2.start();

		System.out.println("main Thread doane with its work");

	}

}
