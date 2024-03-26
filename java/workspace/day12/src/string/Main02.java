package string;
import java.util.Scanner;
public class Main02 {
	public static void main(String[] args) {
		/*
		 *  이메일 주소에서 아이디와 도메인을 구별하기
		 *  string, stdent@java.com
		 *  아이디 :@w전까지 
		 *  도메인 : @ 이후 끝까지 -> 
		 *  단 ,split 사용불가
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일을 입력해주세요");
		String email = scan.nextLine();
		
		//"@"가 나타나는 위치 얻기
		int s = email.indexOf("@");
		//전부터 @까지 위치 자르기 
		String email_id =email.substring(0, s);
		//@부터 후 까지 위치 자르기
		String email_domian =email.substring(s+1);
		
		System.out.println(email_id);	
		System.out.println(email_domian);
		scan.close();
	}
}
