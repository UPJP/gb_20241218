package object;

class Student{
	// 은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능함
	private String name;
	private int age;
	
	// 간접적으로 접근하기 위한 메서드 추가
	// set.. : 은닉된 멤버변수에 값을 넣는 방법
	public void setName(String name) {
		this.name = name;
	}
	// get.. : 은닉된 멤버변수에 값을 읽는 방법
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
}

public class main06 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("JAVA학생");
		s.setAge(20);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
	}

}




















