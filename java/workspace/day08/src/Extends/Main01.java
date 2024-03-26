package Extends;

public class main01 {
	public static void main(String[] args) {
		
		QNAArticle qna = new QNAArticle(); 
		
		qna.setNum(1);
		qna.setTitle("첫 질문");
		qna.setAnswer("첫 답변");
		System.out.println(qna.toString());
		
		System.out.println("==================="
				+ "======================");
		FileArticle f = new FileArticle();
		f.setNum(1);
		f.setTitle("첫 번째 자료");
		f.setFileName("day08.zip");
		System.out.println(f.toString());
		
		
	}
}
