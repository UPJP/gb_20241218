package condition;

public class main05 {
	public static void main(String[] args) {
		int don =2000;
		boolean card = true;
		
		//1.
		if (don >= 3000) {
			System.out.println("택시탑승");
		}else {
			System.out.println("걸어가라");
		}
		//2. 
		if (don >= 3000 || card) {
			System.out.println("택시탑승");
		}else {
			System.out.println("걸어가자");
		}
			
		//3
		int a = 3;
		if (a % 2 == 0 ) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//4 
			int kr,en,mas;
			kr = 800;
			en = 100;
			mas = 101;
			
			if((mas+en+kr)/3 >= 95 ) {
				System.out.println("장학생");
			} 
			if(kr >= 70) {
				System.out.println("국어 : 합격");
			}else  {
				System.out.println("불합격");
			}
		//5
			if(mas >= 90 && mas <= 100) {
				System.out.println("A 학점");
			}else if (mas >= 80 && mas <= 90) {
				System.out.println("B 학점");
			}else if (mas >= 70 && mas <= 80) {
				System.out.println("C 학점");
			}else if (mas >= 60 && mas <= 70) {
				System.out.println("D 학점");
			}else if (mas > 100) {
				System.out.println("오류");
			}else{
					System.out.println("F 학점");
				}
	}
}
