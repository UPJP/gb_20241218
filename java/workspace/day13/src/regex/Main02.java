package regex;
import java.util.regex.Pattern;


public class Main02 {
	public static void main(String[] args) {
		// 학원가입시에 입력한 대응을 가정하ㄴ경우
		String name = "김자바";
		String age = "19";
		String email = "user@javas.com";
		String phone = "0101234578";
		
		
		//한글 여부 검사
		
		boolean isKor = 
			Pattern.matches("^[ㄱ-ㅎ가-힣]*$",name);
		
		if(!isKor ) { //isKor == false
			System.out.println("이름은 한글로 입력해주세요");
			/*
			 * 실행도중 return을 만나면 즉시 중단
			 * void형은 return 
			 */
			return;
		}
		boolean isNum = 
				Pattern.matches("^[0-9]*$",age);
		if(!isNum ) { //isNum == false
			System.out.println("나이는 숫자로만 입력해주세요");
			return;
		}
		
		//이메일 검사
		boolean isEmail = 
				Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$",email);
		if(!isEmail) { //isEmail == false
			System.out.println("이메일 형식이 맞지 않습니다.");
			return;
		}
		//핸드폰 형식 검사
		boolean isphone = 
				Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$",phone);
		if(!isphone) { //isphone == false
			System.out.println("전화번호 형식이 맞지 않습니다.");
			return;
		}
		System.out.println("회원가입 절차를 진행합니다.");
	}
}

