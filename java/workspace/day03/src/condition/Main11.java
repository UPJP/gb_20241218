package condition;

public class main11 {
	public static void main(String[] args) {
		int a = 0;
		if( 5 < 4) {
			a= 50;
		}else {
			a = 40;
		}
		System.out.println(a);
		System.out.println("-------------");
		
		//삼항연산자
		int b=(5 < 4) ? 50 : 40;
		System.out.println(b);
	}
}
