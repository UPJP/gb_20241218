package thread;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i< 10 ; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()
							+" Runnable 호출" + i);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
