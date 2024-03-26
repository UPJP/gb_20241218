package project;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountService  {
	//객체 배열 지정
	static Account[] member = new Account[100];
	static int index = 0;

	public static void CreateAccount() {
		Scanner scanner = new Scanner(System.in);
		boolean cahm = false;
		
		String socialNumber = "";
		String accountNumber = "";
		String name = "";
		String pwd = "";
		
		
		System.out.println("계좌개설을 실행합니다.");

		// 주민번호 만들기
		while (!cahm) {
			cahm = false;
			System.out.println("정확한 주민번호 앞번호 6자리, \"-\"를 붙이고 뒷번호 7자리를 입력해주세요");
			 socialNumber = scanner.nextLine();
			if (!Pattern.matches("^[0-9]{1}$", socialNumber)) {
				System.out.println("올바른 주민번호를 입력해주세요");
					 // 입력값이 해당 주민번호값과 객체배열에 같은 값이 있는지 확인하는
					 //	변수
			}else if(SocialNumber_faund(socialNumber)){
				System.out.println("중복된 주민번호 입니다.");
			}
			else {
				cahm = true;
			}
		}
		
		cahm = false;
		// 계좌번호 만들기 정규표현식 바꿀껏 나중에
		while (!cahm) {
			System.out.println("계좌번호 15자리를 입력해주세요");
			accountNumber = scanner.nextLine();
			if (!Pattern.matches("^[0-9]{1}$", accountNumber)) {
				System.out.println("올바른 계좌번호를 입력해주세요");
				 // 입력값이 해당 계좌번호값과 객체배열에 같은 값이 있는지 확인하는
				 //	변수
			} else if(AccountNumber_faund(accountNumber)){
				System.out.println("중복된 계좌번호 입니다.");
			}else {
				cahm = true;
			}
		}
		
		cahm = false;
		// 이름 생성
		while (!cahm) {
			System.out.println("이름을 입력해주세요");
			name = scanner.nextLine();
			if (!Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name)) {
				System.out.println("한국명 이름만 가능합니다.");
			} else {
				cahm = true;
			}
		}
		cahm = false;

		// 비밀번호 생성
		while (!cahm) {
			System.out.println("비밀번호 4자리를 입력해주세요");
			 pwd = scanner.nextLine();
			if (!Pattern.matches("^[0-9]{4}$", pwd)) {
				System.out.println("올바른 주민번호를 입력해주세요");
			} else {
				cahm = true;
			}
		}
		try {
			//통장 생성
			// 새로운 잔액 생성자 생성
			//socialNumber, accountNumber, name, pwd ,bin 값을 받고 객체배열에 넣으며
			//메서드가 반복될때마다 index값을 증감연산자로 1씩 카운트 올림
			int bin=0 ;
			Account account = new Account(socialNumber, accountNumber, name, pwd ,bin);
			member[index++]= account;
			System.out.println("계좌가 생성되었습니다.");
			System.out.println(account.Account_to()); // 계좌 정보 출력
		} catch (Exception e) {
			System.out.println("에러발생");
			System.out.println(e.getMessage());
		}
	}
	
	//모든 계좌 호출
	//member[i]객체 배열에 값이 없을경우 printallAccount()호출
	public static void all_Account() {
		for(int i =0 ; i<index; i++) {
			if (member[i] != null) {
				member[i].printallAccount();
			}
		}
	}
	
	
	
	
	
	
	
	//객체배열의 주민등록값을 입력값과 비교하는 메서드
	private static boolean SocialNumber_faund(String socialNumber) {
        for (int i = 0; i < index; i++) {
            if (member[i] != null && member[i].getSocialNumber()
            		.equals(socialNumber)) {
                return true;
            }
        }
        return false;
    }
	
	//객체배열의 비밀번호를 입력값과 비교하는 메서드
	 private static boolean AccountNumber_faund(String accountNumber) {
	        for (int i = 0; i < index; i++) {
	            if (member[i] != null && member[i].getAccountNumber().equals(accountNumber)) {
	                return true;
	            }
	        }
	        return false;
	    }
}
