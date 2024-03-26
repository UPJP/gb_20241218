package object;

class Article {
	int seq;            //글번호
	String subject;		//글제목
	String writer;		//작성자

	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}

}

public class main04 {
	public static void main(String[] args) {

//		Article 클래스 생성
//		필드 seq(글번호),subject(글제목),writer(작성자)
//		-객체 생성시 int, String, String 필수
//		-print () 메서드 셍성해서 글번호, 글제목, 작성자를 각각 출력
//		
//		main()에서 Article 객체 생성 후 print () 출력
		Article aa = new Article(1,"자바첫 게시글" , "자바학생");
		aa.print();
		Article aa2 = new Article(2,"자바2게시글" , "자바학생2");
		aa2.print();
	}
}
