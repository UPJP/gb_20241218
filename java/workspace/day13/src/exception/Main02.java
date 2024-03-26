package exception;

public class Main02 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for (int i=0; i<5 ;i++) {
			/*
			 * i가 3이 되었을 경우 배열의 크기를 초과하는 위치에 접근 했다는 에러 메세지가 출력된다.
			 */
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
}
