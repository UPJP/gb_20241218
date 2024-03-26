package object;

class Book {
	String Subject;
	String Countinu;
	//생성자 -> 객체가 생성될때 , 처음으로 실행되는 특수한 메서드
	// 리턴형 명시하지 않고, 클래스와 이름이 동일
	Book(){
		System.out.println("==생성자 실행됨==");
		this.Subject ="자바입문";
		this.Countinu="자바는 객체지향 언어이다.";
	}
}

public class main02 {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.Countinu);
		System.out.println(book.Subject);
	}
}
