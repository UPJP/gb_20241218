package loop;

public class main02 {
	public static void main(String[] args) {
		// 1~10 까지 누적된 핪
		int sum = 0;

		int i = 1; //초기값
		while( i <= 100) {
			sum += i;
			i++;
			System.out.println("i : "+i);
			System.out.println("sum : "+sum);
		}
		System.out.println(sum);
	
	}
}

