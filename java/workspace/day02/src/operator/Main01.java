package operator;

public class main01 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 8;
		
		int result1 = num1 + num2 ;  // 덧셈
		int result2 = num1 - num2 ;  // 뺄셈
		int result3 = num1 * num2 ;  // 곱셈
		int result4 = num1 / num2 ;  // 몫
		int result5 = num1 % num2 ;  // 나머지
		
		
		System.out.println("12 + 8 : " + result1);
		System.out.println("12 - 8 : " + result2);
		System.out.println("12 * 8 : " + result3);
		System.out.println("12 / 8 : " + result4);
		System.out.println("12 % 8 : " + result5);
		
		//0으로 나누기 
		int num =100;
		int zero = 0;
		int result = num / zero ;
		System.out.println("100 / 0 :" + result);
		

	}

}
