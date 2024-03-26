package condition;

public class main03 {

	public static void main(String[] args) {
		boolean is_korean = false;

		if (is_korean == true) {
			System.out.println("한국사람입니다.");
		} else {
			System.out.println("No 한국사람");

		}
		// 값 자체가 boolean이므로 성립한다.
		if (is_korean) {
			System.out.println("한국사람입니다.");
		} else {
			System.out.println("No 한국사람");

		}
		// "!" 값을 부정한다 참을 부정하므로 거짓이된다
		if ( !is_korean ) {
			System.out.println("no한국사람입니다.");
		}
	}
}
