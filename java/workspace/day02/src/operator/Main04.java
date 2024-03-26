package operator;

public class main04 {
	public static void main(String[] args) {
		int a1 = 100;
		int x1 = 6;
		int y1 = a1 + x1++;
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		System.out.println("=================");
		
		int a2 = 100;
		int x2 = 6;
		int y2 = a2 + ++x2;
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
	}
}
