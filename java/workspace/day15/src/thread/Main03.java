package thread;

public class Main03 {
	public static void main(String[] args) {
		// Runnable 인터페이스 객체생성과
		// 객체를 매개변수로 하여 스레드 객체 한번에 생성
		Thread th1 = new Thread(new RunnableTest());
		Thread th2 = new Thread(new RunnableTest());
		
		// 동시에 똑같은 숫자가 나온다
		th1.start();
		th2.start();

		// 번갈아 가면서 나온다
		th1.run();
		th2.run();
		
	}
}
	