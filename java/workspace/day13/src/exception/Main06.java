package exception;

public class Main06 {
	public static void main(String[] args) {

		
		// 사용자의 입력값을 가정
		String[] src = {"10", "2", "aaa", "ccc"};
		
		// src의 내용들을 숫자로 변환해서 저장할 배열
		int[] arr =new int[3];
		
		try{for (int i=0; i<src.length; i++) {
			arr[i] = Integer.parseInt(src[i]);
			System.out.println(arr[i]);
			}
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException 에러가 발생했습니다");
			System.out.println(e.getMessage());
			System.out.println("배열에 올바른 숫자를 입력해주세요");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 에러가 발생했습니다");
			System.out.println(e.getMessage());
			System.out.println("입력값에 오류가 발생하였습니다.");
			
		}catch (Exception e) {
			/*
			 *  예외 종류를 의미하는 모든 클래스는
			 *  java.lang.Exception 클래스를 상속받으므로,
			 *  이 블록은 모든 종류의 예외에 대처할 수있다.
			 */
			System.out.println("예외적 에러가 발생했습니다!");
			System.out.println(e.getMessage());
		}finally {
			// 이 블록은 예외의 발생 여부에 상관없이 무조건실행
			System.out.println("데이터 변환 종료");
		}
		System.out.println("----프로그램 종료----");
	}
}
