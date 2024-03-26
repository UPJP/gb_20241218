package string;

public class Main05 {
	public static void main(String[] args) {
		/*
		 *  D:/photo/2023/travel/food.jpg 라는 파일이 있다.
		 *  이 파일의 경로를 "data"라는 객체로 생성한뒤 다음 형태로 출력하시오
		 *  (split() 메서드 사용금지)
		 *  
		 *  ----------------------------------------
		 *  [출력결과]
		 *  파일이름: food
		 *  확장아 : jpg
		 *  폴더명 : D:/photo/2023/travel
		 */
		String data = "D:/photo/2023/travel/food.jpg";
		// 파일 이름 추출
		String name = data.substring
				(data.lastIndexOf("/")+1,
						data.lastIndexOf("."));
		System.out.println("파일이름 : " + name);
		
		//확장자 추출
		String ext = data.substring(data.indexOf(".")+1);
		System.out.println("확장자 : "+ ext);
		
		//소스파일의 폴더이름 추출
		System.out.println("폴더명 : "+
				data.substring(0,data.lastIndexOf("/")));
		
	}
}
