package casting;

public class main01 {
	public static void main(String[] args) {
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f ;
		
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("====================");
		
		int myage1 = 20;
		double myage2 = myage1;
		System.out.println("myage1 : " + myage1 );
		System.out.println("myage2 : " + myage2 );
		System.out.println("====================");
		
		
		char c1 = 'a';
		int num = c1;
		char b = (char)num;
		System.out.println("num1 : " + num);  //아스키코드
		System.out.println(b);
	}

}
