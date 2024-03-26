package project;
//계좌 서비스 
import java.util.Scanner;

public class Account {
	//인스턴스 변수
	private  String SocialNumber; 	//주민번호
	private  String accountNumber;  //계좌번호
	private String name;         	//성함
	private String pwd;  			//비밀번호
	private  int bin; 				//잔고
	
	//디폴트
	public Account() {}
	//-----------------생성자--------------------
	public Account(String socialNumber, String accountNumber, String name, String pwd, int bin) {
		super();
		SocialNumber = socialNumber;
		this.accountNumber = accountNumber;
		this.name = name;
		this.pwd = pwd;
		this.bin = bin;
	}
	public Account(String socialNumber, String accountNumber, 
			String name, String pwd) {	
		this(socialNumber,accountNumber,name,pwd,0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSocialNumber(String socialNumber) {
		SocialNumber = socialNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccount(String name) {
		this.name = name;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setBin(int bin) {
		this.bin = bin;
	}

	public static void crateAccount() {
		
	}
	
	public String getAccountNumber() {
        return accountNumber;
    }

    public String getPwd() {
        return pwd;
    }
    public String getSocialNumber() {
        return SocialNumber;
    }
	//-----------------생성자--------------------

    //모든 계좌 호출
    public  void printallAccount() {
		System.out.printf("이름 : %s ,계좌번호 : %s , 주민등록번호 : %s , 잔고 : %,d원%n"
							,name,accountNumber,SocialNumber,bin);
	}
	//단일 계좌 호출
	public  String  Account_to() {
		return "은행서비스 [성함="+ name + 
				",주민번호=" + SocialNumber + 
				", 계좌번호=" + accountNumber + 
				", 비밀번호=" + pwd + 
				", 잔고=" + bin + "]";
	}
    
	public  void deposit(int amount) {
	bin += Math.abs(amount);
	// 입출금에 입력값을 음수값으로 줬을대 대비

		
	}
	public  void minus2(int amount2) {
	// 잔액<= 0일때 대비
	if(bin < Math.abs(amount2)) {
		System.out.println("잔액이 부족합니다.");
		return;
	}else {
		bin -= Math.abs(amount2);
	}
		
	}

	

	
	
}
