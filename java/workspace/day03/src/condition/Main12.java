package condition;

public class main12 {
	public static void main(String[] args) {
		
		int a = 12;
		int mat = (a <= 10) ? a*100 : a; 
		System.out.println(mat);
		
		int hour = 10;
		String tiam = (hour < 12) ? "오전" :"오후" ;
		System.out.println(tiam + "입니다");
		
		
	}
}
