package kr.co.codingbox.article;

import kr.co.codingbox.myapp.Article;

//import kr.co.codingbox.myapp.Article;

public class Main01 {

	public static void main(String[] args) {
		// 다른패키지의 클래스를 사용하고자 할 경우,
		// 패키지 이름을 포함한 FullName으로 사용해야 한다.
		kr.co.codingbox.myapp.Article a1
		 =new kr.co.codingbox.myapp.Article(1, "제목", "2024");
		
		// 이러한 번거로움을 피하고자 클래스 정의 전에
		// import 구문을 사용하여 특정 클래스의
		// 이름이 어떤 패키지에 소속되어 있는지 명시할 수 있다.
		Article.setCategory("자유게시판");
		
		
		
		
	}

}
