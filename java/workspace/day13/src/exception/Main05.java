package exception;

public class Main05 {
	// ArrayIndexOutBoundsException
	// try-catch,
	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			for (int i = 0; i < 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("에러가 발생하였습니다.");
			System.out.println(e.getMessage());

		}
		System.out.println("배열출력 : "+arr[2]);
	}

}
