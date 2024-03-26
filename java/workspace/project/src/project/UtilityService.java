package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilityService extends AccountService{

	  public static void find_Account() {
	        Scanner scd = new Scanner(System.in);
	        boolean exit2 = false;

	        System.out.println("고객님의 계좌번호를 입력하세요: ");
	        String accountNumber = scd.nextLine();

	        System.out.println("비밀번호를 입력하세요: ");
	        String pwd = scd.nextLine();

	        Account account = find(accountNumber, pwd);
	        if (account == null) {
	            System.out.println("계좌번호 또는 비밀번호를 정확히 입력해주세요");
	            return;
	        }
            
	        Scanner scan5 = new Scanner(System.in);
	        do {
	            System.out.println("계좌를 삭제 하시겠습니까?");
	            System.out.println("1. 해당 계좌를 삭제한다");
	            System.out.println("2. 취소");

	            int key;
	            try {
	                key = scan5.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
	                scan5.next();
	                break;
	            }

	            scan5.nextLine(); // 여기로 이동

	            switch (key) {
	                case 1: // 삭제
	                    deleteAccount(account);
	                    System.out.println("계좌가 성공적으로 삭제되었습니다.");
	                    exit2 = true;
	                    break;

	                case 2: // 취소
	                    exit2 = true;
	                    break;
	            }
	        } while (!exit2);
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
	// 해당 계좌를 삭제 후 member[i] 객체 배열을 지워주는 과정
	private static void rearrangeArray(int deletedIndex) {
	    for (int i = deletedIndex; i < index - 1; i++) {
	        member[i] = member[i + 1];
	    }
	    member[index - 1] = null;
	    index--;
	}	
	// 해당 계좌를 null값으로 바꿈
	 public static void deleteAccount(Account account) {
	        
	        for (int i = 0; i < index; i++) {
	            if (member[i] == account) {
	                member[i] = null;
	                rearrangeArray(i);
	                return;
	            }
	        }
	    }

}