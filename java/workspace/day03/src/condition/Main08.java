package condition;

public class main08 {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
			case 'A' :
				System.out.println("91-100점 사이");
			case 'B' :
				System.out.println("81-90점 사이");
			case 'C' :
				System.out.println("71-90점 사이");
			default:
				System.out.println("70점 이하입니다.");
		}

	}

}
