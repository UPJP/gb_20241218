package operator;

public class main05 {
	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 456;
		
		//비교연산자에 대한 결과는 boolean 이다
		boolean result1 = num1 == num2 ;
		System.out.println("result1 : " + result1);
		boolean result2 = num1 != num2 ;  // true
		System.out.println("result2 : " + result2);
		boolean result3 = num1 < num2 ;   // true
		System.out.println("result3 : " + result3);
		boolean result4 = num1 <= num2 ;  // true
		System.out.println("result4 : " + result4);
		boolean result5 = num1 > num2 ;   //false
		System.out.println("result5 : " + result5);
		boolean result6 = num1 >= num2 ;  //false
		System.out.println("result6 : " + result6);
		
	}

}
