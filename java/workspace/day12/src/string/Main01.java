package string;

public class Main01 {
	public static void main(String[] args) {
		// 객체생성 방법
		String str1 ="자바 Programming";
		String str2 = new String("Java");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		// 문자열의 길이를 조회
		int str1_len = str1.length();	
		int str2_len = str2.length();
		System.out.println("str1_len : "+ str1_len);
		System.out.println("str2_len : "+ str2_len);
		System.out.println("=======================");
		// 특정 문자열이 처음으로 나타나는 위치를 조회
		int str1_pos = str1.indexOf(" ");
		int str2_pos = str1.indexOf("a");
		System.out.println("str1_pos : " +str1_pos);
		System.out.println("str2_pos : " +str2_pos);
		System.out.println("=======================");
		
		// A를 B로,변경하기
		String new_str1 = str1.replace(" ","-");
		String new_str2 = str2.replace("a","A");
		System.out.println("new_str1 : " +new_str1);
		System.out.println("new_str2 : " +new_str2);
		System.out.println("=======================");
		
		//대소문자
		String upper = new_str2.toUpperCase();
		String lower = new_str2.toLowerCase();
		System.out.println(new_str2);
		System.out.println("upper : "+ upper);
		System.out.println("lower : "+ lower);
		System.out.println("=======================");
		
		//문자열 앞뒤 공백 제거
		String input = "  enho eee zzzz     pa a i sun    h aha"; 
		String output = input.trim();
		System.out.println("input : "+ input);
		System.out.println("output : "+output);
		
		String output2 = input.replace(" ","");
		System.out.println("output2 : "+output2);
		System.out.println("=======================");
		
		//문자열 비교 
		boolean isSam = str1.equals(str2);
		if(isSam) {
			System.out.println("같다");
		}else {System.out.println("다르다");}
		System.out.println("=======================");
		
		//문자열 자르기
		// -첫번째 파라미터 : 시작위치
		// - 두번째 파라미터 : 끝 위치
		String sub_str1 = str1.substring(0,2);
		System.out.println(str1);
		System.out.println("sub_str1 : "+ sub_str1);
		// 두번째 파라미터가 없는 경우 끝까지 자른다
		String sub_str2 = str1.substring(3);
		System.out.println("sub_str2 : "+ sub_str2);
		System.out.println("=======================");
		
		
		//형식에 따른 문자열 출력을 위한 String 메서드 사용
		/*
		 *  - %d 	 : 정수
		 *  - %s  	 : 문자
		 *  - %f 	 : float형 소수
		 *  - %3d 	 : 숫자를 3자리로 맞춰서 출력
		 *  - %03d	 : 자릿수가 맞지않으면 0을 출력
		 *  - %3s	 : 문자열 3자리로 맞춰서 출력, 맞지않으면 앞에 공백 출력 (%03s와 같은 형식은 사용불가)
		 */
		int yy = 2024;
		int mm = 1;
		int dd = 5;
		String gender = "남성";
		String result = String.format("%d년 %02d월 %02d일 성별: %s", yy, mm, dd, gender);
		System.out.println(result);
		System.out.println("=======================");
		
		//주어진 글자를 기준으로 잘라내어서 배열로 변환
		String src = "C++/java/C#/Javascript/DB";
		String[] data = src.split("/");
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
