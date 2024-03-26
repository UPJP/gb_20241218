package project;

//메인화면 
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
// try-do-while 문을 만들어 해당 문장이 ture 값이 나올때까지 무한반복 순환문
// switch를 이용하여 해당 값이 나올떄마다 로직이 이어지며 원하는 값이 나올때까지 반복	
		try {
			boolean Exit = false;
			Scanner scanner = new Scanner(System.in);

			do {
				Scanner scan = new Scanner(System.in);
				System.out.println("==== Java 은행 메뉴 시스템  ====");
				System.out.println("1.계좌서비스");
				System.out.println("2.은행시스템");
				System.out.println("3.카드서비스");
				System.out.println("4.신용등급 확인");
				System.out.println("5.계좌 삭제");
				System.out.println("0.종료");
				System.out.println("항목을 입력해주세요");

				int menu;
				try {
					menu = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
					scanner.next();
					continue;
				}
				switch (menu) {
				case 1:
					AccountService.CreateAccount();
					break;

				case 2: // 은행시스템
					boolean bankingExit = false;
					Scanner mscan = new Scanner(System.in);
					do {
						System.out.println("==== 은행 서비스 관리 시스템 ====");
						System.out.println("1.계좌검색");
						System.out.println("2.모든 계좌 ");
						System.out.println("0.취소");

						try {
							switch (mscan.nextInt()) {
							case 1:// 고객계좌 조회
								BankingSystem.find_Account();
								
								break;

							case 2:// 모든 계좌 검색
								System.out.println("모든 계좌를 출력합니다.");
								AccountService.all_Account();
								break;

							case 0:
								
								bankingExit = true;
								break;
							}
						} catch (InputMismatchException e) {
							System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
							scanner.next();
						}catch(Exception e) {
							System.out.println("오류");
							e.printStackTrace();
						}
					} while (!bankingExit);
					break;

				case 3: // 카드서비스
					CardService.find_Account();
					break;

				case 4: // 대출서비스
					LoanService.find_Account();
					break;

				case 5: // 기타서비스
					UtilityService.find_Account();
					break;

				case 0: // 종료
					System.out.println("종료합니다.");
					Exit = true;
					scan.close();
					break;
				}
				//순환문을 트루
			} while (!Exit);
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
			
		}
	}
}