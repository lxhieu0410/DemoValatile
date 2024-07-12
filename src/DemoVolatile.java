public class DemoVolatile extends Thread {
	volatile boolean keepRunning = true;

	public void run() {
		long count = 0;
		while (keepRunning) {
			count++;
		}
		System.out.println("Thread terminated " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoVolatile t = new DemoVolatile();
		t.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.keepRunning = false;
		System.out.println("keepRunning set to false.");
	}
}