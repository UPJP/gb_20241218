package exception;

public class Main04 {
	public static void main(String[] args) {
		/*
		 *  try-catch 블록으로 예외처리가 적용된 경우에는, 
		 *  에러가 발생하더라고 프로그램 자체가 다운되지 않는다.
		 */
		try {
		String year2 = "1980k";
		int age2 = 2024 - Integer.parseInt(year2);
		System.out.println(age2);
		}catch (NumberFormatException e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("=======프로그램종료=======");
		
		
		
		
	
	}
}
