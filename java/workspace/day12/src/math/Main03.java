package math;
import kr.co.codingbox.study.helper.*;
public class Main03 {
	public static void main(String[] args) {
		//중복을 허용한 0~9사이의 5자리 인증번호
		// ex: 01159,23788
		
		String authNum = "";
		
		for( int i=0; i<5; i++) {
			authNum += Util.getInstance().random(0, 9);
		}
		System.out.println("인증번호= "+ authNum);
	}
}
