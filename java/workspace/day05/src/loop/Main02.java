package loop;

public class main02 {
	public static void main(String[] args) {
		// 1.
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		// 2.
		for (int i = 1; i < 9; i++) {
			for (int j = i; j < 9; j++) {
				System.out.print("*");
			} System.out.println();

		}
		System.out.println("=================");
		
		
		//3.
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		System.out.println("=================");
		//4. 센세 방법
			for(int i = 7; i >= 0; i--) {
				for(int j = i; j<=7; j++) {
					System.out.print("*");
				}System.out.println();
			}
		
	}
		
}
