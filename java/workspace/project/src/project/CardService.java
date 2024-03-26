package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class CardService extends AccountService{
	public static void find_Account() {
		Scanner scdd = new Scanner(System.in);
		boolean Exit = false;

		System.out.println("고객님의 계좌번호를 입력하세요: ");
		String accountNumber = scdd.nextLine();

		System.out.println("비밀번호를 입력하세요: ");
		String pwd = scdd.nextLine();

		Account account = find(accountNumber, pwd);
		if (account == null) {
			System.out.println("계좌번호 또는 비밀번호를 정확히 입력해주세요");
			return;
		}
		
		//카드생성 text파일로 대체 
		File f2 = new File("your_account/bangking/card");
		System.out.println("카드 경로 : " + f2.isHidden());
		
		
		final String PATH = "./card.txt";
// section 값을 10000미만의 랜덤값을 받은후 해당 랜덤값을 카드번호에 입력
	    Random random = new Random();
	    int section1 = random.nextInt(10000);
        int section2 = random.nextInt(10000);
        int section3 = random.nextInt(10000);
        int section4 = random.nextInt(10000);
        String cardNumber = String.format("%04d %04d %04d %04d", section1, section2, section3, section4);
		
		String write_string = account.Account_to()+"\n"+"카드번호 = "+cardNumber;

		// 특정 인코딩 방식을 적용
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			out.write(buffer);
			System.out.println("카드 생성 완료 > " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]지정된 경로를 찾을수 없음>>" + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR]파일 저장 실패 >> " + PATH);
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("[ERROR]알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
	
	public static Account find(String AccountNumber,String pwd) {
		for(int i=0; i< index; i++) {
		if (member[i].getAccountNumber().equals(AccountNumber) && member[i].getPwd().equals(pwd)) {
			System.out.println(member[i].Account_to());
			return member[i]; // 계좌를 찾았으면 인덱스 반환
		}
	}
		return null;
	}
}
