package casting;

public class main01 {
	public static void main(String[] args) {
		long l = 100L;
		int i = (int) l;  //명시적 형변환
		short s = (short) i;
		
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println("===============");
		
		double pi1 = 3.14D;
		int pi2 = (int)pi1;
		
		System.out.println(pi1);
		System.out.println(pi2);
		System.out.println("===============");
		
		//'a'에 해당하는 아스키코드
		int num1 = 97;
		char a= (char)(num1+2);
		System.out.println(a);
		
		
		
		
	}	

}
