package condition;

public class main07 {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch (grade) {
			case 'A' :
				System.out.println("91-100점 사이");
				break;
			case 'B' :
				System.out.println("81-90점 사이");
				break;
			case 'C' :
				System.out.println("71-90점 사이");
				break;
			default:
				System.out.println("70점 이하입니다.");
				break;
		}

	}

}
