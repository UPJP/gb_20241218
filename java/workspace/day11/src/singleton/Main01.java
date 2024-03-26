package singleton;

public class Main01 {
	public static void main(String[] args) {
		Calc cl =Calc.getInstance();
		cl.plus(10, 20);
		
		Calc c2 =Calc.getInstance();
		c2.minus(20, 10);
	}
}
