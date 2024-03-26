package project;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

// 은행시스템 
public class BankingSystem extends AccountService {

// 해당 계좌를 찾는 메서드
	public static void find_Account() {
		Scanner sc = new Scanner(System.in);
		boolean Exit = false;

		System.out.println("고객님의 계좌번호를 입력하세요: ");
		String accountNumber = sc.nextLine();

		System.out.println("비밀번호를 입력하세요: ");
		String pwd = sc.nextLine();

//accountNumber,pwd 입력값을 받고 find(accountNumber,pwd)메서드를 실행
		Account account = find(accountNumber,pwd);
		if(account == null) {
			System.out.println("계좌번호 또는 비밀번호를 정확히 입력해주세요");
			return;
		}
		
		
		do {
			Scanner scan9 = new Scanner(System.in);
			System.out.println("==== Java 입출금 시스템  ====");
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("0.종료");
			System.out.println("항목을 입력해주세요");

			int key;
			try {
				key = scan9.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
				scan9.next();
				continue;
			}

			switch (key) {
			case 1: // 입금
					Scanner scan8 = new Scanner(System.in);
					
					System.out.println("입금할 금액 : ");
					try {
					int amount =Integer.parseInt(scan8.nextLine());
					account.deposit(amount);
					System.out.println("입금되었습니다.");
					account.printallAccount();
					} catch (Exception e) {
					    System.out.println("유효한 정수를 입력하세요.");
					}
				break;

			case 2:// 출금
				
				Scanner scan7 = new Scanner(System.in);
				System.out.println("출금할 금액 : ");
				try {
				int amount2 =Integer.parseInt(scan7.nextLine());
				account.minus2(amount2);
				System.out.println("출금되었습니다.");
				account.printallAccount();
				} catch (Exception e) {
				    System.out.println("유효한 정수를 입력하세요.");
				}
				break;
			case 0: // 종료
				Exit = true;
				break;
			}
		} while (!Exit);

	}
	//입력값과 member[i] 객채에 해당 값이 일치한지 순회 찾을경우 해당 member[i]인덱스를 반환
	public static Account find(String AccountNumber,String pwd) {
		for(int i=0; i< index; i++) {
		if (member[i].getAccountNumber().equals(AccountNumber) && 
				member[i].getPwd().equals(pwd)) {
			System.out.println(member[i].Account_to());
			return member[i]; // 계좌를 찾았으면 인덱스 반환
		}
	}
		return null;
	}
	
	

}