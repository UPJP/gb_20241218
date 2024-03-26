package exception;

public class Main01 {
	public static void main(String[] args) {
		// wrapper 클래스 사용하여 문자열을 int형으로 변환
		// 문자열의 숫자 변환에 아무런 문제가 없다.
		String year1 = "1980";
		int age1 = 2024 - Integer.parseInt(year1);
		System.out.println(age1);
		
		String year2 = "1980ㅏ";
		int age2 = 2024 - Integer.parseInt(year2);
		System.out.println(age2);
		
		System.out.println("=======프로그램종료=======");
		
		/*
		 * 예외상황 발생
		 *  - Java프로그램은 예외 상황을 만나면 그 즉시
		 *  실행을 중단하고 강제 종료된다.
		 *  - 때문에 이 프로그램의 맨 마지막에 출력하려는 메시지는
		 *  표시되지 않는다. 
		 */
	}
}
