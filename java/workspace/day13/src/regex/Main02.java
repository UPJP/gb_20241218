package regex;

import kr.co.codingbox.stuey.helper.RegexHelper;

public class Main02 {

	public static void main(String[] args) {
		String name = "김자바";
		String age = "19";
		String email = "user@java.com";
		String phone = "01012345678";
		
		// validation 처리
		System.out.println("회원가입 절차를 진행합니다. ");
		
		if( !RegexHelper.getInstance().isKor(name) ) {
			System.out.println("이름은 한글로 입력해 주세요");
			return;
		}
		
		if( !RegexHelper.getInstance().isNum(age) ) {
			System.out.println("나이는 숫자로 입력해 주세요");
			return;
		}
		
		if( !RegexHelper.getInstance().isEmail(email) ) {
			System.out.println("이메일 형식이 잘못된 형식입니다.");
			return;
		}
		
		if( !RegexHelper.getInstance().isPhone(phone) ) {
			System.out.println("휴대폰 번호 형식이 잘못된 형식입니다.");
			return;
		}
		
	}

}







