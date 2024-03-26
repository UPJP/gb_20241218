package string;
import java.util.Scanner;
public class Main03 {
	public static void main(String[] args) {
		//주민등럭번호 생년 월일 추출기 -> y년 m일 d일 젠더
		// 1or2 -> 19~
		// 3or4 -> 20~
		// 1or3 ->남자
		// 2or4 ->여자
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 주민등록 번호를 입력해주세요");
		String number = scan.nextLine();
		
		String yy = number.substring(0,2);
		String mm = number.substring(2,4);
		String dd = number.substring(4,6);
		String number_back = number.substring(6,7);

		String gender = "남자";
		if(number_back.equals("1")||
				number_back.equals("2")) {
			yy= "19" + yy;
		}else {
			yy= "20" + yy;
		}
		
		if(number_back.equals("2")||
				number_back.equals("4")	) {
			gender = "여자";
		}
		
		System.out.printf("%s년 %s월 %s일 %s",yy,mm,dd,gender);
		//123123 1234567
		
		
	}
}
