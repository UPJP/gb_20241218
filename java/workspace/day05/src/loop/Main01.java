package loop;

public class main01 {
	public static void main(String[] args) {

		// 구구단 출력

		int sum;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				sum = i * j;
				System.out.println(i + "*" + j + "=" + sum);
			}
			if (i < 9) {
				System.out.println("==========");

			}

			int i1 = 1, j;
//		int sum;
			while (i1 < 10) {
				j = 1;
				while (j < 10) {
					sum = i1 * j;
					System.out.println(i1 + "*" + j + "=" + sum);
					j++;
				}
				System.out.println("================");
				i1++;
			}

		}
	}
}
