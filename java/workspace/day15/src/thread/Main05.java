package thread;

public class Main05 {
	public static void main(String[] args) {
		Bank th1 = new Bank("ATM");
		Bank th2 = new Bank("은행");
//		Bank th3 = new Bank("신용카드");
		
		th1.start();
		th2.start();
//		th3.start();
		
	}
	
}
