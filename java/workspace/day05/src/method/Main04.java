package method;

public class main04 {
	public static void main(String[] args) {
		System.out.println(plus(10, 20));
		int a = plus(20, 30);
		System.out.println(a);

		System.out.println("=================");
		int b = plus(plus(10, 20), 30);
		System.out.println(b);
	}

	public static int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
