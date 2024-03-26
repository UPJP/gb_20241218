package val;

public class Main02 {

	public static void main(String[] args) {
		// 변수의 선언
		int num1; 
		// 변수의 할당
		num1 = 100;
		
		System.out.println("num1 : " + num1 + " 입니다.");
		
		// 변수의 선언과 할당
		boolean b = true;
		System.out.println("b : " + b);
		
		System.out.println("================");
		
		String language = "JA" + "VA";
		System.out.println("language : " + language);
		
		int age = 20;
		String name ="자바학생";
		String result = name + age;
		System.out.println(result);

		System.out.println("================");
		
		boolean iskorean = true;
		System.out.println("iskorean :" + iskorean);
		
		// char는 홈따옴표(')로 감싸진 한 글자만 대입할수 있다.
		char first ='이';
		System.out.println("first : " + first);
		System.out.println("================");
		
		long num2 = 123456789000000L ;
		double num3 = 128.4;
		float num4 = 3.14F;
		
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
		
		System.out.println("================");
		
		 int num10 =100;
		 num10 =200;
//		 int num10 = 500;
		 // 변수명 중복으로 오류 발생
		 System.out.println(num10);

		 int num11 =100;
		 num11 =200;
		 // 선언되지 않은 변수이므로 에러  // 출력x
		 int num12 = 500;
		
		 System.out.println("================");
		 
			int num15;
			// 할당되지 않은 변수를 대입하였으므로 에러 
//			int num16 = num15 ;
			// 할당되지 않은 변수를 출력하였으므로 에러 
//			System.out.println(num15);
		
		
	}

}
