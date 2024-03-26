package kr.co.codingbox.stuey.helper;

import java.util.regex.Pattern;

public class RegexHelper {
	//싱글톤 
	private static RegexHelper dd;
	
	public static RegexHelper getInstaace() {
		if (dd == null) {
			dd = new RegexHelper();
		}
		return dd;
	}
	
	public static void freeInstance() {
		dd = null;
	}
	private RegexHelper() {super();}
	//--싱글톤
	//valldation 처리 method를 정의
	/*
	 *  1. 숫자 모양에 대한 형식검사(isNum)
	 *  @parma 	:str - 검사할 문자열 
	 *  @return : boolean - 형식에 맞을 경우 true,맞지 않을경우 false
	 *  
	 *  2. 한글 모양에 대한 형식검사(isKor)
	 *  @parma 	:str - 검사할 문자열 
	 *  @return : boolean - 형식에 맞을 경우 true,맞지 않을경우 false
	 *  
	 *  3.이메일 모양에 대한 형식검사(isEmail)
	 *  @parma 	:str - 검사할 문자열 
	 *  @return : boolean - 형식에 맞을 경우 true,맞지 않을경우 false
	 *  
	 *  4.전화번호 모양에 대한 형식검사(isPhone)
	 *  @parma 	:str - 검사할 문자열 
	 *  @return : boolean - 형식에 맞을 경우 true,맞지 않을경우 false
	 *    
	 */
	
	public boolean isNum(String str) {
		return Pattern.matches("^[0-9]*$", str);
	}
	public boolean isKor(String str) {
		return Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
	}
	public boolean isEmail(String str) {
		return Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
	}
	public boolean isPhone(String str) {
		return Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
	}
	
}
