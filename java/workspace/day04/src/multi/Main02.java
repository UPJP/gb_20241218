package multi;

public class main02 {
	public static void main(String[] args) {
		int point = 70;
		
		if ( point > 70 && point <= 80) {
         //	System.out.println("C등급입니다.");
		 // 77 초과 :C+ , 74 미만 c- 그외 c0
			if(point > 77) {
				System.out.println("C+등급입니다.");
			}else if(point <74) {
				System.out.println("C-등급입니다.");
			}else {
				System.out.println("C0등급입니다.");
			}
		}
	}
}
