package multi;

public class main03 {
	public static void main(String[] args) {
		// 1 55
		int i = 0, sum = 0, gd = 0, md = 0;

		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		while (i < 10) {
			i++;
			sum += i;
		}
		System.out.println(sum);

		// 2 25
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				gd += i;
			}
		}
		System.out.println(gd);
		// 3 30
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				md += i;
			}
		}
		System.out.println(md);

		// 4
		int j = 1, b = 0;
		while (j < 10) {
			b = j * 2;
			System.out.println("2 * " + j + " = " + b);
			j++;
		}

		// 5
		int tree = 0;
		while (tree < 10) {
			tree++;
			System.out.println("나무를 " + tree + "번 찍었습니다.");
			if (tree == 10) {
				System.out.println("나무주거요");
			}
		}
	}
}
