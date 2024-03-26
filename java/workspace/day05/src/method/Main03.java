package method;

public class main03 {
	public static void main(String [] args) {	
		// 두 파라미터의 합을 출력하는 메서드를 생성, 호출
//		plus (10 , 20 ); ----> 30
		
		// 두 파라미터의 차를 출력하는 메서드를 생성, 호출
//		plus (10 , 20 ); ----> -10
		
		plus (10,20);
		minus(10,20);
	}
	
	public static void plus(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}
}
