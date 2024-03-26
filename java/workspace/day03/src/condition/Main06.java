package condition;

public class main06 {

	public static void main(String[] args) {
	 int a= 100 ,b= 600,c= 70;
	 
	 
	 if(a > b && a > c) {
		 System.out.println(a);
	}
	 if(b > a && b > c) {
		 System.out.println(b);
	}
	 if(c > a && c > b) {
		 System.out.println(c);
	}
	 
	// 센세 방법
	 int max= 0;
	 
	 if(a > b && a > c) {
		 max = a;
	}else {
		if (b>c ) {
			max = b;
		}else {
			max =c;
		}
	}
	 System.out.println("최댓값은 : "+max);
	}
}
