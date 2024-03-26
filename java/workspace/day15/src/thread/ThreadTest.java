package thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
			try {
				for (int i=0 ; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println("Thraed 호출"+i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	}
}
