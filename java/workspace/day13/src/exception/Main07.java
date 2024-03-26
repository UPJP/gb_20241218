package exception;

public class Main07 {
	public static void main(String[] args) {
		
		String[] src = {"10", "2", "aaa", "ccc"};	

		int[] arr =new int[3];
		
		try{for (int i=0; i<src.length; i++) {
			arr[i] = Integer.parseInt(src[i]);
			System.out.println(arr[i]);
			}
		}catch (NumberFormatException  | NullPointerException e) {
			System.out.println("NumberFormatException 에러가 발생했습니다");
			System.out.println(e.getMessage());
			System.out.println("배열에 올바른 숫자를 입력해주세요");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 에러가 발생했습니다");
			System.out.println(e.getMessage());
			System.out.println("입력값에 오류가 발생하였습니다.");
			
		}catch (Exception e) {

			System.out.println("예외적 에러가 발생했습니다!");
			System.out.println(e.getMessage());
		}finally {

			System.out.println("데이터 변환 종료");
		}
		System.out.println("----프로그램 종료----");
	}
}
