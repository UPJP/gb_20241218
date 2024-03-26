package array;

public class main02 {
	public static void main(String[] args) {
		// 1.

		int sum = 0;
		int[] good = { 22, 3, 8, 12 };
		for (int i = 0; i < good.length; i++) {
			sum += good[i];
		}
		System.out.println(sum);

		// 2.
		int dd = 0, sum2 = 0;
		int[] good2 = { 60, 90, 88 };
		for (int i = 0; i < good2.length; i++) {
			sum2 += good2[i];
			dd = sum2 / 3;
		}
		System.out.println("총합 : " + sum2 + " 평점 : " + dd);

		// 3.
		int[] good3 = { 94, 85, 95, 88, 90 };
		int max = good3[0];
		for (int i = 1; i < good3.length; i++) {
			if (max < good3[i]) {
				max = good3[i];
			}
		}System.out.println("최댓값 : " + max);

		// 4.
		int dd4 = 0, sum4 = 0;
		int[] good4 = { 4, 22, 3, 8, 12 };
		for (int i = 0; i < good4.length; i++) {

			if (good4[i] % 2 == 0) {
				dd4 += good4[i];
			}
			if (good4[i] % 2 == 1) {
				sum4 += good4[i];
			}
		}
		System.out.println("짝수 : " + dd4 + " 홀수 : " + sum4);

	}
}
