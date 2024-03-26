package loop;

public class main06 {
	public static void main(String[] args) {
		
		int max = 100;
		
		while( max > 100) {
			System.out.println("while문 실행");
		}
		
		do {
			System.out.println("do~while문 실행");
		}while(max > 100);
		//최초 1회는 무조건실행
	}
}
