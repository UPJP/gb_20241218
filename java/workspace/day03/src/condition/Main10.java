package condition;

import java.util.Random;

public class main10 {
	public static void main(String[] args) {
		
	    Random random = new Random();
		System.out.println("1. 1은 \"축구\", 2는 \"농구\", "
				+ "3은 \"야구\", 4는 \"배구\" 이외에는 \"배드민턴\"이 출력");
		
		 int num = random.nextInt(5);
	      System.out.println("num : " + num);
		switch(num) {
		 case 1:
			 System.out.println("축구");
			 break;
		 case 2:
			 System.out.println("농구");
			 break;
		 case 3:
			 System.out.println("야구");
			 break;
		 case 4:
			 System.out.println("배구");
			 break;
		 default : 
			 System.out.println("배드민턴");
			 break;
		}
		
		
		int sosu = 4;
		switch (sosu) {
		case 3:
			System.out.println("안녕");
		case 2:
			System.out.println("안녕");
		case 1:
			System.out.println("안녕");
			break;
		default :
			System.out.println("잘가");
			break;
			}
		
	}
}
