package val;

public class Main03 {

	public static void main(String[] args) {
		// 일반 변수
		int width = 100;
		// 상수
		final double PI = 3.14D;
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);

		//값의 변경
		width = 200;
		//상수(final)은 재할당 불가
	//	PI = 3.151528D;
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
	}

}
