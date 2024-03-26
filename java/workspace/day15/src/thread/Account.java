package thread;

public class Account  {
	int balance = 2000;
	
	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			e.printStackTrace();
			}
			balance -= money;
		}
	}
}
