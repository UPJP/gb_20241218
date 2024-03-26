package project;

import java.util.Scanner;
import java.util.Random;

public class LoanService extends AccountService {

	int score;
	String grade;

	public void CreditRating(int score, String grade) {
	        this.score = score;
	        this.grade = grade;
	    }

	public String toString() {
		return "점수: " + score + ", 등급: " + grade;
	}

	// 신용점수에 해당 등급을 나타내주는 메서드
	private static String determineGrade(int score) {
		if (score >= 990) {
			return "1등급";
		} else if (score >= 950) {
			return "2등급";
		} else if (score >= 900) {
			return "3등급";
		} else if (score >= 850) {
			return "4등급";
		} else if (score >= 800) {
			return "5등급";
		} else if (score >= 700) {
			return "6등급";
		} else if (score >= 650) {
			return "7등급";
		} else if (score >= 500) {
			return "8등급";
		} else {
			return "9등급";
		}
	}


// 고객계좌를 받는 메서드
	public static void find_Account() {
		Scanner scz = new Scanner(System.in);
		boolean Exit = false;

		System.out.println("고객님의 계좌번호를 입력하세요: ");
		String accountNumber = scz.nextLine();

		System.out.println("비밀번호를 입력하세요: ");
		String pwd = scz.nextLine();

		Account account = find(accountNumber, pwd);
		if (account == null) {
			System.out.println("계좌번호 또는 비밀번호를 정확히 입력해주세요");
			return;
		}
		
		//신용등급을 만들기위한 객체배열 생성
		CreditRating[] creditRatings = new CreditRating[1];
	    Random random = new Random();
	    
	    // 이 부분에서 find 메서드의 반환값인 Account를 활용하여 해당 계좌의 정보가져옴
	    int randomScore = random.nextInt(1000) + 1;
	    String grade = determineGrade(randomScore);
	    creditRatings[0] = new CreditRating(randomScore, grade);

	    // 해당 계좌의 신용 등급 출력
	    System.out.println("고객님의 신용 등급: " + creditRatings[0]);
	}


	public static Account find(String AccountNumber, String pwd) {
		for (int i = 0; i < index; i++) {
			if (member[i].getAccountNumber().equals(AccountNumber) && member[i].getPwd().equals(pwd)) {
				System.out.println(member[i].Account_to());
				return member[i]; // 계좌를 찾았으면 인덱스 반환
			}
		}
		return null;
	}

}
