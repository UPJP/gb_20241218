package thread;

public class Main04 {
	public static void main(String[] args) {
		ThreadInterruptTest th
			=new ThreadInterruptTest();
		th.start();
		
		// 3초후에 인터럽트
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt();
	}
}
