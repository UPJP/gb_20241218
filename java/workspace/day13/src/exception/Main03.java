package exception;

public class Main03 {
	public static void main(String[] args) {
		int[] arr = new int[3];

		for (int i = 0; i < 5; i++) {
			if (i < arr.length) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
	}
}
