package multi;

public class main04 {
	public static void main(String[] args) {
		
		// 1~100까지의 홀수들의 합
		int i = 0,sum=0;
		while(true) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			if(i > 100) {
				break;
			}
			sum += i;
		}
		System.out.println(sum);
		
		
	}
}
