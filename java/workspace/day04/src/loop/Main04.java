package loop;

public class main04 {
	public static void main(String[] args) {
			int sum = 0;
			int i = 1;	//초기식
		
			do {
				sum += i;
				i++;	//증감식
			}while(i <= 100);
		System.out.println(sum);
	}
}
