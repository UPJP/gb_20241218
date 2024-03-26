package string;
import kr.co.codingbox.stuey.helper.*;

public class Main01 {
	public static void main(String[] args) {

		String name = "김자바";
		String age = "19";
		String email = "user@javas.com";
		String phone = "0101234578";
		
		//validetion 처리
		
		System.out.println("계정생성 진행합니다.");
		
		if(!RegexHelper.getInstaace().isKor(name)) {
			System.out.println("이름은 한국어로 해주세요");
			return;
		}
		if(!RegexHelper.getInstaace().isNum(age)) {
			System.out.println("나이는 숫자만 입력해주세요");
			return;
		}
		if(!RegexHelper.getInstaace().isEmail(email)) {
			System.out.println("이메일 형식이 잘못됐습니다.");
			return;
		}
		if(!RegexHelper.getInstaace().isPhone(phone)) {
			System.out.println("핸드폰 번호 형식이 잘못됐습니다.");
			return;
		}
		
		
		
		
	}
}
	